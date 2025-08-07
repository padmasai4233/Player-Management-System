package model;

public class Player {
    private String name;
    private String role; // e.g., Batsman, Bowler, All-Rounder

    public Player(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
