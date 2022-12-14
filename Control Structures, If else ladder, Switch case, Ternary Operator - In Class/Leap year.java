/*
Leap year
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a year, find if it is a leap year. Leap year is the year that is multiple of 4. But, multiples of 100 which are not multiples of 400 are not leap years.
Input
The input contains a single integer N

Constraint:
1 <= n <= 5000
Output
Print "YES" if the year is a leap year else print "NO".
Example
Sample Input:
2000

Sample Output:
YES

Sample Input:
2003

Sample Output:
NO

Sample Input:
1900

Sample Output:
NO
*/


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%4==0 && N%100!=0 || N%400==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
