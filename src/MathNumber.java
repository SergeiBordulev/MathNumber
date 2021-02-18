import java.util.Scanner;

public class MathNumber {
    private static int getDigitsCount(int number) {
        int count = (number == 0) ? 1 : 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number:");
        int enteredNumber = scanner.nextInt();

        int allDigitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;
        int divider2 = 1;
        int divider1 = 10;
        int digitsCount = getDigitsCount(enteredNumber);

        for (int i = 1; i <= digitsCount; i++) {
            int currentDigit = enteredNumber % divider1 / divider2;
            allDigitsSum += currentDigit;

            if (currentDigit % 2 != 0) {
                oddDigitsSum += currentDigit;
            }

            if (maxDigit < currentDigit) {
                maxDigit = currentDigit;
            }

            divider2 *= 10;
            divider1 *= 10;
        }

        System.out.println("Sum of all digits: " + allDigitsSum);
        System.out.println("The sum of the odd digits: " + oddDigitsSum);
        System.out.println("The maximum digit: " + maxDigit);
    }
}
