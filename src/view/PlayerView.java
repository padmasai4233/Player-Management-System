package view;

import model.Player;

public class PlayerView {
    public void displayPlayer(Player player) {
        System.out.println("Player Name: " + player.getName());
        System.out.println("Player Role: " + player.getRole());
        System.out.println("-------------");
    }
}
