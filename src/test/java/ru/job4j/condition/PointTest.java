package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when00to22then2dot83() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double expected = 2.83;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when10to22then2dot24() {
        Point a = new Point(1, 0);
        Point b = new Point(2, 2);
        double expected = 2.24;
        Assert.assertEquals(expected, a.distance(b), 0.01);
    }

    @Test
    public void when000to002then2() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 2);
        double expected = 2;
        Assert.assertEquals(expected, a.distance3d(b), 0.01);
    }

    @Test
    public void when020to002then2dot83() {
        Point a = new Point(0, 2, 0);
        Point b = new Point(0, 0, 2);
        double expected = 2.83;
        Assert.assertEquals(expected, a.distance3d(b), 0.01);
    }

    @Test
    public void when222to002then3dot46() {
        Point a = new Point(2, 2, 2);
        Point b = new Point(0, 0, 0);
        double expected = 3.46;
        Assert.assertEquals(expected, a.distance3d(b), 0.01);
    }

}