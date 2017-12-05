package Abstract;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {

    }

    public void walk(){
        System.out.println("This animal walks on " + legs + " legs.");
    }

    public abstract void eat();
}
