import java.util.*;

public class forloop{

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
        
        System.out.println("enter a number:" );
        int num = sc.nextInt();//int:nextint()
        int sum =0;
        
        for(int i=0; i<num; i++){
            sum += i;
        }
        System.out.println("the result is "+ sum);
   }

}
// output

// the result is 45

