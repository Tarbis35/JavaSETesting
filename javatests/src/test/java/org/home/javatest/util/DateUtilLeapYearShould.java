package org.home.javatest.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilLeapYearShould {
    /*
    Para determinar si un año es bisiesto o no, debemos seguir las siguientes reglas:

    Todos los años divisibles por 400 son bisiestos (1600, 2000, 2400)
    Todos los años divisibles por 100 pero NO por 400 NO son bisiestos (1700, 1800, 1900)
    Todos los años divisibles por 4 pero no por 100 son bisiestos  (1996, 2004, 2012)
    Todos los años que NO son divisibles por 4 NO son bisiestos (2017, 2018, 2019)
    */
    @Test
    public void return_true_when_year_is_divisible_by_400() {

        assertThat(DateUtil.isLeapYear(1600),CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2000),CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2400),CoreMatchers.is(true));
    }
    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400() {
        assertThat(DateUtil.isLeapYear(1700),CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(1800),CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(1900),CoreMatchers.is(false));
    }
    @Test
    public void return_false_when_year_is_divisible_by_4_but_not_by_100() {
        assertThat(DateUtil.isLeapYear(1996),CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2004),CoreMatchers.is(true));
        assertThat(DateUtil.isLeapYear(2012),CoreMatchers.is(true));
    }
    @Test
    public void return_false_when_year_is_not_divisible_by_4_(){
        assertThat(DateUtil.isLeapYear(2017),CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(2018),CoreMatchers.is(false));
        assertThat(DateUtil.isLeapYear(2019),CoreMatchers.is(false));
    }
}