package oop.project1;

public class Seat {
    private String name;

    public void reserve(String name) {
        this.name = name;
    }

    public void cancel() {
        name = null;
    }

    public String getName() {
        return name;
    }

    public boolean isOccupied() {
        return name != null;
    }

    public boolean match(String checkName) {
        return name != null && name.equals(checkName);
    }
}
