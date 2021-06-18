import java.util.Scanner;

 class Factorial{
    
    static int fibo(int n){
        if (n == 1){
            return 1;
        }
        else{
            return n*fibo(n-1);
        }
    } 
     public static void main(String []args){
        
        System.out.println("Enter a no to find it's factorial: ");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        System.out.println("Factorial: "+fibo(no));
        
     }
}
