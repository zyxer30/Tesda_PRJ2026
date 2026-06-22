import java.util.function.Predicate;

/***
 * Task16.java
 * 
 * Create a gorilla class which implements the animal interface.
 * Add this comment inside appropriate methods.
 * // lather, rinse, repeat
 * // pet at your own risk
 * // put gorilla food into cage
 * 
 * interface Animal {
 *  bolean feed(bolean timeToEat);
 *  void groom();
 *  void pet();
 * }
 */
public class Task16 {
    public static void main(String[] args) {

        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("The gorilla is eating.");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("The gorilla is being groomed.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("You tentatively pet the gorilla.");
    }
}
