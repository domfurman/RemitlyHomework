package pl.remitly;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class Main {
    static String pathname = "./src/main/java/pl/remitly/policy.json";

    public static boolean verification() throws IOException {
        try {
            File file = new File(pathname);
            ObjectMapper objectMapper = new ObjectMapper();
            Policy policy = objectMapper.readValue(file, Policy.class);
            List<Policy.Statement> l = policy.getPolicyDocument().getStatement();
            String resourceValue = l.get(l.size()-1).getResource();
            if (Objects.equals(resourceValue, "*")) {
                return false;
            } else {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(Main.verification());
    }
}