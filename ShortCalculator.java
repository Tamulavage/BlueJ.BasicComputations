 
import java.util.Scanner;

public class ShortCalculator {
    
    // read in numbers
    public ShortCalculator(){
        short num1, num2; // numbers to compute- if make dynamic - change to an array maybe?
        short sum;
        
        System.out.println("Will do math for 2 short values");
        /* -- Moved to method
        System.out.println("Pleas input value 1");
        Scanner reader = new Scanner(System.in);
        num1 = (short)reader.nextInt();
        System.out.println("Pleas input value 2");
        num2 = (short)reader.nextInt();
        reader.close();*/
        // now just calls 2 lines
        num1 = readNum(1);
        num2 = readNum(2);
        
        // Can these be put into a method?
        sum = add(num1, num2);
        System.out.println("Add: " + sum);
        
        sum = subtract(num1, num2);
        System.out.println("subtract: " + sum);
        
        sum = multiply(num1, num2);
        System.out.println("multiply: " + sum);
        
        sum = divide(num1, num2);
        System.out.println("divide: " + sum);
        
         
    }
    
    
    // Read num
    public short readNum(int inputTurn) {
        
        short retVal;
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Please input value " + inputTurn);
        retVal = (short)reader.nextInt();
        reader.close();
        
        return retVal;
    }
    
    
    // compute sum
    public Short add(short baseValue, short difference) {
        return (short)(baseValue +difference);
    }
    
    // compute difference
    public Short subtract(short baseValue, short difference) {
        return (short)(baseValue -difference);}
    
    // compute product
    public Short multiply(short multiplicand, short multiplier) {
        return (short)(multiplicand * multiplier);
    }
    
    // compute quotient
    public Short divide(short dividend, short divisor) {
        return  (short)(dividend / divisor);
    }
    
    // compute remainder (SUM)
    
    
}
