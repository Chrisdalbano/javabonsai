import java.util.concurrent.ThreadLocalRandom;

public class Main {



    public static void main(String[] args) {
        int rn1 = ThreadLocalRandom.current().nextInt(1, 4);
        int rn2 = ThreadLocalRandom.current().nextInt(1, 4);
        int rn3 = ThreadLocalRandom.current().nextInt(1, 4);

        Bonsai tree = new Bonsai(rn1, rn2, rn3);
        tree.displayBonsai();
    }


}
