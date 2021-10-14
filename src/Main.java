public class Main {
    public static void main(String[] args) {
        Animal animal0 = new Animal();
        Animal animal1 = new Animal();

        Card mimicry = new Mimicry();
        animal0.addProperty(mimicry);

        Card hunter = new Hunter();
        animal1.addProperty(hunter);

        System.out.println(animal1.isHunter() + " " + animal1.eatAnimal(animal0));
        System.out.println(animal0.isLive() + " " + animal1.isLive());
    }
}
