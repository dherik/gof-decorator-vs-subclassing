package io.github.dherik.gof.decorator;

public class ScrolledText implements Text {

    private final Text text;

    ScrolledText(final Text text) {
        this.text = text;
    }

    @Override
    public String content() {
        return text.content().concat(" scroll");
    }

}
