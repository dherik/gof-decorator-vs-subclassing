package io.github.dherik.god.subclassing;

/**
 * Created by dherik on 13/02/17.
 */
public class BorderedTextView extends TextView {

    private final String text;

    BorderedTextView(String text) {
        super(text);
        this.text = text;
    }

    @Override
    public String content() {
        return decorate(this.text);
    }

    @Override
    public String decorate(String text) {
        return text.concat(" border");
    }

}
