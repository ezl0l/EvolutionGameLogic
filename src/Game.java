import java.util.ArrayList;

public class Game {
    private final int id;
    private final ArrayList<Player> players = new ArrayList<Player>();

    public Game(int id) {
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

    public boolean removePlayer(Player player){
        return players.remove(player);
    }
}
