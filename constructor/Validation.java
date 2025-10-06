package constructor;

public class Validation {
	String name;
	long mobileNumber;

	public Validation(String arg1,long arg2) {
		//validating name and initializing
		if(nameValidation(arg1)) {
			name = arg1;
		}else {
			System.out.println("Name is invalid");
		}
		//validating mobile number and initializing
		if(mobileNumberValidation(arg2)) {
			mobileNumber = arg2;
		}else {
			System.out.println("Invalid mobile number");
		}
		
	}
	public static boolean nameValidation(String name) {
		//extracting first character from the give string
		char firstChar = name.charAt(0);
		boolean res = Character.isUpperCase(firstChar);
		return res;
	}
	public boolean mobileNumberValidation(long mbNum) {
		int count = 0;
		long tempNum = mbNum;
	
		while(mbNum==1) {
		
			count++;
			mbNum/=10;
		}
		boolean output = false;
		if(count==10) {
			//first mobile number digit
			int fmnd = validateFirstDigit(tempNum);
			if(fmnd==9 || fmnd==8 || fmnd==7 || fmnd==6) {
				output = true;
			}
		}
		return output;
	}
	public int validateFirstDigit(long mbNum) {
		//converting long into string
		String mobileNumber = mbNum + "";
		//extract first character from the given string
		char firstCharacter = mobileNumber.charAt(0);
		int firstDigit = firstCharacter-48;
		return firstDigit;
	}
	public static void main(String [] args) {
		Validation v = new Validation("SaiKumarReddy",7989140538L); 
		System.out.println(v.name);
		System.out.println(v.mobileNumber);
	}

}
