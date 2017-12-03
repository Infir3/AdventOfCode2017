import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Checksum {
    public List<ChecksumLine> parseFile(String filename) throws IOException {
        List<ChecksumLine> checksumLines = new ArrayList<>();
        Files.lines(Paths.get(filename)).forEach(line -> {
            String[] numberStrings = line.split("\\s+");
            List<Integer> numberList = new ArrayList<>();
            for (String numberString : numberStrings) {
                numberList.add(Integer.parseInt(numberString));
            }
            ChecksumLine checksumLine = new ChecksumLine();
            checksumLine.setNumbers(numberList);
            checksumLines.add(checksumLine);
        });
        return checksumLines;
    }

    public int calculateChecksum(List<ChecksumLine> checksumLines) {

        int checksum = 0;

        for (ChecksumLine line : checksumLines) {
            int largestValue = line.getNumbers().get(0);
            int smallestValue = largestValue;
            for (Integer number : line.getNumbers()) {
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
