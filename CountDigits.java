//Name: Derek Dunlap
//Date: 2/5/21
//A Java program that counts the number of digits within a given number provided by the user.
//Then, displays the number of digits that are within the number.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*; //Imports a Scanner
public class CountDigits {
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in); //Creates an instance of the Scanner class called input.
		System.out.print("Please input a number: "); //Displays a message to instruct the user to input a number.
		int number=input.nextInt(); //Assigns the value input by the user to the variable number of int type.
		System.out.print("There are "+countDigit(number)+" digits in the number of "+number); //Calls the countDigit method and returns the value and displays in the given message.
		
	 }
	//Defines the method that will perform the counting of each digit in the value stored in n and returns the value to main method.
	public static int countDigit(int n) {
		int digit=0;//Declares digits with default value of 0.
		int count=0;//Declares counter with default value of 0.
		int results=0;//Declares results with default value of 0.

		//While loop that will perform the calculations to determine the number of digits in the given number.
		while(n>0) {
			digit=n%10;//Grabs the last digit of a given number.
			n=n/10;//Divides n by 10 and reassigns n with the new value for next iteration.
			count++;//Used to count how many digits are present in the number.
		}
		results=count; //Assigns the final number stored in count to the varaible result.
		return results;//Returns the results stored in result to the main method.
	}
}