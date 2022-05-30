import java.util.*;
public class ifsample {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            
            System.out.println("enter a number:" );
            int num = sc.nextInt();//int:nextint()
            
            if(num<0){
                System.out.println("negative number");
            }
            else if(num>0){
                System.out.println("positive number");
            }
            else{
                System.out.println("zero");
            }

         }
    }
    

    

