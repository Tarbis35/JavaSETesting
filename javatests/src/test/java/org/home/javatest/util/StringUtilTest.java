package org.home.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void string_with_lenght_greater_than_cero () {
        assertFalse(StringUtil.isEmpty("assdfdg"));
    }
    @Test
    public void string_with_lenght_equal_cero () {
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_with_blank_spaces () {
        assertTrue(StringUtil.isEmpty("   "));
    }
    @Test
    public void null_string () {
        assertTrue(StringUtil.isEmpty(null));
    }
}