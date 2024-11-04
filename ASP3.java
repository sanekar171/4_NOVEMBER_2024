import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Problem Description
 *
 * Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 1000
 *
 *
 *
 * Input Format
 *
 * A single line representing N
 *
 *
 *
 * Output Format
 *
 * A single integer showing sum of all Natural numbers from 1 to N
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *
 * 5
 * Input 2:
 *
 *
 * 10
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *
 * 15
 * Output 2:
 *
 * 55
 */
public class ASP3 {
    public static void main(String[] args)throws Exception {
        Scanner scanner=new Scanner(System.in);
        Integer N=Integer.parseInt(scanner.nextLine());
        Integer sum=0;
        for(int i=1;i<=N.intValue();i++)
        {
            sum=sum.intValue()+i;
        }
        PrintWriter pw= new PrintWriter(new OutputStreamWriter(System.out));
        pw.println(sum);
        pw.flush();
        pw.close();
    }
}
