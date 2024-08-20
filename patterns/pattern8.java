//print -> rhombus pattern
       
    //             * * * * *
    //           * * * * *
    //         * * * * *
    //       * * * * * 
   //      * * * * * 







public class pattern8 {
    public static void main(String args[]){ 

    int n=5;
       
         for (int i=1; i<=n; i++){
            //first part
             //spaces
             for(int j=1; j<=n-i; j++){
                System.out.print("  ");
             }
              //second part-> stars
             for (int j=1; j<=5; j++) {
                System.out.print(" *");  
             }
             
          
             System.out.println();
                
         }

        
        }
    
}
