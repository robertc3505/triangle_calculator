import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MainTest {
    @Test
    public void sorting() {
        String[] arr = {"c", "a", "b"};
        String[] expected = {"a", "b", "c"};
        Arrays.sort(arr);
        assertArrayEquals(expected, arr);
    }
    @Test
    public void area_calculator() {
        int a = 5;
        int b = 4;
        int c = (a*b)/2;
        int expected = 10;
        assertEquals(c, expected);
    }
    @Test
    public void false_triangle() {
        int a = 4;
        int b = 3;
        int c = 7;
        boolean statement = a+b <= c;
        if (statement) {
            System.out.println("The Triangle is False!");
        }
        String expected = "True";
        assertTrue(expected, true);
    }
}
