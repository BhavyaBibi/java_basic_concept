import  java.util.*;

public class functionwitharrgument {
    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
        
        System.out.println("enter two number:" );
        int num1 = sc.nextInt();//int:nextint()
        int num2 = sc.nextInt();
        int result = sum(num1,num2);
        System.out.println("result = " +result);
    }
    
        static int sum(int a,int b){
            int s=a+b;
            return s;
            
        }
        
        
        }

// output

// enter two number:

// 23
// 32
// result = 55


// ** Process exited - Return Code: 0 **