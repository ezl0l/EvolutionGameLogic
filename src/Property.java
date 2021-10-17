public class Property {
    private int id;
    private String name;
    private String description;
    private int type;
    private int food;

    public Property(int id, String name, String description, int type, int food) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.food = food;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.printf("ID: %s\nName: %s\nDescription: %s\nType: %s%n", id, name, description, type);
    }

    public boolean onAction(Game game) {
        return true;
    }

    static class Types {
        public static final int CANT_EAT = 0;
    }
}
