 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger retVal =  BigInteger.valueOf(1);
        
        for(int x=1; x<=value; x++){
            
            retVal = retVal.multiply(BigInteger.valueOf(x));
            System.out.println("RetVal" + retVal);
            System.out.println("X" + x);
        }
        
        
        
        return retVal;
    }

}
