package Oops_Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Demo {

	public static void main(String[] args) {
		
		
		// Example 1 SingleDimensionalArray[]
		
		int array[]= new int[5];  
		
		array[0] = 100;  // ----->This Array There is NoMore Methods To Work On Array!
		array[1]= 200;
		array[2]= 300;
		array[3] = 400;
		array[4]= 500;
		
		System.out.println("Printing Data From IndeOf : " +array[0]);
		System.out.println("Printing Data From IndexOf: "+ array[1]);
		System.out.println("Printing Data From IndexOf: " + array[2]);
		System.out.println("Printing Dat From IndexOf: " + array[3]);
		System.out.println("Printing Data From IndexOf :" + array[4]);
		
		for ( int i = 0; i<=array.length-1; i++) //-----> Go like this for good practis!
		{
			System.out.println("Printing ArrayValues Using Loop: "+ array[i]);
		}
		
		// Example 2 SingleDimensionalArray    [j < Array.length or j <= Array.length - 1]
		
		int Array[]= {100, 200, 300, 400, 500, 600, 700, 800, 900};
		
		for ( int j = 0; j< Array.length; j++) //-------> Go like this !
		{
			System.out.println("Printing ArrayValues Using Loop: "+ Array[j]);
		}
		
		//Example 3 TwoDimensionalArray[][]
		
		int number[][]= new int[5][10];
		int value = 1;
		
		number[0][0] = 10; //-------> Approach 1 To Add Data Into Cells!
		number[0][1] = 20;
		number[0][2] = 30;
		number[0][3] = 40;
		number[0][4] = 50;
		number[0][5] = 60;
		number[0][6] = 70;
		number[0][7] = 80;
		number[0][8] = 90;
		number[0][9] = 100;
		System.out.println("Printing Data From IndexOf: "+ number[2][3]); //---> Approach1 to printdata!
		
		// Adding DataInto Rows and Cells Using Loop Approach2

		for (int r = 0; r < number.length; r++) {
			for (int c = 0; c < number[r].length; c++) {
				number[r][c] = value++;
			}
		}

		// Printing Values From Loop

		for (int rows = 0; rows < number.length; rows++) // ----> Approach 2 Printing Data FromCells!
		{
			for (int cell = 0; cell < number[rows].length; cell++) {
				number[rows][cell] = value++;
				System.out.println(number[rows][cell]);
			}
		}
		
		// Example 4 TwoDimentionalArray [][]
		
		int Numb[][] = {{100,200}, {300, 400}, {500, 600}, {700, 800}, {900, 1000}}; 
		int count = 0;
		System.out.println(Numb[0][1]);
		
		for ( int a=0; a<Numb.length ; a++ )
		{
			for ( int b=0; b<Numb[a].length; b++)
			{
				System.out.println(Numb[a][b]);
			}
		}
		
		for (int num[]:Numb)
		{
			for (int Nu:num)
			{
				System.out.println("Printing Values :" + Nu);
			}		
			
		}
		
		// Example 5 Using Objet Stores All Types of data!
		
		Object a[] = {100, "Kalyan", 10.0, true};
		System.out.println(a[0]);
		
		for ( Object arr:a)
		{
			System.out.println("Printing From Object: "+ arr);
		}
		
		// Example 6 PracticalLab
		
		int kal[]= {100, 400, 600, 200, 300, 400, 500, 600};
		int SearchEle = 400;
		boolean Status =false;
		
		
		for (int k = 0; k < kal.length; k++) {
			if (kal[k] == SearchEle) {

				System.out.println("SearchElement Found: " + SearchEle);
				Status = true;
				break;
			}
		}
		
		if ( Status == false)
		{
			System.out.println("SearchElement Not Found: "+ SearchEle);
		}
		
		// Using EnhancedLoop
		
		for (int k:kal)
		{
			if (k == SearchEle)
			{
				System.out.println("SearchElement Found Using ForEachLoop : "+ SearchEle);
				Status = true;
				break;
			}
		}
		
		if (Status == false)
		{
			System.out.println("SearchElement Not Found Using ForEachLoop: "+ SearchEle);
		}
		
		// Example 7 Repeted Numbers 
		
		for ( int k: kal)
		{
			if (k == SearchEle)
				count++;
			
		}
		
			System.out.println("Duplicate SearchElement is Not Found: "+count);
			
			// Example 7 Sorting Of Arrays
			
			int K[]= {100, 400, 600, 200, 300, 400, 500, 600};
			System.out.println("Before Sorting Of Array: " + Arrays.toString(K));
			Arrays.sort(K);
			System.out.println("After Sorting Of Array: "+ Arrays.toString(K));
			
			// Example 8 ReverseOrder
			
			int G[]= {500, 600,300,400,200,100};
			for ( int g=G.length-1; g>=0; g--)
			{
				System.out.println("Reversed String : " + G[g]);
			}
			
			// Example 8 Multiple Input From Console :
			// Approach 1
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Value :");
			int No = sc.nextInt();
			System.out.println("Printing Values :" + No);
			
			System.out.println("Enter Value :");
			String No1 = sc.next();
			System.out.println("printing Values:"+No1);
			
			
			System.out.println("Enter Value :");
			double No2 = sc.nextDouble();
			System.out.println("Printing Values :" + No2);
			
			
			System.out.println("Enter Value :");
			int No3 = sc.nextInt();
			System.out.println("Printing Values :" + No3);
			
			System.out.println("Enter Value :");
			int No4 = sc.nextInt();
			System.out.println("Printing Values :" + No4);
			
			// Example 9 Array With Scanner class 
			
			Scanner Sc = new Scanner(System.in);
			int C[] = new int[5];
			
			for ( int c=0; c<C.length; c++)
			{
				System.out.println("Enter Value : ");
				C[c] = Sc.nextInt();
			}
			System.out.println("Printing Array Elements :" + Arrays.toString(C));
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
