package io.github.dherik.gof.decorator;

import org.junit.Assert;
import org.junit.Test;

public class ScrolledTextTest {

    @Test
    public void content() throws Exception {

        Text text = new ScrolledText(new TextView("Text"));
        Assert.assertEquals("Text scroll", text.content());

    }

}