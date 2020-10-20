import HW.A;
import HW.B;
import HW.V;
import HW.W;


import java.io.IOException;


public class EightyEight {
    public static void main(String[] args) throws Exception {
/**
 * A - Входить 3 в n^2
 */
        System.out.println("A - Входить 3 в n^2" + "\n");


            A am = new A();
            am.a_me();
/**
 * B - Поміняти порядок цифер наоборот
 */
        System.out.println("B - Поміняти порядок цифер наоборот" + "\n");


            B bm = new B();
            bm.b_me();
/**
 * V - Переставити першу і останню цифру
 */
        System.out.println("V - Переставити першу і останню цифру");
        System.out.println("\t");


            V vm = new V();
            vm.v_me();

/**
 * W - Добавити по одиничці!
 */
        System.out.println("W - Добавити по одиничці!" + "\n");


            W wm = new W();
            wm.w_me();

    }

}

