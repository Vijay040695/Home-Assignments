package Homeworksweek1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8,FirstValue=0,SecondValue=1,nextValue;
		System.out.println("Fibonacci Series Terms");
		for (int i = 1; i <=n; i++) {
			System.out.println(FirstValue +",");
			nextValue=FirstValue+SecondValue;
				FirstValue=SecondValue;
			    SecondValue=nextValue;
			    
		}
	}

}
