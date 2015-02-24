
public class FizzBuzz {
	    public static void main(String[] args) {
	        int Num = 0;
	        
	        while (Num <100 )
	        {
	        	Num=Num+1;
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
