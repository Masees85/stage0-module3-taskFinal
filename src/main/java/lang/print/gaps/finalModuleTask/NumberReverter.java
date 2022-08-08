package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        
        
    int reverse = 0, remainder;
        
    remainder = n % 10;
        
    reverse = reverse * 10 + remainder;
        
    n /= 10;    
        
    remainder = n % 10;
        
    reverse = reverse * 10 + remainder;
        
    n /= 10;  
        
    remainder = n % 10;
        
    reverse = reverse * 10 + remainder;  
        
    System.out.println("Reversed number = " +  reverse);
        
    }
}
