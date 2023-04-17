
import java.util.ArrayList;

public class PrimeDirective {

      public  boolean isPrime(int number){
        if(number == 2){
            return true;
        } else if (number < 2){
            return false;
        }
       
        for(int i = 2; i < number; i++){
          if( number % i == 0){
            return false;    
          }      
        }
        return true;
      }
      
      public ArrayList<Integer> onlyPrimes(int[] numbers){

        ArrayList<Integer> primes = new ArrayList<Integer>();

        for(int num = 0; num < numbers.length; num++ ){
            if(isPrime(numbers[num])){
                primes.add(numbers[num]);
            }       
        }
        return primes;
      }
      
      public static void main(String[] args) { 
    
        PrimeDirective prime = new PrimeDirective();
       
        int[] numbers = {2, 3, 7, 13, 51, 92, 22, 68};
        
        boolean result = prime.isPrime(51);
        System.out.println(result);
        ArrayList<Integer> primos = prime.onlyPrimes(numbers);
        System.out.println(primos);
      }  
    }
      
