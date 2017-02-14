package io.github.dherik.god.subclassing;

import org.junit.Assert;
import org.junit.Test;

public class BorderedTextTest {

    @Test
    public void content() throws Exception {

        Text text = new BorderedTextView("Text");
        Assert.assertEquals("Text border", text.content());

    }

}