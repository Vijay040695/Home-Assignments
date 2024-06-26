package Homeworksweek1;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[]= {1, 4,3,2,8, 6, 7};
		int sum1=0;
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];	
			
		}
		System.out.println("sum Of the elements in array "+ sum1);
		
		int sum2=0;
		
		for(int i=1; i<=8; i++) {
			sum2=sum2+i;	
		}
		System.out.println("sum Of the range of elements in array "+ sum2);
		
		System.out.println("Missing Number is "+(sum2-sum1));
		
	}

}
