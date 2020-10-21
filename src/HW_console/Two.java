package HW_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    public static void two_app() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("What is your name? ");
        String name = br.readLine();
        System.out.printf("Where are you live? ");
        String live = br.readLine();
        System.out.println("Your name " + name + "\n" + "You live in " + live);
    }
}
