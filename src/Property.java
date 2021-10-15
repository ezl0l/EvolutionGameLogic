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
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void info(){
        System.out.printf("ID: %s\nName: %s\nDescription: %s\nType: %s%n", id, name, description, type);
    }
}
