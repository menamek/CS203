
public class FizzBuzz2 {
	public static void main(String[] args) {
        
        for (int Num=1;Num <=100;Num+=1 ){
        	if (Num%3==0&&Num % 5==0){
            	System.out.println("fizzbuzz");
            }else if (Num%5==0)  
            {  
               System.out.println("buzz"); 
            }  else if (Num % 3==0)
            {
                System.out.println("fizz");
            }
            
            else{
            	System.out.println(Num);
            }
        
        }
            
    }
}
