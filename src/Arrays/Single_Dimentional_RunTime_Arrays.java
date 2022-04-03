package Arrays;

public class Single_Dimentional_RunTime_Arrays {

	public static void main(String[] args) 
	{
		String browser[]= {"chrome","safari","edge","ie","firefox","opera"};
		System.out.println(browser[2]);
		
		int num[]= {100,200,300,400,500,600};
		System.out.println(num[3]);
		
		Object obj[]= {"Iphone",4,4000.00};
		System.out.println(obj[1]);
		
		String PhoneName=(String) obj[0];
		int Quantity=(int) obj[1];
		double Price=(double) obj[2];
		
		System.out.println("Product Name ->"+PhoneName+"  Quantity ->"+Quantity+"  Price ->"+Price);
		
		
		
		
		
		
		
	}

}
