package pl.remitly;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    static String pathname = "./src/main/java/pl/remitly/policy.json";

    public static void main(String[] args) throws IOException {
        try {
//            File file = new File("./src/main/java/pl/remitly/policy.json");

            File file = new File(pathname);
            ObjectMapper objectMapper = new ObjectMapper();
            Policy policy = objectMapper.readValue(file, Policy.class);
            List<Policy.Statement> l = policy.getPolicyDocument().getStatement();
            System.out.println(l.get(l.size()-1).getResource());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}