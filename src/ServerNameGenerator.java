public class ServerNameGenerator {

    // TODO Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    public static String[] adjectives = {
            "maddening",
            "great",
            "lacking",
            "sophisticated",
            "observant",
            "wiry",
            "dusty",
            "befitting",
            "vigorous",
            "venomous"
    };

    public static String[] nouns = {
            "celebration",
            "debt",
            "negotiation",
            "selection",
            "maintenance",
            "message",
            "photo",
            "conversation",
            "profession",
            "bread"
    };

    // https://stackoverflow.com/questions/8065532/how-to-randomly-pick-an-element-from-an-array

    // TODO Create a method that will return a random element from an array of strings.

    public static String getRandom(String[] array) {
        int rnd = (int) (Math.random() * array.length);
        return array[rnd];
    }

    // TODO Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static void main(String[] args) {
        String message = String.format("Your server's name is now: %s-%s", getRandom(adjectives), getRandom(nouns));
        System.out.println(message);
    }
}