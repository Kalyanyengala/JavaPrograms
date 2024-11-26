package Patterns;

import org.testng.reporters.jq.Main;

public class StarPatterns 
{
	public static void main(String[] args) {
        // Example 1: Right Triangle Star Pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * Output:
         * 
         * *  
         * * *  
         * * * *  
         * * * * * 
         */

        // Example 2: Mirrored Right Triangle Star Pattern
        for (int a = 0; a < 5; a++) {
            for (int b = 1; b <= 2 * (5 - a); b++) {
                System.out.print(" ");
            }
            for (int c = 0; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * Output:
         *       * 
         *      * * 
         *     * * * 
         *    * * * * 
         *   * * * * * 
         */

        // Example 3: Reverse Pyramid Shape
        for (int I = 0; I < 5; I++) {
            for (int j = 0; j < I; j++) {
                System.out.print(" ");
            }
            for (int k = 5 - I; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * Output:
         * * * * * * 
         *  * * * * 
         *   * * * 
         *    * * 
         *     * 
         */

        // Example 4: Diamond Shape Star Pattern
        for (int x = 1; x <= 5; x++) {
            for (int y = 5 - x; y > 0; y--) {
                System.out.print(" ");
            }
            for (int z = 1; z <= 2 * x - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int dia = 4; dia > 0; dia--) {
            for (int j = 4 - dia; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int q = 1; q <= 2 * dia - 1; q++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * Output:
         *      *    
         *     ***   
         *    *****  
         *   ******* 
         *  *********
         *   ******* 
         *    *****  
         *     ***   
         *      *    
         */

        // Example 5: Mirrored Right Triangle Star Pattern
        for (int m = 0; m <= 5; m++) {
            for (int space = 1; space <= 5 - m; space++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= m; st++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * Output:
         *      *
         *     **
         *    ***
         *   ****
         *  *****
         */
        
        // Example 6: print the mirrored right down triangle star pattern
        
        for(int mi = 5; mi > 0; mi--)
        {
        	for(int spac = 5; spac > 0; spac--)
        	{
        		System.out.print(" ");
        	}
        	for(int star = 1; star <= mi; star++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        	
        /*	*****
            ****
            ***
            **
            *         */

        }
        
    }}
