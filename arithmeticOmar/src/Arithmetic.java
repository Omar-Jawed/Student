/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 02/19
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     * OMAR EDIT START
     */
    public static void main(String[] args) 
    {
       int x = 1;
       int y = 2;
       int count = 0;
       ArithmeticBase[] values = new ArithmeticBase[4];
       for(ArithmeticBase.operations o : ArithmeticBase.operations.values()) {
    	   values[count] = (new ArithmeticBase(o, x, y));
    	   count++;
       }
       for (int z = 0; z < values.length; z++) {
    	   System.out.println(values[z].val);
       }
    
    } //OMAR EDIT END
}

