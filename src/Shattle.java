import java.util.Random;
public class Shattle {
    public static void main(String[] args) {

    Random random = new Random();
        int shuttleCount = 0;
        int number = 1;

        while (shuttleCount < 100) {
            if (!containsUnluckyDigits(number)) {
                System.out.println("Космічний шатл #" + (shuttleCount + 1) + ": " + number);
                shuttleCount++;
            }
            number++;
        }
    }

    public static boolean containsUnluckyDigits(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 4 || digit == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}