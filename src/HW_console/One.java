package HW_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    public static void one_app() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input Radius: ");
        int radius = Integer.parseInt(br.readLine());
        final double  Pi = 3.14;
        double pl = Pi * (radius * radius);
        double p = 2 * Pi * radius;
        System.out.printf("Area is: "+ pl + " \n" + "Perimeter is: "); System.out.format("%.1f" , p);
        System.out.println("");
    }

}
