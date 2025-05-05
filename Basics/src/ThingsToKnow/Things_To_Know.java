package ThingsToKnow;

import java.util.Scanner;

public class Things_To_Know {

    public void GetAndPrint() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("The number is : " + n);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
