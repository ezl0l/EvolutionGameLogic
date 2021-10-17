import java.util.*;

public class Game implements Handleable {
    private final int id;
    private int moveCounter = 0;
    private int phase = 0; // 0 - фаза развития, 1 - фаза определения кормовой базы, 2 - фаза питания, 3 - фаза вымирания и получения новых карт
    private final ArrayList<Card> deck = new ArrayList<Card>();
    private final ArrayList<Player> players = new ArrayList<Player>();

    public Game(int id) {
        this(id, false);
    }

    public Game(int id, boolean halvedDeck){
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public boolean addPlayer(Player player){
        return players.add(player);
    }

    public boolean addPlayers(Collection<Player> players){
        return this.players.addAll(players);
    }

    public boolean removePlayer(Player player){
        return players.remove(player);
    }

    public Map<Player, Animal> getAllAnimalsWithPlayers(){
        Map<Player, Animal> animalsWithPlayers = new HashMap<Player, Animal>();

        Object[] players = getPlayers().toArray(new Player[0]);
        Object[] animals;
        for(int i = 0; i < players.length; i++){
            animals = ((Player) players[i]).getAnimals().toArray();
            for(int j = 0; j < animals.length; j++){
                animalsWithPlayers.put((Player) players[i], (Animal) animals[j]);
            }
        }
        return animalsWithPlayers;
    }

    public ArrayList<Animal> getAllAnimals(){
        ArrayList<Animal> animals = new ArrayList<Animal>();

        Object[] players = getPlayers().toArray(new Player[0]);
        Object[] currentAnimals;
        for(int i = 0; i < players.length; i++){
            animals.addAll(((Player) players[i]).getAnimals());
        }
        return animals;
    }

    public void clearAllFood(){
        Object[] animals = getAllAnimals().toArray();
        for(int i = 0; i < animals.length; i++){
            ((Animal) animals[i]).clearFood();
        }
    }

    @Override
    public boolean handle() {
        if(moveCounter == 0){
            if(players.size() <= 0){
                return true;
            }
            Object[] players = getPlayers().toArray();
            for(int i = 0; i < players.length; i++){
                //((Player) players[i]).addCards()
            }
        }
        return true;
    }
}
