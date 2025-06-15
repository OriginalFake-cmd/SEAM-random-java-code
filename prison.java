import java.util.Scanner;

public class Prison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        int M = sc.nextInt(); 
        
        int maxLeft = 0;  
        int minRight = N + 1; 
        
        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            
            maxLeft = Math.max(maxLeft, L);
            minRight = Math.min(minRight, R);
        }
    
        int result = Math.max(0, minRight - maxLeft + 1);
        
        System.out.println(result);
        
        sc.close();
    }
}
