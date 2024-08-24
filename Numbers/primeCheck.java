package Programming.Numbers;


import java.util.*;

public class primeCheck {
    public static void main(String args[]){
       
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        int count=0;

        if(n==0||n==1){
          System.out.println("0 and 1 are not prime number");
        }
        
        for(int i=1;i<=n;i++){
          if(n%i==0){
            count++;
          }
        }

          if(count==2){
            System.out.println("n is  prime number");
          }else{
            System.out.println("n is not prime number"); 
          }



    }
    
}
