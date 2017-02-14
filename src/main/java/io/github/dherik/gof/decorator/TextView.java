package io.github.dherik.gof.decorator;

public class TextView implements Text {

    private final String text;

    TextView(final String text) {
        this.text = text;
    }

    @Override
    public String content() {
        return text;
    }
}
