package org.home.javatest.util;

import org.junit.Test;

import static org.home.javatest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PaswordUtilTest {
    @Test
    public void weak_when_has_less_8_letters() {
        assertEquals(WEAK, PasswordUtil.accessPassword("1!b5"));
    }
    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK, PasswordUtil.accessPassword("abcdfghijq"));
    }
    @Test
    public void medium_when_has_letters_and_numbers() {
        assertEquals(MEDIUM, PasswordUtil.accessPassword("abcdfg1234hijq"));
    }
    @Test
    public void medium_when_has_letters_numbers_and_symbols() {
        assertEquals(STRONG, PasswordUtil.accessPassword("abcdfghiq.#$!*+-"));
    }
}