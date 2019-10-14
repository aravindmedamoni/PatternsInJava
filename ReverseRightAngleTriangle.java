/* write a program to print ReverseRightAngleTrianle
$$$$$
$$$$
$$$
$$
$

*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReverseRightAngleTriangle{
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n = Integer.parseInt(br.readLine().trim());
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}