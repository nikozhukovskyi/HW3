package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void a_me() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number: ");
        int number = Integer.parseInt(br.readLine());
        int b = number * number;
        String str = Integer.toString(b);
        if (str.indexOf('3') != -1) {
            System.out.println("The number n^2 includes number 3!");
        } else {
            System.out.println("The number n^2 don't includes number 3!");
        }
    }
}