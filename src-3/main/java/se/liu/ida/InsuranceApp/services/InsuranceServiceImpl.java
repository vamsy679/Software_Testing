package se.liu.ida.InsuranceApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.liu.ida.InsuranceApp.data.ClientProfile;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private ClientDataManagementService clientDB;
	private int counter;
	
	
	public InsuranceServiceImpl(ClientDataManagementService clientDB) {
		this.clientDB = clientDB;
		counter = 0;
	}
	
	@Override
	public Integer clientNumber() {
		return counter;
	}

	@Override
	public Boolean isClientGoldMember(int clientId) {
		ClientProfile cl = clientDB.findById(clientId);
		return cl.getGoldMember();
	}
	
	@Override
	public Boolean registerNewMember(String lastName, String firstName, int yearOfBirth,
			int yearOfLicence) {
		ClientProfile new_c = new ClientProfile(counter++, lastName, firstName, yearOfBirth, yearOfLicence);
		clientDB.addClientProfile(new_c);
		return true;
	}
	
	@Override
	public int registerNewAccident(int clientId) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Boolean updateDatabase() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getClientDeductible(int clientId) {
		ClientProfile client = this.clientDB.findById(clientId);
		int deduct = 0;
				
		if(2022-client.getYearOfBirth()>30 ||2022-client.getYearOfLicence()>5) {
			deduct += 5000;
		}else {
			deduct +=8000;
		}
		
		if (client.getGoldMember()) {
			if (client.getNumberOfAccidentsThisYear() == 3) {
				deduct += 4000;
			}else if(client.getNumberOfAccidentsThisYear() >= 4) {
				deduct += 10000;
			}
		}else {
			if(client.getNumberOfAccidentsThisYear() == 1) {
				deduct += 1000;
			}else if (client.getNumberOfAccidentsThisYear() == 2) {
				deduct += 2500;
			}else if (client.getNumberOfAccidentsThisYear() == 3) {
				deduct += 4000;
			}else if (client.getNumberOfAccidentsThisYear() >= 4) {
				deduct += 10000;
			}
		}
		return deduct;
	}
	@Override
	public int MonthlyInsuranceCost(int clientId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Boolean addNewCarToMember(int id, String color, int year) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ClientProfile getClientProfile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
