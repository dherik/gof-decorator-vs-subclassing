package io.github.dherik.gof.decorator;

import org.junit.Assert;
import org.junit.Test;

public class BorderedTextTest {

    @Test
    public void content() throws Exception {

        Text text = new BorderedText(new TextView("Text"));
        Assert.assertEquals("Text border", text.content());

    }

}