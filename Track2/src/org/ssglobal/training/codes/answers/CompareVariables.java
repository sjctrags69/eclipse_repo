package org.ssglobal.training.codes.answers;

public class CompareVariables {
	
	public void comparePrimitive() {
		int x1 = 10;
		int x2 = 20;
		System.out.println(x1 == x2);
		
	}
	
	public void compareRefVar() {
		StringBuilder sb1 = new StringBuilder("Manila");
		StringBuilder sb2 = new StringBuilder("Manila");
		System.out.println(sb1.toString().equals(sb2.toString()));
	}
	
	public void compareStrVal() {
		String str1 = new String("Manila");
		String str2 = new String("Manila");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1 == str2);
	}

}
