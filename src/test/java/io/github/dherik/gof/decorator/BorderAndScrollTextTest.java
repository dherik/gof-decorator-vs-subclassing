package io.github.dherik.gof.decorator;

import org.junit.Assert;
import org.junit.Test;

public class BorderAndScrollTextTest {

    @Test
    public void content() {

        Text text = new ScrolledText(new BorderedText(new TextView("Text")));
        Assert.assertEquals("Text border scroll", text.content());

    }

}
