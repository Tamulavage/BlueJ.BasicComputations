 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        // use Integer's method for formating
        return String.format("%8s", Integer.toBinaryString(value));
    }

    public String printIntegerAsOctal(int value){
        return String.format("%o",value);
    }

    public String printIntegerAsHexadecimal(int value){
        return String.format("%x",value);
    }

    public static void main(String[] args){

    }
}
