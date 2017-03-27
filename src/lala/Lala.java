package lala;

import java.util.*;

public class Lala {

    static void factorialN (int n)
    {
        int fact = 1;
        int count = 0;

        for (int i=1; i<=n; i++)
        {
            count++;
            System.out.print(count + "!= ");

            for (int j=1; j<=count; j++)
            {
                fact = fact * j;
                System.out.print(j + "*");

            } // for j

            System.out.println(" = " + fact);

            fact = 1;

        } // for i
    } // factorialN
    //---------------------------------------
    public static void main(String[] args) {

        Scanner sc = new
                Scanner(System.in);
        System.out.println("Input number ! <20");
        String s = sc.nextLine();
        int n = Integer.parseInt(s);

        factorialN(n);

    } // main

}
