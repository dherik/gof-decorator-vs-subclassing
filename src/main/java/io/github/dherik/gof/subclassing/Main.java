package io.github.dherik.gof.subclassing;

/**
 * Created by dherik on 13/02/17.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println(new TextView("Text").content());
        System.out.println(new BorderedTextView("Text").content());
        System.out.println(new ScrolledTextView("Text").content());
        System.out.println(new ScrolledBorderedTextView("Text").content());

    }

}
