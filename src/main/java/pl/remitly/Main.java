package pl.remitly;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class Main {
    static String fileToSearch = "policy.json";
    static String fileNameRequired = "policy.json";

    public static File searchForFileInParentDirectory(String fileToFind) {
        Path currentPath = Paths.get("").toAbsolutePath();
        String path = currentPath.toString() + "/" + fileToFind;

        File file = new File(path);

        if (file.getName().equals(fileNameRequired)) {
            return file;
        } else {
            return null;
        }
    }

    public static Boolean verification(String fileToFind) throws IOException {
        try {
            File file = searchForFileInParentDirectory(fileToFind);
            ObjectMapper objectMapper = new ObjectMapper();
            Policy policy = objectMapper.readValue(file, Policy.class);
            List<Policy.Statement> l = policy.getPolicyDocument().getStatement();
            String resourceValue = l.get(l.size()-1).getResource();
            return !Objects.equals(resourceValue, "*");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Main.verification(fileToSearch));
    }
}