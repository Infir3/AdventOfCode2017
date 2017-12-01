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
}
