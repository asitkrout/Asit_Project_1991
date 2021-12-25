package mq.java.variables;

import net.bytebuddy.description.modifier.SynchronizationState;

public class String_comparision_Commands 
{
	

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 		=> String is a non-primitive datatype.
		 * 		=> String also called as class,Because String
		 * 			contains set of events to validate stored
		 * 			characters..
		 */
		
		int a=100;
		String name="sunil";
		
		String act_result="Create Account";
		String Exp_result="Create Account";
		
		/*
		 * Equals:-->
		 * 			Method verify equal comparision between two strings
		 * 			and return boolean value true/false 
		 * 
		 * 			Note:--> In Equals method comparison is casesensitive
		 */
		
		boolean flag=act_result.equals(Exp_result);
		System.out.println("Equal Compairation-->"+flag);
		

		/*
		 * EqualIgnorecase:-->
		 * 			Method verify equal comparision between two string 
		 * 			by ignoring casesensitive
		 */
		
		boolean flag1=act_result.equalsIgnoreCase(Exp_result);
		System.out.println("equals compairation--->"+flag1);
		
		/*
		 * contains:-->
		 * 			Method verify sub string characters available at main String
		 * 			and return boolean value true/false
		 */
		
		String status="account 100 created successfully";
		boolean flag2=status.contains("100");
		System.out.println("Sub String Status Available is---.."+flag2);
		

		/*
		 * subString:-->
		 * 		  method get subString characters from main string
		 */
		
		String AccountNum="100045201110254";
		String New_AcNo=AccountNum.substring(4);
		String Middle_AcNo=AccountNum.substring(4, 8);
		System.out.println("Real Account No--->>>"+New_AcNo);
		System.out.println("Middle Account no----.."+Middle_AcNo);
		
		/*
		 * length:-->
		 * 		method return number of characters available with in string
		 * 		in integer format
		 */
		
		String mobile="7978312970";
		int len=mobile.length();
		System.out.println("mobile length--->>>"+len);
		
		/*
		 * trim:--> Trim extra space from left and right side of string
		 */
		
		String Zip_code="    756048    ";
		System.out.println("Before Trim --->>"+Zip_code.length());
		String New_Zip_Code=Zip_code.trim();
		System.out.println("after trim----...."+New_Zip_Code.length());
		
		/*
		 * isempty:-->
		 * 		Metod verify the give string hava characters or not
		 * 		and return boolean value true/false
		 */
		
		String Var1="Hello";
		String Var2="";
		System.out.println("Var1 empty ststus--->>>"+Var1.isEmpty());
		System.out.println("Var2 empty status ---..."+Var2.isEmpty());
		
		/*
		 * ToUppercase:-->
		 * 			Method convert all lowercase characters with in string
		 * 			into uppercase
		 */
		String toolname="wEbdRiver";
		System.out.println("toolname is uppercase characters --> "+toolname.toUpperCase());
		
		
		
		/*
		 * ToLowercase:-->
		 * 			Method convert all Uppercase characters with in string
		 * 			into Lowercase
		 */
		String modelname="wEbdRiver";
		System.out.println("modelname is lowercase characters --> "+modelname.toLowerCase());
		
		/*
		  * Startswith:-->
		  * 	Method return boolean value true/false when given string
		  * 	start with expected characters
		  */
		 String IFSC_Code="HDFC12345";
		 boolean flag4=IFSC_Code.startsWith("HDFC");
		 System.out.println("Start with status is --> "+flag4);
		 
		 
		 /*
		  * Endswith:-->
		  * 	Method return boolean value true/false when given string
		  * 	ends with expected characters
		  */
		 boolean flag5=IFSC_Code.endsWith("2345");
		 System.out.println("ends with status is ---> "+flag5);
		
		
		 /*
		  * concat:-->
		  * 	Method club two string
		  */
		 String str1="Hi";
		 String str2="Friends";
		 System.out.println(str1+str2);     //Here plus operator club two strings
		 System.out.println(str1.concat(str2));//Here concat method club two strings
		 
		 
		 /*
		  * Replace:-->
		  * 	meth0d replace existing characters with new character
		  */
		 String cname="MQ-SYS";
		 String new_cname=cname.replace("M", "B");
		 System.out.println(new_cname);
		 System.out.println("replacing sequence of chars -->  "+cname.replace("MQ", "BQ"));
		 
		 System.out.println("Replacing all "+cname.replaceAll("S", "O"));
		 
		 
		 String Name="Asit-Payal";
		 System.out.println("Replacing Srquence -->"+Name.replace("Asit", "Payal"));
		 System.out.println("Replacing Srquence -->"+Name.replace("Payal", "Asit"));
		
		
		
		
		
		

	}

}
