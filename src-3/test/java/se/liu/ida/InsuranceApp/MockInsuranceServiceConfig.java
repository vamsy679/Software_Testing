package se.liu.ida.InsuranceApp;



import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import se.liu.ida.InsuranceApp.services.InsuranceService;


@Profile("mockInsuranceService")
@Configuration

 


public class MockInsuranceServiceConfig {
	
	public Integer counter=0;
	
	
	@Bean
	@Primary
	public InsuranceService insuranceService() {	
		InsuranceService is =  Mockito.mock(InsuranceService.class);
		
	
		/** Add mocked behavior */
				 Mockito.when(is.clientNumber())
	       	.thenReturn(10);

	 	 
		  //Added Mock-behaviour
		 Mockito.when(is.registerNewMember("Jenny", "Thompson", 1990, 2008)).thenAnswer(i -> {
			 this.increaseCounter(); 
			 return true; 
			 });
		 
		 Mockito.when(is.registerNewMember("John", "Smith", 1955, 1990)).thenAnswer(i -> {
			 this.increaseCounter();
			 return true;
			 });
			  
		 Mockito.when(is.registerNewMember("Jenny", "Thompson", 1990, 2008)).thenReturn(true);
		 //Could not find why this is needed.
		 
		 Mockito.when(is.registerNewMember("John", "Smith", 1955, 1990)).thenReturn(true);
		 
		 Mockito.when(is.addNewCarToMember(1, "red", 1995)).thenReturn(true);
		 
		 Mockito.when(is.MonthlyInsuranceCost(1)).thenReturn(600);
		 
		 Mockito.when(is.getClientDeductible(2)).thenReturn(5000);
		
		
		 //End added behaviour
		 
		 
		 
		 return is;
	}
	//added help-methods to keep track of how many clients have been added. 
	 public void increaseCounter() {
		 counter = counter + 1;
	 }
	 //Not in use currently.
	 public Integer getCounter() {
		 return counter;
	 }
}

