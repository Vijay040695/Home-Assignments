package Homeworksweek1;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=12;
		System.out.println("Your given number is "+number);
		int count=0;
		for (int i = 1; i<=number;i++) {
			if(number%i==0) {
				count++;
		}
		if(count==2){
			System.out.println("Number "+number+" is a prime Number");	
	}
		else {System.out.println("Number "+number+" is not a prime Number");

}
}
}
}