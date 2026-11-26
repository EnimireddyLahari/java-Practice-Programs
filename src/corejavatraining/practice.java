package corejavatraining;
import java.util.*;




public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//greatest of two num=================================================
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is big");
		}
		else
		{
			System.out.println("b is big");
		}
		//number is pos or neg
		System.out.println("Enter a number:");
		//int a=sc.nextInt();
		if(a>=0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is negative");
		}
		//even or odd
		//int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		//greatest of 3 num
		//int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is big");
		}
		else if(b>c)
		{
			System.out.println("b is big");
		}
		else
		{
			System.out.println("c ia big");
		}
		//person eligible to vote or not
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("you are eligible to vote");
		}
		else
		{
			System.out.println("you are not eligible to vote");
		}
		//leap year
		System.out.println("enter the year:");
		int year=sc.nextInt();
		if((year%4==0 || year%400==0) && year!=100)
		{
		System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		//divisible by 7 and 5
		System.out.println("enter a number:");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		if(a%5==0 && a%11==0 )
		{
			System.out.println("these number is divisible by 5 and 11");
		}
		else if(a%5==0)
		{
			System.out.println("divisible by 5");
		}
		else if(a%11==0)
		{
			System.out.println("divisible by 11");
		}
		else
		{
			System.out.println("none");
		}
		//character is vowel or constant
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='I'||ch=='O'||ch=='E'||ch=='U')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonant");
		}
		//upper case or lower case
		System.out.println("Enter a character:");
		//char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper case");
		}
		else
		{
			System.out.println("Lower case");
		}
		//smallest of two numbers
		System.out.println("enter a number:");
		//int a=sc.nextInt();
		//int b=sc.nextInt();
		//int c=sc.nextInt();
		if(a<=b && a<=c)
		{
			System.out.println("a is small");
		}
		else if(b<=c && b<=a)
		{
			System.out.println("b is small");
		}
		else 
		{
			System.out.println("c is small");
		}
		//divisible by 3 or 7
		System.out.println("enter a number:");
		int n=sc.nextInt();
		if(n%3==0 || n%7==0)
		{
			System.out.println("divisible by 3 or 7");
		}
		else
		{
			System.out.println("not divisible by 3 or 7");
		}
		//SWITCH CASE PRACTICE 
		//calculator
		System.out.println("enter the first number");
		//int a=sc.nextInt();
		System.out.println("enter the second number");
		
		//int b=sc.nextInt();
		System.out.println("enter the symobol which you want to perform the operation:");
		//char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':
		{
			System.out.println("the result of a+b is:"+(a+b));
			break;
		}
		case '-':
		{
			System.out.println("the result of a-b is:"+(a-b));
			break;
		}
		case '*':
		{
			System.out.println("the result of a*b is:"+(a*b));
			break;
		}
		case '%':
		{
			System.out.println("the result of a%b is:"+(a%b));
			break;
		}
		case '/':
		{
			System.out.println("the result of a/b is:"+(a/b));
			break;
		}
		default:
		{
			System.out.println("invalid data");
		}
			
		}
		//vowel
		System.out.println("enter a character:");
		//char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'A':
		{
			System.out.println("vowel");
			break;
		}
		case 'e':
		case 'E':
		{
			System.out.println("vowel");
			break;
		}
		case 'i':
		case 'I':
		{
			System.out.println("vowel");
			break;
		}
		case 'o':
		case 'O':
		{
			System.out.println("vowel");
			break;
		}
		case 'u':
		case 'U':
		{
			System.out.println("vowel");
			break;
		}
		default:
			System.out.println("consonant");
			break;
		}
		//ATM operations
		System.out.println("enter your required number:");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
		{
			System.out.println("Balance enquiry");
			break;
		}
		case 2:
		{
			System.out.println("cash withdrawl");
			break;
		}
		case 3:
		{
			System.out.println("deposit");
			break;
		}
		case 4:
		{
			System.out.println("mini statement");
			break;
		}
		default:
			System.out.println("Inavalid data");
			break;
		
		}
		//number of days in a month
		System.out.println("enter the month whuch you want to know the number of days");
		String str=sc.next();
		switch(str)
		{
		case "january","march","may","july","august","oct","dec":
		{
			System.out.println("it have 31 days");
		    break;	
		}
			
		case "apr","june","sep","nov":
		{
			System.out.println("it have 30 days");
		    break;
		}
			
		case "feb":
		{
			System.out.println("it have 28 days in leap year 29 days");
		    break;
		}
		default:
		{
			System.out.println("invaild data");
			break;
		
		}
			
		}
		//for loop
		System.out.println("enter the number:");
		//int num=sc.nextInt();
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("even numbers"+i);
			}
			else if(i%2!=0)
			{
				System.out.println("odd numbers:"+i);
			}
			else
			{
				System.out.println("invalid");
			}
			
		}
		//another method
		for(int i=1;i<=100;i+=2)
		{
			System.out.println("odd numbers");
			System.out.println(i);
			
		}
		for(int i=2;i<=100;i+=2)
		{
			System.out.println("even numbers");
			System.out.println(i);
		}
		//another method
		System.out.println("even numbers");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				//System.out.println("even numbers");
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		System.out.println("odd numbers");
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				
				System.out.print(i+" ");
			}
		}
		//n natural numbers
		System.out.println("enter the number:");
		//int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		//factorial of a number
		System.out.println("enter a number:");
		//int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--)
			
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		//reverse of a number
		int rev=0;
		for(;n>0;n=n/10) {
			int rem=n%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
			
	}

}
