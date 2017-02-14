package io.github.dherik.god.subclassing;

/**
 * Created by dherik on 13/02/17.
 */
public class ScrolledBorderedTextView extends TextView {  /*You can't do extends ScrolledTextView, BorderedTextView */

    private final String text;

    ScrolledBorderedTextView(final String text) {
        super(text);
        this.text = text;
    }

    @Override
    public String decorate(String text) {
        ScrolledTextView scroll = new ScrolledTextView(text);
        BorderedTextView border = new BorderedTextView(text);
        return scroll.decorate(border.decorate(text));
    }

    @Override
    public String content() {
        return decorate(this.text);
    }
}
