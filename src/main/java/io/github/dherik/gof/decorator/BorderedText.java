package io.github.dherik.gof.decorator;

public class BorderedText implements Text {

    private final Text text;

    BorderedText(final Text text) {
        this.text = text;
    }

    @Override
    public String content() {
        return text.content().concat(" border");
    }
}
