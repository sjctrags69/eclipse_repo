package org.ssglobal.training.codes.declaration;

class MyDataType {
	
	// global variables
	public static final double PIE = 3.141617; // constants can be class var
	public static long versiondId = 1L;
	public static String creature = "vertebrate";
	public static int error_level = 0;
	
	public byte counter;
	public short numProducts;
	public int numCells = 20000;
	public long numTcellsb = 20000L;
	
	public float weight = 0.05F;
	public double billGatesMoney = 0.05;
	
	public char letter;
	public String personName = "";

	public void createVars() {
		// local variables
		int age = 0;
		float salary;
		final float MY_PIE = 90.6F;
		
		System.out.println(counter);
		System.out.println(age);
		System.out.println(letter);
		System.out.println(personName);
	}
	
	public void manageArguments(final float weight, final byte counter) {
		System.out.println(weight);
	}
	
	public void createBlockVarsThruIf(int option) {
		
				
		if (option == 0) {
			int err_val = 10; // block var
			option = option + err_val;
			System.out.println(option);
		}else {
			int otherwise_val = -10;
			option = option + otherwise_val; // block var
			System.out.println(option);
		}
		
		
	}
	
    public void createBlockVarsThruLoop(int[] ids) {
    	
    	for(int i = 0; i < ids.length; i++) {
    	     System.out.println(ids[i]);
    	}
    	
	}
    
    public void createBlockVarsThruSwitch(int option) {
    	
    	switch(option) {
    	  case 1: 
    		float amount = 1000.50F;
    		System.out.println(1);
    		break;
    	  case 2:
    		  
    		System.out.println(2);
      		break;
      	  default:
      		System.out.println(-1);
      		break;
    	
    	}
    
	}
    
    
    public void assignLiterals() {
    	// integral types
    	counter = 127; // within the range -128, 127
    	numProducts = 32000;
    	numCells = 787878878; // default integer type int
    	numTcellsb = 7878788789l; // caused problem: coercion
    	                          // Perl: '2' + 2 == '4'
    	                          // JavaScript = '2' + 2 = '22'
    	                          // === 
    	
    	// real number types
    	billGatesMoney = 9999999999999999.89; // default real type 
    	weight = 89.5f;
    	
    	// character literal types
    	
    	// ASCII - 127
    	letter = 'H';
    	System.out.println(letter);
    	
    	// Numerical value - coercion applies to ASCII only
    	letter = 0; // \0
    	System.out.println(letter);
    	letter = 68;
    	System.out.println(letter);
    	
    	// Unicode characters (UTF-8) - hexadecimal form
    	letter = '\u00F1';
    	System.out.println(letter);
    	
    	// String literals
    	personName = "Juan Luna\n";
    }
    
    public void literalConversion() { // Avoid Pascal Notation
    	numProducts = 10; // identity conversion
    	
    	// widening conversions
    	int amount = 32000; 
    	double salary = 67800.5F;
    	
    	// narrowing conversions
    	byte param = (byte) 128;
    	System.out.println(param);
    	
    	float price = (float) 89.6;
    	System.out.println(price);
    	
    }
}


public class TestMyDataType{
	
	public static void main(String[] args) {
   		MyDataType mdt = new MyDataType();
   	    System.out.println(MyDataType.PIE);
   	    
   	    MyDataType.error_level = -1;
   	    System.out.println(MyDataType.error_level);
   	    mdt.manageArguments(89.6F, (byte) 0);
   	    mdt.manageArguments(75.6F, (byte) 7);
   	    mdt.createBlockVarsThruLoop(new int[]{10, 20, 45, 89});
   		System.out.println(mdt.billGatesMoney); // instance variable
   		
   		mdt.createVars();
   		mdt.assignLiterals();
   		mdt.literalConversion();

	}
}
