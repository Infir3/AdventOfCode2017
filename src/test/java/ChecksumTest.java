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
        List<ChecksumLine> checksumLines = checksum.parseFile("C:/Users/Stefan/git/AdventOfCode2017/src/test/java/checksum_sample.txt");
        assertEquals(18, checksum.calculateChecksum(checksumLines));
    }

    @Test
    public void calculateChecksumPuzzle() throws Exception {
        List<ChecksumLine> checksumLines = checksum.parseFile("C:/Users/Stefan/git/AdventOfCode2017/src/test/java/checksum_puzzle.txt");
        System.out.println(checksum.calculateChecksum(checksumLines));
    }

}