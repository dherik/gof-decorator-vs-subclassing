package io.github.dherik.god.subclassing;

import org.junit.Assert;
import org.junit.Test;

public class ScrolledTextTest {

    @Test
    public void content() throws Exception {

        Text text = new ScrolledTextView("Text");
        Assert.assertEquals("Text scroll", text.content());

    }

}