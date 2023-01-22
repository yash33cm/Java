import java.util.Scanner;

public class exceptions {

    public static void area( int r) throws negativeRadiusException{
        if(r<0){
            throw new negativeRadiusException();
        }
        System.out.println("area is:"+3.14*r*r);
    }
   
    public static void main(String[] args) {
   
        
          System.out.println("enter the radius: ");
          Scanner sc =new Scanner(System.in);
          int radius =sc.nextInt();
          try {
              area(radius);
          } catch (negativeRadiusException e) {
              System.out.println(e.getErrorMessage());
              
              System.out.println(e);
          }
          System.out.println("next time be carefull thankyou hope u like it");
        sc.close();
        


       
        
    }
    
}
class negativeRadiusException extends Exception{
    

    public String toString() {
        return "negative radius arent allowed";

    };
    public String getErrorMessage(){
        return "hey dont put negative radius next time";
    };
} 
