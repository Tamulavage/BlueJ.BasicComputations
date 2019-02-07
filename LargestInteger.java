 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        
        return (integers[2]>integers[1] && integers[2]>integers[0] ? integers[2]
         :(integers[1] > integers[0] ? integers[1] :integers[0]));
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        return (Math.max(Math.max(integers[2],integers[1]),integers[0]));
    }
}
