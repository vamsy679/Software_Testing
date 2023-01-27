package insurance;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InsuranceTest {
	
	
		private insurance.InsuranceCalculator insurance;
		private insurance.Client client;

		@BeforeEach
		public void setUp() {
			insurance = new insurance.InsuranceCalculator();
			client = new Client();								
		}

		@Test
		public void test() {
			Assertions.assertEquals(0, 0);
		}
		
		@Test
		public void testException() throws InvalidClientData {		
			client.numberAccidents = -1;
			Assertions.assertThrows(InvalidClientData.class, ()->insurance.getClientDeductible(client));
		} //Do this further down and working there?
		
		/*
		 * Tests for getClientDeductible
		 */
		@Test
		public void TC1() {
			client.age = 31;
			client.yearLicence=3;
			client.isGoldMember=false;
			client.numberAccidents=0;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}
			
		}
		@Test
		public void TC2() {
			client.age = 25;
			client.yearLicence=6;
			client.isGoldMember=false;
			client.numberAccidents=0;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC3() {
			client.age = 25;
			client.yearLicence=2;
			client.isGoldMember=true;
			client.numberAccidents=0;
			try{Assertions.assertEquals(8000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC4() {
			client.age = 24;
			client.yearLicence=4;
			client.isGoldMember=false;
			client.numberAccidents=1;
			try{Assertions.assertEquals(9000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC5() {
			client.age = 26;
			client.yearLicence=5;
			client.isGoldMember=false;
			client.numberAccidents=2;
			try{Assertions.assertEquals(10500, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}
		@Test
		public void TC6() {
			client.age = 27;
			client.yearLicence=1;
			client.isGoldMember=false;
			client.numberAccidents=3;
			try{Assertions.assertEquals(12000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC7() {
			client.age = 28;
			client.yearLicence=0;
			client.isGoldMember=false;
			client.numberAccidents=4;
			try{Assertions.assertEquals(18000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC8() {
			client.age = 32;
			client.yearLicence=7;
			client.isGoldMember=false;
			client.numberAccidents=0;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC9() {
			client.age = 27;
			client.yearLicence=8;
			client.isGoldMember=true;
			client.numberAccidents=0;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC10() {
			client.age = 28;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=1;
			try{Assertions.assertEquals(8000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC11() {
			client.age = 28;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=2;
			try{Assertions.assertEquals(8000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC12() {
			client.age = 28;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=3;
			try{Assertions.assertEquals(12000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC13() {
			client.age = 28;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=5;
			try{Assertions.assertEquals(18000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}
		@Test
		public void TC14() {
			client.age = 35;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=0;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}
		@Test
		public void TC15() {
			client.age = 35;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=1;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC16() {
			client.age = 35;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=2;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC17() {
			client.age = 35;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=3;
			try{Assertions.assertEquals(9000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC18() {
			client.age = 35;
			client.yearLicence=3;
			client.isGoldMember=true;
			client.numberAccidents=6;
			try{Assertions.assertEquals(15000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC19() {
			client.age = 25;
			client.yearLicence=7;
			client.isGoldMember=true;
			client.numberAccidents=1;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC20() {
			client.age = 25;
			client.yearLicence=7;
			client.isGoldMember=true;
			client.numberAccidents=2;
			try{Assertions.assertEquals(5000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC21() {
			client.age = 25;
			client.yearLicence=7;
			client.isGoldMember=true;
			client.numberAccidents=3;
			try{Assertions.assertEquals(9000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC22() {
			client.age = 25;
			client.yearLicence=7;
			client.isGoldMember=true;
			client.numberAccidents=7;
			try{Assertions.assertEquals(15000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC23() {
			client.age = 40;
			client.yearLicence=10;
			client.isGoldMember=true;
			client.numberAccidents=10;
			try{Assertions.assertEquals(15000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC24() {
			client.age = 20;
			client.yearLicence=1;
			client.isGoldMember=false;
			client.numberAccidents=0;
			try{Assertions.assertEquals(8000, insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC25() {
			client.age = 31;
			client.yearLicence=6;
			client.isGoldMember=true;
			client.numberAccidents=0;
			try{Assertions.assertEquals(5000,insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC26() {
			client.age = 31;
			client.yearLicence=6;
			client.isGoldMember=true;
			client.numberAccidents=1;
			try{Assertions.assertEquals(5000,insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC27() {
			client.age = 31;
			client.yearLicence=6;
			client.isGoldMember=true;
			client.numberAccidents=2;
			try{Assertions.assertEquals(5000,insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC28() {
			client.age = 31;
			client.yearLicence=6;
			client.isGoldMember=true;
			client.numberAccidents=3;
			try{Assertions.assertEquals(9000,insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		@Test
		public void TC29() {
			client.age = 31;
			client.yearLicence=6;
			client.isGoldMember=true;
			client.numberAccidents=9;
			try{Assertions.assertEquals(15000,insurance.getClientDeductible(client));
			} catch (InvalidClientData E){
			}

		}	
		/*
		 * Invalid inputs
		 */
		@Test
		public void TCInv30() {
			client.age = 14;
			client.yearLicence=6;
			client.isGoldMember=false;
			client.numberAccidents=0;
			Assertions.assertThrows(InvalidClientData.class, () -> insurance.getClientDeductible(client));
			
		}	
		@Test
		public void TCInv31() {
			client.age = 20;
			client.yearLicence=1;
			client.isGoldMember=false;
			client.numberAccidents=-1;
			Assertions.assertThrows(InvalidClientData.class, () -> insurance.getClientDeductible(client));
			
		}	
		@Test
		public void TCInv32() {
			client.age = 20;
			client.yearLicence=1;
			client.isGoldMember=false;
			client.numberAccidents=-1;
			Assertions.assertThrows(InvalidClientData.class, () -> insurance.getClientDeductible(client));
			
		}	
		@Test
		public void TCInv33() {
			client=null;
			Assertions.assertThrows(InvalidClientData.class, () -> insurance.getClientDeductible(client));
			
		}	
		
		/*
		 * Tests for MonthlyInsuranceCost
		 */
		@Test
		public void TestCase1() {
			client.age = 31;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}	
		@Test
		public void TestCase2() {
			client.age = 29;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}	
		@Test
		public void TestCase3() {
			client.age = 28;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(700,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase4() {
			client.age = 28;
			client.yearLicence = 2;
			Car car1 = new Car();
			car1.id = 1;
			car1.isRed =false;
			Car car2 = new Car();
			car2.id = 2;
			car2.isRed = false;
			client.cars.add(car1);
			client.cars.add(car2);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(800,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase5() {
			client.age = 28;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(540,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase6() {
			client.age = 28;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase7() {
			client.age = 28;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase8() {
			client.age = 32;
			client.yearLicence=7;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 = new Car();
			car2.id = 2;
			car2.isRed = false;
			client.cars.add(car2);
			client.isGoldMember=true;
			client.yearLastAccident=4;
			Assertions.assertEquals(720,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase9() {
			client.age = 32;
			client.yearLicence=7;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 = new Car();
			car2.id = 2;
			car2.isRed = false;
			client.cars.add(car2);
			client.isGoldMember=true;
			client.yearLastAccident=0;
			Assertions.assertEquals(720,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase10() {
			client.age = 32;
			client.yearLicence=7;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase11() {
			client.age = 32;
			client.yearLicence=7;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase12() {
			client.age = 32;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase13() {
			client.age = 32;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase14() {
			client.age = 32;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 = new Car();
			car2.id = 2;
			car2.isRed = false;
			client.cars.add(car2);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(700,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase15() {
			client.age = 32;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 = new Car();
			car2.id = 2;
			car2.isRed = false;
			client.cars.add(car2);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(700,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase16() {
			client.age = 32;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(450,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase17() {
			client.age = 32;
			client.yearLicence=2;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase19() {
			client.age = 25;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase20() {
			client.age = 25;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase21() {
			client.age = 25;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 = new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			Car car3 = new Car();
			car3.id= 3;
			car3.isRed =false;
			client.cars.add(car3);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(900,insurance.MonthlyInsuranceCost(client));
		}	
		@Test
		public void TestCase22() {
			client.age = 25;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 = new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			Car car3 = new Car();
			car3.id= 3;
			car3.isRed =false;
			client.cars.add(car3);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(900,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase23() {
			client.age = 25;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase24() {
			client.age = 25;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase25() {
			client.age = 25;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(450,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase26() {
			client.age = 25;
			client.yearLicence=6;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase27() {
			client.age = 25;
			client.yearLicence=3;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			Car car3 =new Car();
			car3.id= 1;
			car3.isRed =false;
			client.cars.add(car3);
			Car car4 =new Car();
			car4.id= 1;
			car4.isRed =false;
			client.cars.add(car4);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(1300,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase28() {
			client.age = 25;
			client.yearLicence=3;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			Car car3 =new Car();
			car3.id= 1;
			car3.isRed =false;
			client.cars.add(car3);
			Car car4 =new Car();
			car4.id= 1;
			car4.isRed =false;
			client.cars.add(car4);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(1300,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase29() {
			client.age = 25;
			client.yearLicence=3;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =true;
			client.cars.add(car2);
			Car car3 =new Car();
			car3.id= 1;
			car3.isRed =true;
			client.cars.add(car3);
			Car car4 =new Car();
			car4.id= 1;
			car4.isRed =true;
			client.cars.add(car4);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(1600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase30() {
			client.age = 25;
			client.yearLicence=3;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =true;
			client.cars.add(car2);
			Car car3 =new Car();
			car3.id= 1;
			car3.isRed =true;
			client.cars.add(car3);
			Car car4 =new Car();
			car4.id= 1;
			car4.isRed =true;
			client.cars.add(car4);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(1600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase31() {
			client.age = 25;
			client.yearLicence=3;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(630,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase32() {
			client.age = 25;
			client.yearLicence=3;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(700,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase34() {
			client.age = 25;
			client.yearLicence=3;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			Car car3 =new Car();
			car3.id= 1;
			car3.isRed =false;
			client.cars.add(car3);
			Car car4 =new Car();
			car4.id= 1;
			car4.isRed =false;
			client.cars.add(car4);
			Car car5 =new Car();
			car5.id= 5;
			car5.isRed =false;
			client.cars.add(car5);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(1260,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase35() {
			client.age = 25;
			client.yearLicence=3;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(800,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase36() {
			client.age = 36;
			client.yearLicence=10;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase37() {
			client.age = 36;
			client.yearLicence=10;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase38() {
			client.age = 40;
			client.yearLicence=8;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(700,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase39() {
			client.age = 40;
			client.yearLicence=8;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(700,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase40() {
			client.age = 40;
			client.yearLicence=8;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(450,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase41() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			Car car3 =new Car();
			car3.id= 1;
			car3.isRed =false;
			client.cars.add(car3);
			Car car4 =new Car();
			car4.id= 1;
			car4.isRed =false;
			client.cars.add(car4);
			Car car5 =new Car();
			car5.id= 5;
			car5.isRed =false;
			client.cars.add(car5);
			Car car6 =new Car();
			car6.id= 6;
			car6.isRed =false;
			client.cars.add(car6);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(1600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase42() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			Car car3 =new Car();
			car3.id= 1;
			car3.isRed =false;
			client.cars.add(car3);
			Car car4 =new Car();
			car4.id= 1;
			car4.isRed =false;
			client.cars.add(car4);
			Car car5 =new Car();
			car5.id= 5;
			car5.isRed =false;
			client.cars.add(car5);
			Car car6 =new Car();
			car6.id= 6;
			car6.isRed =false;
			client.cars.add(car6);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(1600,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase43() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=0;
			Assertions.assertEquals(540,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase44() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(800,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase45() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(800,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase46() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(630,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase47() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(450,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase48() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=false;
			client.yearLastAccident=1;
			Assertions.assertEquals(500,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase49() {
			client.age = 40;
			client.yearLicence=1;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.isGoldMember=false;
			client.yearLastAccident=-1;
			Assertions.assertEquals(800,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase50() {
			client.age = 25;
			client.yearLicence=8;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.isGoldMember=true;
			client.yearLastAccident=-1;
			Assertions.assertEquals(800,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase51() {
			client.age = 25;
			client.yearLicence=8;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =true;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=0;
			Assertions.assertEquals(540,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase54() {
			client.age = 25;
			client.yearLicence=8;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			Car car2 =new Car();
			car2.id= 2;
			car2.isRed =false;
			client.cars.add(car2);
			client.isGoldMember=false;
			client.yearLastAccident=0;
			Assertions.assertEquals(630,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase55() {
			client.age = 25;
			client.yearLicence=8;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=0;
			Assertions.assertEquals(450,insurance.MonthlyInsuranceCost(client));
		}
		@Test
		public void TestCase56() {
			client.age = 25;
			client.yearLicence=8;
			Car car1 =new Car();
			car1.id= 1;
			car1.isRed =false;
			client.cars.add(car1);
			client.isGoldMember=true;
			client.yearLastAccident=1;
			Assertions.assertEquals(450,insurance.MonthlyInsuranceCost(client));
		}
		
		
		@AfterEach
		public void tearDown() throws Exception{
			insurance = null;
			client = null;
		}
		
}
