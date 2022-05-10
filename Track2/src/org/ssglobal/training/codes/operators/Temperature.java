package org.ssglobal.training.codes.operators;


public class Temperature {
	
	public float chooseTemperature(int option) {
		float temperature = 0.0F;
		if (option == 0){
			temperature = 50.0F;
		} else if (option == 1) {
			temperature = 60.0F;
		} else if (option == 2) {
			temperature = 70.0F;
		} else if (option == 3){ 
			temperature = 80.0F;
		} 
		return temperature;
		
	}
	
	
	public float chooseTemperatureSwitch(int option) {
		float temperature = 0.0F;
		
		switch(option) {
			case 0:
				temperature = 50.0F;
				break;
			case 1:
				temperature = 60.0F;
				break;
			case 2:
				temperature = 70.0F;
				break;
			case 3:
				temperature = 80.0F;
				break;
		}
		
		return temperature;
	}
	
	// [0 - 10] -> RED
	// (10 - 20] -> BLUE
	// (20 - 30] -> GREEN
	// OTHWERWISE -> COLORLESS
	
	public String chooseColor(int option) {
		String color = "";
		
		switch(option) {
			
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			default:
				color = "COLORLESS";
				break;
			case 7:
			case 8:
			case 9:
			case 10:
				color = "RED";
				break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 20:
				color = "BLUE";
				break;
			case 21:
			case 22:
			case 30:
				color = "GREEN";
				break;
			
		}
		return color;
	}

}










