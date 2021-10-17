public class Main {
    public static void main(String[] args) {
        Game mainGame = new Game(0);

        Player player0 = new Player("First player");
        Player player1 = new Player("Second player");
        mainGame.addPlayer(player0);
        mainGame.addPlayer(player1);

        while(mainGame.handle()) {
            Animal animal0 = player0.createAnimal();
            Animal animal1 = player1.createAnimal();
            //Animal animal2 = player1.createAnimal();

            animal0.addProperty(new Card(new Mimicry(), new Carnivorous()), true);
            animal1.addProperty(new Card(new Mimicry(), new Carnivorous()), false);

            System.out.println(player0.myAnimalEatAnimal(player1, animal1, animal0));

            System.out.println(animal1.isLive() + " " + animal0.getFood());
            mainGame.clearAllFood();
            animal1.revive();
            System.out.println(animal1.isLive() + " " + animal0.getFood());
        }
    }
}
