import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum,f,s,temp;
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            sum=0;
            f=1;
            s=2;
            do
            {
                if(f%2==0)
                    sum+=f;
                temp=s;
                s=f+s;
                f=temp;
            }while(f<=n);
            System.out.println(sum);
        }
    }
}
