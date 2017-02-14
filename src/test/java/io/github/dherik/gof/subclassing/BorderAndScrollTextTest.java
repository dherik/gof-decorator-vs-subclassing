package io.github.dherik.gof.subclassing;

import org.junit.Assert;
import org.junit.Test;

public class BorderAndScrollTextTest {

    @Test
    public void content() {

        Text text = new ScrolledBorderedTextView("Text");
        Assert.assertEquals("Text border scroll", text.content());

    }

}
