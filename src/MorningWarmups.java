public class MorningWarmups {
    public static void main(String[] args) {

        System.out.println(noAsterisk(100, 5));
    }

    // TODO Create your multiplication method without the * operator (Hint: a loop might be helpful).

    public static long noAsterisk(long num, long times) {
        long n = num;
        for (long i = 1; i < times; i++) {
            num += n;
        }
        return num;
    }
}
