import HW_console.One;
import HW_console.Two;

import java.io.IOException;

public class Console_app {
    public static void main(String[] args) throws IOException {
        /**
         * one console app
         */
        System.out.println("Площа і периметер через радіус! \n");

        One br = new One();
        br.one_app();

        /**
         * two
         */
        System.out.println("Визначити імя і місто проживання!");

        Two br_two = new Two();
        br_two.two_app();
    }
}
