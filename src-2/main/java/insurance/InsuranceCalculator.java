package insurance;

public class InsuranceCalculator {
	/**
	 * Calculate the deductible for the client
	 * Base cost is 5000 SEK if the client is above 30 or 
	 * has had a driving licence for more that 5 years and 8000 SEK otherwise
	 * With every accident for that calendar the deductible increases:
	 * 1 accident 	: by 1000 SEK
	 * 2 accidents  : by 2500 SEK
	 * 3 accidents	: by 4000 SEK
	 * 4 accidents and more by : 10000 SEK
	 * If the client if a gold member, then for the first 2 accidents, 
	 * there is no increase
	 * but for 3 accidents and more normal rates apply
	 * 
	 * @param clientId
	 * @return the amount of the deductible
	 * @throws InvalidClientData 
	 */
	int getClientDeductible (Client cl) throws InvalidClientData {
		int deduct = 0;
		if (cl==null) {
			throw new InvalidClientData();
		}else if(cl.numberAccidents < 0) {
			throw new InvalidClientData();
		}else if(cl.age<18) {
			throw new InvalidClientData();
		}else if(cl.yearLicence<0) {
			throw new InvalidClientData();
		}
		
		if(cl.age>30 ||cl.yearLicence>5) {
			deduct += 5000;
		}else {
			deduct +=8000;
		}
		
		if (cl.isGoldMember) {
			if (cl.numberAccidents == 3) {
				deduct += 4000;
			}else if(cl.numberAccidents >= 4) {
				deduct += 10000;
			}
		}else {
			if(cl.numberAccidents == 1) {
				deduct += 1000;
			}else if (cl.numberAccidents == 2) {
				deduct += 2500;
			}else if (cl.numberAccidents == 3) {
				deduct += 4000;
			}else if (cl.numberAccidents >= 4) {
				deduct += 10000;
			}
		}
		
		return deduct;
	}
	
	
	/**
	 * Calculate the monthly cost for the service for the client
	 * First year rate is 500SEK if the client is above 30 or
	 * has had a driving licence for more that 5 years and 600 SEK otherwise
	 * If the car is red the cost goes up by 100SEK
	 * Each additional car adds 200 SEK unless it is red then it adds 300SEK
	 * After the first year, there is a 10% discount 
	 * if there were 0 accidents that year or if the client is a gold member
	 * @param clientId
	 * @return
	 */
	int MonthlyInsuranceCost(Client cl) {
		double rate = 0;
		if(cl.age>30||cl.yearLicence>5){
			rate =500;
		} else {
			rate = 600;
		}
		for(int i=0;i<cl.cars.size();i++){
			if (i==0) {
				if ( cl.cars.get(i).isRed) {
					rate+=100;
				}
			}else {
				rate+=200; 
				if(cl.cars.get(i).isRed) {
					rate+=100;
				}
			}
		}
		if(cl.yearLastAccident>=0) {  //How else know if the have been client for more than 1 year?
			if(cl.yearLastAccident==0 || cl.isGoldMember) {
				rate =rate*0.9;
			}
		}
		
		return (int)rate;
	}
}
