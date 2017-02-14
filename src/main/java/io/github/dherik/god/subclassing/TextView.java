package io.github.dherik.god.subclassing;

/**
 * Created by dherik on 13/02/17.
 */
public class TextView implements Text {

    private final String text;

    TextView(final String text) {
        this.text = text;
    }

    public String content() {
        return text;
    }

    @Override
    public String decorate(String text) {
        return text; //do nothing
    }

}
