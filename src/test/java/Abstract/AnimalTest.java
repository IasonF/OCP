package Abstract;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void Test1() throws Exception {
        Animal animal = new Spider(8);
        animal.eat();
        animal.walk();

        Spider spider = new Spider(8);
        spider.eat();
        spider.walk();
    }

    @Test
    public void Test2() {
        Pet p;
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();

        Animal a = new Cat();
        a.eat();
        a.walk();
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();

        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();

        a = new Fish();
        a.eat();
        a.walk();
    }

    @Test
    public void Test3(){
        Spider s = new Spider(8);
        Cat c = new Cat();
        Fish f = new Fish();
        Pet.playWithAnimal(s);
        Pet.playWithAnimal(c);
        Pet.playWithAnimal(f);
    }

}