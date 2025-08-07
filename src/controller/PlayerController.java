package controller;

import model.Player;
import view.PlayerView;
import java.util.*;

public class PlayerController {
    private List<Player> players = new ArrayList<>();
    private PlayerView view = new PlayerView();

    public void addPlayer(String name, String role) {
        Player player = new Player(name, role);
        players.add(player);
    }

    public void removePlayer(String name) {
        players.removeIf(p -> p.getName().equalsIgnoreCase(name));
    }

    public void displayAllPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players found.");
        } else {
            for (Player player : players) {
                view.displayPlayer(player);
            }
        }
    }
}
