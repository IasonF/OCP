package Abstract;

public class Spider extends Animal {
    public Spider(int legs) {
        super(legs);
    }

    @Override
    public void eat() {
        System.out.println("The spider eats a fly");
    }
}
