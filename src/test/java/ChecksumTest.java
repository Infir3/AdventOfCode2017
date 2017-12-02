import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChecksumTest {
    private static Checksum checksum = new Checksum();

    @Test
    public void calculateChecksum() throws Exception {
        List<String> input = new ArrayList<>();
        input.add("5195");
        input.add("753");
        input.add("2468");
        assertEquals(18, checksum.calculateChecksum(input));
    }

    @Test
    public void calculateChecksumPuzzle() throws Exception {
        List<String> input = new ArrayList<>();
        File file = new File("checksum_puzzle.txt");

        Files.lines(Paths.get("C:/Users/Stefan/git/AdventOfCode2017/src/test/java/checksum_puzzle.txt")).forEach(line -> {
            input.add(line);
        });
        System.out.println(checksum.calculateChecksum(input));
//        assertEquals(18, checksum.calculateChecksum(input));
    }

}