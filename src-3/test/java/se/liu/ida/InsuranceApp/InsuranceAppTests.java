package se.liu.ida.InsuranceApp;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; //ADDED
import static org.hamcrest.Matchers.containsString; //ADDED

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import se.liu.ida.InsuranceApp.services.ClientDataManagementService;
import se.liu.ida.InsuranceApp.services.InsuranceServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@ActiveProfiles("mockInsuranceService") // we can choose between different test configurations for different layers
@AutoConfigureMockMvc
public class InsuranceAppTests {
	
	/**
	 * We are going to mock the mvc layer to simplify the setup
	 */
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private InsuranceController ic; 

	@Autowired
	private ClientDataManagementService cm;
	
	@BeforeEach
    public void setup() {
        this.mvc = MockMvcBuilders.standaloneSetup(ic).build();
    }
	
	@Test
	public void test_getClientNumber() throws Exception {
		mvc.perform(
				MockMvcRequestBuilders.get("/getClientNumber")).andExpect(status().isOk());		
	}
	
	@Test 
	public void test_getClientInfo() throws Exception {
		mvc.perform(
				MockMvcRequestBuilders.get("/getClientData", 2)).andExpect(status().isOk());		
	}
	
	/*
	 * Our test cases
	 */
	@Test 
	public void test_get_Monthly_Rate() throws Exception{
		mvc.perform(
				MockMvcRequestBuilders.get("/addNewClient?firstName={firstName}&lastName={lastName}&birthYear={birthYear}&driveYear={driveYear}",
				"Jenny","Thompson", 1990, 2008)).
				andExpect(status().isOk()).andExpect(content().string(containsString("Added new client")));
				
		mvc.perform(
				MockMvcRequestBuilders.get("/addNewCar?clientId={1}&color={2}&year={3}",1,"Red", 1995)).
				andExpect(status().isOk()).andExpect(content().string(containsString("Added new car to client 1")));
		
		mvc.perform(
				MockMvcRequestBuilders.get("/getClientMonthlyRate?id={id}", 1)).andExpect(status().isOk()).
				andExpect(content().string(containsString("600")));	
	}
	
	
	
	@Test 
	public void test_get_Deductible() throws Exception{
		ic.addClient("John", "Smith", 1955, 1990);
		ic.addCar(1, "red", 1995);
		Assertions.assertEquals(5000,ic.getDeductible(2));
	}
	
	/*Previous test, re-made above but also works.
	@Test 
	public void test_get_Monthly_Rate2() throws Exception{
		ic.addClient("Jenny", "Thompson", 1990, 2008);
		ic.addCar(1, "red", 1995);
		ic.getClientNumber();
		Assertions.assertEquals(600, ic.getMonthlyRate(1));
	}
	*/
	
}
