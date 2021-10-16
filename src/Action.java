import java.util.ArrayList;

public class Action {
    private int type;
    private final ArrayList<Player> members = new ArrayList<Player>();
    static class Type {
        public static final int EATING = 0;
        public static final int TAKE_CARD = 1;
        public static final int END_MOVE = 2;
        public static final int END_OF_GAME = 3;
    }

    public Action(int type) {
        this.type = type;
    }

    public Action(int type, ArrayList<Player> members){
        this(type);
        this.members.addAll(members);
    }

    public Action(Player hunter, Player food){}

    public ArrayList<Player> getMembers() {
        return members;
    }

    public int getType() {
        return type;
    }
}
