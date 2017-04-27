package zajecia.oop.quiz.sdads;

/**
 * Created by Szymon on 2017-04-27.
 */
public class App {
    public static void main(String[] args) {
        Zombie zombie = new Zombie();
        Archer archer = new Archer();

        Monster someMonster = new Zombie();
        Monster someMonster2 = new Archer();


        Monster[] monsters = {someMonster, someMonster2, zombie, archer};
    }

    public static void attackWithAll(Monster[] monsters) {
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].attack();
        }
    }
}
