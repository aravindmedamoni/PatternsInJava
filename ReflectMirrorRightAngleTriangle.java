import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReflectMirrorRightAngleTriangle{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<n;i++){
            for(int j=n-(i+1);j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("$");
            }
            System.out.println();
        }
        
       for(int i=n-1;i>0;i--){
           for(int j=n-i;j>0;j--){
               System.out.print(" ");
           }
           for(int j=0;j<i;j++){
               System.out.print("$");
           }
           System.out.println();
       }

    }
}