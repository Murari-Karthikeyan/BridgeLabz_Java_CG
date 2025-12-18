import java.util.Arrays;

public class NumberChecker {

    /* ================= DIGIT METHODS ================= */

    // Count digits
    public static int countDigits(int number) {
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Store digits in array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        number = Math.abs(number);

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    /* ================= BASIC CHECKS ================= */

    // Duck number (contains 0)
    public static boolean isDuck(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int power = digits.length;
        int sum = 0;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    /* ================= LARGEST & SMALLEST ================= */

    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    /* ================= SUM OPERATIONS ================= */

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Harshad number
    public static boolean isHarshad(int number) {
        int sum = sumOfDigits(getDigits(number));
        return number % sum == 0;
    }

    /* ================= FREQUENCY ================= */

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    /* ================= PALINDROME ================= */

    public static int[] reverseDigits(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rev[i] = digits[digits.length - 1 - i];
        }
        return rev;
    }

    public static boolean areArraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] rev = reverseDigits(digits);
        return areArraysEqual(digits, rev);
    }

    /* ================= SPECIAL NUMBERS ================= */

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        return sumOfDigits(getDigits(square)) == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        for (int d : getDigits(number)) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        return String.valueOf(number * number).endsWith(String.valueOf(number));
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    /* ================= FACTORS ================= */

    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++)
            if (number % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++)
            if (number % i == 0) factors[index++] = i;

        return factors;
    }

    public static int greatestFactor(int[] factors, int number) {
        int greatest = 1;
        for (int f : factors)
            if (f != number && f > greatest)
                greatest = f;
        return greatest;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0) sum += i;
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0) sum += i;
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++)
            if (number % i == 0) sum += i;
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        for (int d : getDigits(number)) {
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
        }
        return sum == number;
    }

    /* ================= MAIN METHOD ================= */

    public static void main(String[] args) {

        int number = 153;
        int[] digits = getDigits(number);

        System.out.println("Digits Count: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck Number: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(number));

        int[] large = largestAndSecondLargest(digits);
        int[] small = smallestAndSecondSmallest(digits);

        System.out.println("Largest: " + large[0] + ", Second Largest: " + large[1]);
        System.out.println("Smallest: " + small[0] + ", Second Smallest: " + small[1]);

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Harshad: " + isHarshad(number));

        System.out.println("Palindrome: " + isPalindrome(number));
        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));

        int[] factors = getFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }
}
