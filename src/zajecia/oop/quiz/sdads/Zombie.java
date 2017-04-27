package zajecia.oop.quiz.sdads;

/**
 * Created by Szymon on 2017-04-27.
 */
public class Zombie implements Monster {

    private int healthPoints;

    @Override
    public void attack() {
        System.out.println("Attack with axe");
    }

    @Override
    public void defense() {
        System.out.println("Defense with shield");
    }

    public void eatBrain(String brain) {
        System.out.println("Earing");
        healthPoints += 10;
    }
}
