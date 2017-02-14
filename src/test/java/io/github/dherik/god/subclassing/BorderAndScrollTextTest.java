package io.github.dherik.god.subclassing;

import io.github.dherik.gof.decorator.BorderedText;
import io.github.dherik.gof.decorator.ScrolledText;
import org.junit.Assert;
import org.junit.Test;

public class BorderAndScrollTextTest {

    @Test
    public void content() {

        Text text = new ScrolledBorderedTextView("Text");
        Assert.assertEquals("Text border scroll", text.content());

    }

}
