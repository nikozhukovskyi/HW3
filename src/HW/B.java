package HW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Більше 10 символів не працює!
 * */

public class B {
    public static void b_me() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("insert number: ");
        int n = Integer.parseInt(br.readLine());
        String s = Integer.toString(n);
        String result = s.substring(s.length() - 1);

        for (int i = s.length() - 2; i >= 0; i--) {
            result = result.concat(s.substring(i, i + 1));
        }

        n = Integer.parseInt(result);
        System.out.println("Output " + n);

    }
}

