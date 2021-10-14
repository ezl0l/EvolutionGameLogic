public class AdditionalProperty extends Card {
    private int id;
    private String name;
    private String description;
    private static int type;

    public AdditionalProperty(int id, String name, String description, int type) {
        super(id, name, description);
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
