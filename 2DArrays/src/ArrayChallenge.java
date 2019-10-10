import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//candyMan();
		//printRange();
		randomArray();
	}
public static void candyMan() {
	Scanner sweetNumber = new Scanner(System.in);
	Scanner candy = new Scanner(System.in);
	System.out.println("how many favorite sweets do you have");
	int number = sweetNumber.nextInt();
	
String[]candies=new String[number];
System.out.println("enter them");
String enter = candy.nextLine();
for(int i = 0;i<candies.length;i++) {
	
	System.out.println("candy " + i );
	candies[i]=sweetNumber.nextLine();
}
System.out.print(enter);
for(int i = 0;i<candies.length;i++) {
	
	System.out.println(candies[i]);
}
}
public static void printRange() {
	Scanner userInput = new Scanner(System.in);
	System.out.println("enter 8 then enter the other numbers");
	int number = userInput.nextInt();
	int oddTotal = 0;
	int evenTotal = 0;
	int[]range= new int[number];
	int sum;
	int i;
	for( i = 0;i<range.length;i++) {
		System.out.println(" enter the numbers now:" + i);
		range[i]=userInput.nextInt();
	
			
	}
	for(int s:range) {
		System.out.println(s);
	
		if(s%2==1) {
		 oddTotal+=s;
		 System.out.println(oddTotal);
	}if(s %2==0) {
		evenTotal+=s;
		System.out.println(evenTotal);
	}
	}
}
public static void randomArray() {
	Random rd = new Random();
	int[]generatorArr=new int[5];

	for(int i = 0;i<generatorArr.length;i++) {
		generatorArr[i]=(int)(Math.random()*99);
	}
	System.out.println(Arrays.toString(generatorArr));
	for(int i=5;i>0;i--) {
		System.out.println(generatorArr[i-1]);
	}
	
}
}
