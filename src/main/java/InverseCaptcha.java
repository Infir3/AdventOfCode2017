public class InverseCaptcha {
    public int solveCaptcha(String input) {
        int sum = 0;

        int currentDigit;
        int lastDigit;

        lastDigit = Character.getNumericValue(input.charAt(input.length() -1 ));

        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            currentDigit = Character.getNumericValue(c);
            if (currentDigit == lastDigit) {
                sum += currentDigit;
            }
            lastDigit = currentDigit;
        }

        return sum;
    }

    public int solveCaptchaCircular(String input) {
        int sum = 0;

        int currentDigit;
        int nextDigit;

        int currentPos = 0;
        int stepsForward = input.length() / 2;

        char[] charArray = input.toCharArray();

        nextDigit = getNextCircularNumber(charArray, 0, stepsForward);
        for (char c : charArray) {
            currentDigit = Character.getNumericValue(c);
            if (currentDigit == nextDigit) {
                sum += currentDigit;
            }
            nextDigit = getNextCircularNumber(charArray, currentPos + 1, stepsForward);
            currentPos++;
        }

        return sum;
    }

    private int getNextCircularNumber(char[] charArray, int currentPosition, int stepsForward) {
        int pos = currentPosition + stepsForward;
        if (pos >= charArray.length) {
            pos = pos % charArray.length;
        }
        return Character.getNumericValue(charArray[pos]);

    }
}
