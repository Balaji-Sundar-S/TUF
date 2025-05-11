package PascalTriangle;

import java.util.Scanner;

/*We have an easier formula to find out the element i.e. r-1Cc-1. Let’s try to analyze the formula to find the value of the combination assuming r-1 as n and c-1 as r:

nCr = n! / (r! * (n-r)!)*/
public class PascalTriangleProblems {

    int r, c, res;

    public void init(boolean onlyRow) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Provide Row Number: ");
            int m = sc.nextInt();
            if (!onlyRow) {
                System.out.println("Provide Column Number: ");
                int n = sc.nextInt();
                c = n - 1;
            }
            // r = m - 1;
            r = m;
            res = 1;
        }
    }

    public void GetElement(int r, int c, int res) {
        r -= 1;
        c -= 1;
        // init(true);
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        System.out.println(res);
    }

    public void DisplayRow() {
        init(true);
        System.out.print(res + "\t");
        for (int i = 0; i < r; i++) {
            res = res * (r - i);
            res = res / (i + 1);
            System.out.print(res + "\t");
        }
    }

    public void DisplayPascalTriangle() {
        init(true);
        System.out.print("\n");
        for (int n = 0; n < r; n++) {
            System.out.print(res);
            for (int i = 0; i < n; i++) {
                res = res * (n - i);
                res = res / (i + 1);
                System.out.print("\t" + res);
            }
            System.out.println();
            res = 1;
        }
    }
}
