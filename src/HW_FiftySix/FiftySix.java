package HW_FiftySix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiftySix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("Enter Height of Brick A: ");
        int a_height = Integer.parseInt(br.readLine());

        System.out.printf("Enter Weight of Brick B: ");
        int b_width = Integer.parseInt(br.readLine());

        System.out.printf("Enter Length of Brick C: ");
        int c_length = Integer.parseInt(br.readLine());

        System.out.printf("Enter Height of Rectangle X: ");
        int x_height = Integer.parseInt(br.readLine());

        System.out.printf("Enter Weight of Rectangle Y: ");
        int y_width = Integer.parseInt(br.readLine());


        if (a_height <= x_height && b_width <= y_width) {
            System.out.println("Brick enters the hole (a|x b|y)");
        }else System.out.println("Brick is not included in the hole");

        if (a_height <= y_width && b_width <= x_height) {
            System.out.println("Brick rotate 90'(a|y b|x) and enter the hole");
        } else System.out.println("Brick rotate 90' (a|y b|x) and is not included the hole"); System.out.println("if the height and width pass, then the length as well");
    }

}
