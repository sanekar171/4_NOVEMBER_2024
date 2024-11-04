import java.util.Scanner;

/**
 * Problem Description
 *
 * You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
 *
 * If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
 *
 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
 *
 * Note: All the test cases in this problem are limited to 3 digit numbers.
 *
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 500
 *
 *
 *
 * Input Format
 *
 * First and only line of input contains an integer N.
 *
 *
 *
 * Output Format
 *
 * Output all the Armstrong numbers in range [1,N] each in a new line.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  5
 * Input 2:
 *
 *  200
 *
 *
 * Example Output
 *
 * Output 1:
 *
 * 1
 * Output 2:
 *
 * 1
 * 153
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 * 1 is an armstrong number.
 * Explanation 2:
 *
 * 1 and 153 are armstrong number under 200.
 */
public class APP1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Integer N=Integer.parseInt(scanner.nextLine());
        Integer sum=null,temp=null,d=null;
        for(int num=1;num<=N.intValue();num++)
        {
            //sum is 0 per number to check for armstrong
            sum=0;
            temp=num;
            while(temp>0)
            {
                d=temp.intValue()%10;
                temp=temp.intValue()/10;
                sum=sum.intValue()+(int)Math.pow(d,3);
            }
            if(sum.intValue()==num)
                System.out.println(num);
        }
    }
}
