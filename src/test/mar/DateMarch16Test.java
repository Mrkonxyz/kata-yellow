package test.mar;

import main.Y2025.mar.DateMarch16;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DateMarch16Test {

    @Nested
    class CreatePhoneNumberTests {
        @Test
        void CreatePhoneNumberTests1() {
            var numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

            var excpected = "(123) 456-7890";
            var actual = DateMarch16.createPhoneNumber(numbers);
            assertEquals(excpected, actual);
        }
    }

    @Test
    public void arrayDiff() {
        assertArrayEquals(new int[] {2}, DateMarch16.arrayDiff(new int [] {1,2}, new int[] {1}));
        assertArrayEquals(new int[] {2,2}, DateMarch16.arrayDiff(new int [] {1,2,2}, new int[] {1}));
        assertArrayEquals(new int[] {1}, DateMarch16.arrayDiff(new int [] {1,2,2}, new int[] {2}));
        assertArrayEquals(new int[] {1,2,2}, DateMarch16.arrayDiff(new int [] {1,2,2}, new int[] {}));
        assertArrayEquals(new int[] {}, DateMarch16.arrayDiff(new int [] {}, new int[] {1,2}));
    }

    @Test
    void isNarcissistic() {
        assertTrue(DateMarch16.isNarcissistic(153), "153 is narcissistic");
        assertTrue(DateMarch16.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(DateMarch16.isNarcissistic(112), "112 is not narcissistic");
    }

    @Test
    public void basicTests() {
        assertEquals(3, DateMarch16.persistence( 39), "Incorrect answer for n=39" );
        assertEquals(0, DateMarch16.persistence(  4), "Incorrect answer for n=4"  );
        assertEquals(2, DateMarch16.persistence( 25), "Incorrect answer for n=25" );
        assertEquals(4, DateMarch16.persistence(999), "Incorrect answer for n=999");
    }

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, DateMarch16.countPassengers(list));
    }

   @Nested
            class isPrime {
                @Test
                public void testBasic() {
                    assertFalse(DateMarch16.isPrime(0), "0  is not prime");
                    assertFalse(DateMarch16.isPrime(1), "1  is not prime");
                    assertTrue (DateMarch16.isPrime(2), "2  is prime");
                    assertTrue (DateMarch16.isPrime(73), "73 is prime");
                    assertFalse(DateMarch16.isPrime(75), "75 is not prime");
                    assertFalse(DateMarch16.isPrime(-1), "-1 is not prime");
                }

                @Test
                public void testPrime() {
                    assertTrue(DateMarch16.isPrime(3), "3 is prime");
                    assertTrue(DateMarch16.isPrime(5), "5 is prime");
                    assertTrue(DateMarch16.isPrime(7), "7 is prime");
                    assertTrue(DateMarch16.isPrime(41), "41 is prime");
                    assertTrue(DateMarch16.isPrime(5099), "5099 is prime");
                }

                @Test
                public void testNotPrime() {
                    assertFalse(DateMarch16.isPrime(4), "4 is not prime");
                    assertFalse(DateMarch16.isPrime(6), "6 is not prime");
                    assertFalse(DateMarch16.isPrime(8), "8 is not prime");
                    assertFalse(DateMarch16.isPrime(9), "9 is not prime");
                    assertFalse(DateMarch16.isPrime(45), "45 is not prime");
                    assertFalse(DateMarch16.isPrime(-5), "-5 is not prime");
                    assertFalse(DateMarch16.isPrime(-8), "-8 is not prime");
                    assertFalse(DateMarch16.isPrime(-41), "-41 is not prime");
                }
            }
}