/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess03_selection_and_iteration;

/**
 *
 * @author Ayan Ahmed
 */
public class StarPatternDoWhile {
    
    // main method begins program execution
    public static void main(String[] args) {
        // variable to be used
        int row = 1, col;
        do
        {
         col = 1;
         do // inner loop
         {
           System.out.printf("* ");
           col++;
         
         } while (col <= row);
         System.out.println("");
         row++;
         
        
        } while (row <= 5);
    }
    
}
