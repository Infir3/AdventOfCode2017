import java.util.List;

public class Checksum {
    public int calculateChecksum(List<String> input) {

        int checksum = 0;

        for (String line : input) {
            int largestValue = Character.getNumericValue(line.charAt(0));
            int smallestValue = largestValue;
            for (char c : line.toCharArray()) {
                int number = Character.getNumericValue(c);
                if (number > largestValue) {
                    largestValue = number;
                } else if (number < smallestValue) {
                    smallestValue = number;
                }
            }

            int diff = largestValue - smallestValue;
            checksum += diff;
        }

        return checksum;
    }
}
