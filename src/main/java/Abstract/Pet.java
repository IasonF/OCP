package Abstract;

public interface Pet {
    public String getName();

    public void setName(String name);

    public void play();

    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            Pet p = (Pet) a;
            p.play();
        } else
            System.out.println("Danger. Wild Animal");
    }
}
