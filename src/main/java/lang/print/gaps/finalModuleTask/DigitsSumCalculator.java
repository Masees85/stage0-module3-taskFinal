package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        
  int  digit, sum = 0; 
  digit = number % 10;  
  sum = sum + digit;  
  number = number / 10;  
  digit = number % 10;  
  sum = sum + digit;  
  number = number / 10;  
  digit = number % 10;  
  sum = sum + digit;  
  number = number / 10;  
  digit = number % 10;  
  sum = sum + digit;  
       
  System.out.println(sum);
        
    }
}
