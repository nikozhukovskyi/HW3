package HW_EightyEight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class W {
    public static void w_me() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input number: ");
        int number = Integer.parseInt(br.readLine());
        System.out.println("1"+number+"1");

    }
}