package pl.remitly;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Policy {

    @JsonProperty("PolicyName")
    private String PolicyName;
    @JsonProperty("PolicyDocument")
    private PolicyDocument PolicyDocument;

    @Getter
    public static class PolicyDocument {
        @JsonProperty("Version")
        private String Version;
        @JsonProperty("Statement")
        private List<Statement> Statement;
    }

    @Getter
    public static class Statement {
        @JsonProperty("Sid")
        private String Sid;
        @JsonProperty("Effect")
        private String Effect;
        @JsonProperty("Action")
        private List<String> Action;
        @JsonProperty("Resource")
        private String Resource;
    }
}

