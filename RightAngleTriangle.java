/* write a program to print RightAngleTrianle
$
$$
$$$
$$$$
$$$$$

*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class RightAngleTriangle{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}