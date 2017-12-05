import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void calculateChecksumModulo() throws Exception {
        List<ChecksumLine> checksumLines = checksum.parseFile("C:/Users/Stefan/git/AdventOfCode2017/src/test/java/checksum_modulo_sample.txt");
        assertEquals(9, checksum.calculateChecksumModulo(checksumLines));
    }

    @Test
    public void calculateChecksumModuloPuzzle() throws Exception {
        List<ChecksumLine> checksumLines = checksum.parseFile("C:/Users/Stefan/git/AdventOfCode2017/src/test/java/checksum_puzzle.txt");
        System.out.println(checksum.calculateChecksumModulo(checksumLines));
    }

}