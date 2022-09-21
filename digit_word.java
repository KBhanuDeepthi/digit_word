import java.util.Scanner;

class digit_word{
    
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num==1)
			System.out.println("One");
		else if(num==2)
			System.out.println("Two");
		else if(num==3)
			System.out.println("Three");
		else if(num==4)
			System.out.println("Four");
		else if(num==5)
			System.out.println("Five");
		else if(num==6)
			System.out.println("Six");
		else if(num==7)
			System.out.println("Seven");
		else if(num==8)
			System.out.println("Eight");
		else if(num==9)
			System.out.println("Nine");
		else
			System.out.println("Invalid Number");
	}

}
