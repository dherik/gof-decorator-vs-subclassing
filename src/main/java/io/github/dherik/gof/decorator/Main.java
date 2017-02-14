package io.github.dherik.gof.decorator;

public class Main {

    public static void main(String[] args) {

        System.out.println(new TextView("Text").content());
        System.out.println(new BorderedText(new TextView("Text")).content());
        System.out.println(new ScrolledText(new TextView("Text")).content());
        System.out.println(new ScrolledText(new BorderedText(new TextView("Text"))).content());

    }

}
