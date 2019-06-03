import java.math.*;
import java.io.*;

public class Fibonacci {

	private static BigInteger[] tempArray;
	private static BigInteger valone;
	private static BigInteger valzero;

	private static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	public static BigInteger fib(int n) {
		if (n == 0) {
			return tempArray[0];
		} else if (n == 1) {
			return tempArray[0];
		} else if (n == 2) {
			return tempArray[0];
		}
		if (tempArray[n - 1].compareTo(valzero) != 0)
			return tempArray[n - 1];
		if (tempArray[n - 2].compareTo(valzero) == 0)
			tempArray[n - 2] = fib(n - 1);
		if (tempArray[n - 3].compareTo(valzero) == 0)
			tempArray[n - 3] = fib(n - 2);
		return tempArray[n - 2].add(tempArray[n - 3]);
	}

	
	public static int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
 
		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail recursion
	}
 
	// Method-2: Java program for Fibonacci number using Loop.
	public static int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
			fibo1 = fibo2;
			fibo2 = fibonacci;
 
		}
		return fibonacci; // Fibonacci number
	}
 
	public static void main(String[] args) throws IOException {
		int n;
		int answer;
		System.out.println("Enter Number : ");
		String input = stdin.readLine();
		n = Integer.parseInt(input);
		valzero = new BigInteger("0");
		valone = new BigInteger("1");
		tempArray = new BigInteger[n];
		tempArray[0] = new BigInteger("1");
		tempArray[1] = new BigInteger("1");
		for (int i = 2; i < n; i++)
			tempArray[i] = new BigInteger("0");
		answer = fibonacciLoop(n);

		System.out.println("Result: " + answer);

	}

}