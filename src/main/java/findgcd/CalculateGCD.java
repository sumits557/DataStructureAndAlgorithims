package src.main.java.findgcd;

public class CalculateGCD {

    /**
     * This method takes two positive integers and finds their gcd using
     * Euclid's algorithm
     * @param a
     * @param b
     * @return
     */
    public int findGcd(int a, int b) {
        if (b == 0) return a;
        return findGcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(
                new CalculateGCD().findGcd(25, 10)); // expected value is 5.
    }


}
