import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServerNameGenerator {

    private static final String[] nounArray = {"fox", "giraffe", "ferret", "dog", "cat", "fly", "reindeer", "camel", "coyote", "hamster"};
    private static final String[] adjectiveArray = {"zippy", "vexed", "uptight", "timely", "selfish", "perplexed", "nervous", "joyous", "irritable", "graceful"};

    public static String[] getNounArray() {
        return nounArray;
    }

    public static String[] getAdjectiveArray() {
        return adjectiveArray;
    }
}
