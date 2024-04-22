package pl.remitly;

import org.junit.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void FileFindingTest() {

        String fileToFind = "policy.json";

        File result = Main.searchForFileInParentDirectory(fileToFind);

        assertEquals(Main.fileNameRequired, result.getName());
        assertNotNull(result, "File is empty");
    }
}
