package exercises.inheritance.main;

public class AbstractEntity {
    private static int nextId = 0;
    private int id;

    public AbstractEntity() {
        this.id = this.nextId;
        this.nextId++;
    }

    public int getId() {
        return id;
    }
}
