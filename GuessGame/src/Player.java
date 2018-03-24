import java.util.Random;

/**
 * @author zhang
 */
class Player {
    int number = 0;

    void guess() {
        number = new Random().nextInt(10);
        System.out.println("I'm guessing" + number);
    }
}
