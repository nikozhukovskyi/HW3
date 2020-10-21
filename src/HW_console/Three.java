package HW_console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Call time (UA): ");
        int c1 = Integer.parseInt(br.readLine());
        System.out.print("Call time (RU): ");
        int c2 = Integer.parseInt(br.readLine());
        System.out.print("Call time (USA): ");
        int c3 = Integer.parseInt(br.readLine());

        System.out.print("Call cost UA: ");
        double t1 = Double.parseDouble(br.readLine());
        System.out.print("Call cost RU: ");
        double t2 = Double.parseDouble(br.readLine());
        System.out.print("Call cost USA: ");
        double t3 = Double.parseDouble(br.readLine());

        System.out.println("Spent GRN " + c1 * t1 + "\n" + "Spent RUB " + c2 * t2 + "\n" + "Spent USA " + c3 * t3);

    }
}
