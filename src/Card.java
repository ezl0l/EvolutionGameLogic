public class Card {
    private int id;
    private String name;
    private String description;
    private AdditionalProperty property;

    public Card(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void info(){
        System.out.println(String.format("ID: %s\nName: %s\nDescription: %s", id, name, description));
    }
}
