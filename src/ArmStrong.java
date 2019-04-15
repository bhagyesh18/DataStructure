import java.util.Scanner;

/*
 * 
 * Armstrong number program in java

Write a java program to check whether a given number is Armstrong number or not. 
A number is called an Armstrong number if it is equal to sum of its digits each raised 
to the power of number of digits in it. For example: 153, 9474, 54748 are some Armstrong numbers. 
In java interview coding questions like this, 
an interviewer mainly check how do you implement logic in you code.  [Solution]
 */
public class ArmStrong {

	static void checkArmstrongNumber(int number)
    {
        int copyOfNumber = number;
 
        int noOfDigits = String.valueOf(number).length();
 
        int sum = 0;
 
        while (copyOfNumber != 0)
        {
            int lastDigit = copyOfNumber % 10;
 
            int lastDigitToThePowerOfNoOfDigits = 1;
 
            for(int i = 0; i < noOfDigits; i++)
            {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }
 
            sum = sum + lastDigitToThePowerOfNoOfDigits;
 
            copyOfNumber = copyOfNumber / 10;
        }
 
        if (sum == number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }
    }
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		int numberOfDigits=num;
		int counter=0;
		
		while(numberOfDigits>0) {
			numberOfDigits=numberOfDigits/10;
			counter++;
		}
		int[] numArray=new int[counter];
		numberOfDigits=counter;
		int SingleDigit=num;
		int num2=num;
		int i=0;
		while(num2>0) {
			numArray[i]=num2%10;
			num2=num2/10;
			i++;
		}
		
		System.out.println("Total Digits:"+numArray.length);
		
		
		int sum=0;
	
		for(int j=0;j<numArray.length;j++) {
			numArray[j]=(int)( Math.pow((double)numArray[j], (double) numberOfDigits));
			sum=sum+numArray[j];
		}
		
		numberOfDigits=counter;
		System.out.println("Total Digits:"+numberOfDigits);
		System.out.println("Sum was:"+sum);
		
		if(num==sum) {
			System.out.println("Number is ArmStrong:"+sum);
		}else {
			System.out.println("Number is not ArmStrong::"+sum);
		}
		
		
		
		
		
	}

}
