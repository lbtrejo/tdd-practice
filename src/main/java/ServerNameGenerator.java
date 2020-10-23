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

    public static String getRandomElementFromArray(String[] stringArray){
        return stringArray[(int)(Math.random()*(stringArray.length-1)+1)];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", getRandomElementFromArray(nounArray), getRandomElementFromArray(adjectiveArray));
    }
}
