public class Main {
    public static void main(String[] args) {
        Player player0 = new Player("Player 0");
        Player player1 = new Player("Player 1");

        Card card0 = new Card(new Mimicry(), new Hunter());
        Card card1 = new Card(new Mimicry(), new Hunter());

        Animal animal0 = player0.createAnimal();

        Animal animal1 = player1.createAnimal();

        boolean success = animal0.addProperty(card0, true) &&
                animal1.addProperty(card1, true);

        player0.getAnimal(animal0.getId()).showProperties();
        player1.getAnimal(animal1.getId()).showProperties();

        System.out.println(animal0.eatAnimal(animal1) + " " + success);
    }
}
