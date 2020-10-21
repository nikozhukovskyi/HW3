package HW_EightyEight;

import java.util.Scanner;

public class V {

    public static void v_me() throws Exception{
        int tmp, decimal, n;
        int [] numBox;

        System.out.printf("Input n: ");
        Scanner scn1 = new Scanner(System.in);

        if (scn1.hasNextInt()) {
            n = scn1.nextInt();
            tmp = n;

            decimal = 0;

            while (n > 0) {
                decimal++;
                n /= 10;
            }
            numBox = new int[decimal];
            n = tmp;
            for (int i = 0; i < decimal; i++) {
                numBox[i] = n%10;
                n /= 10;
            }
            tmp = numBox[0];
            numBox[0] = numBox[decimal - 1];
            numBox[decimal - 1] = tmp;

            for (int i = decimal - 1; i >= 0 ; i--) {
                System.out.print(numBox[i]);
            }
            System.out.println("");
        }
    }

}