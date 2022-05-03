package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int left = 4;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1To2Then3() {
        int first = 3;
        int second = 1;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3To3Then3() {
        int first = 3;
        int second = 3;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1To4To2Then4() {
        int first = 3;
        int second = 1;
        int third = 4;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4To4To4Then4() {
        int first = 4;
        int second = 4;
        int third = 4;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}