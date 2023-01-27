package se.liu.ida.InsuranceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import se.liu.ida.InsuranceApp.data.ClientProfile;
import se.liu.ida.InsuranceApp.services.InsuranceService;

@RestController
public class InsuranceController {
	

	@Autowired
	private InsuranceService is;
	
	public InsuranceController(InsuranceService is) {
		this.is = is;
	} 
	
	 @GetMapping("/addNewClient")
	 public String addClient(String firstName, String lastName, Integer birthYear, Integer driveYear) {
		is.registerNewMember(lastName,firstName, birthYear, driveYear);
	    return "Added new client\n";
	}
	 
	 @GetMapping("/addNewCar")
	  public String addCar(int clientId, String color, int year) {
		is.addNewCarToMember(clientId, color, year);
	    return "Added new car to client " + clientId;
	}
	
	  @GetMapping("/getClientData")
	  public ClientProfile getClientById( @RequestParam(defaultValue = "-1", name="id") Integer clientID) {
	    return is.getClientProfile(clientID);
	}
	  
	  @GetMapping("/getClientMonthlyRate")
	  public int getMonthlyRate(@RequestParam(defaultValue = "-1", name="id") int clientID) {
	    return is.MonthlyInsuranceCost(clientID);
	}
	  
	  @GetMapping("/getClientDeductible")
	  public int getDeductible(@RequestParam(defaultValue = "-1", name="id") int clientID) {
	    return is.getClientDeductible(clientID);
	}
	  
	  @GetMapping("/getClientNumber")
	  public String getClientNumber() {
	    return "Number of clients is: " + is.clientNumber();
	}
	 
}
