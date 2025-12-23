package model;

public class Suspect {
    private int id;
    private String name;
    private String statement;
    private boolean guilty;

    public Suspect(int id, String name, String statement, boolean guilty) {
        this.id = id;
        this.name = name;
        this.statement = statement;
        this.guilty = guilty;
    }

    public String getName() {
        return name;
    }

    public String getStatement() {
        return statement;
    }

    public boolean isGuilty() {
        return guilty;
    }
}
