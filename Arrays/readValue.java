//finding maximum and minimum value in an array



import java.util.*;

public class readValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
    //for taking input size
        int size = sc.nextInt();
        
    // declaring array
        int[] numbers  = new int[size];
    //for taking array element input
        for(int i=0;i<size;i++){
          numbers[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("minimum value is "+ min);
        System.out.println("maximum value is "+ max);

        sc.close();
    }
}
