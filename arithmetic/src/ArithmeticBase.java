/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 02/19
 */
public class ArithmeticBase 
{
	
	public enum operations { // OMAR EDIT START
		ADDITION, SUBTRACTION, MULTIPLY, DIVIDE
	}
	public operations name;
	public String val;
	public ArithmeticBase(operations o, double x, double y){
		name = o;
		switch (name) 
        {
            case ADDITION:
            	val = "Addition: " + (x + y);
                break;
            case SUBTRACTION:
            	val = "Subtraction: " + (x - y);
                break;
            case MULTIPLY:
            	val = "Multiplication: " + (x * y);
                break;
            case DIVIDE:
            	val = "Division: " + (x / y);
                break;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
		
	}
	// EDIT END
   
}
