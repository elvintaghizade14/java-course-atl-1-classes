package az.atlacademy.se.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerCompareApp {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("amy", 100));
        players.add(new Player("david", 100));
        players.add(new Player("heraldo", 50));
        players.add(new Player("aakansha", 75));
        players.add(new Player("aleksa", 150));

        System.out.println("Before sort:");
        players.forEach(System.out::println);

        Collections.sort(players);

        System.out.println("After default sort:");
        players.forEach(System.out::println);

        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                if (p1.score != p2.score) {
                    return p2.score - p1.score;
                } else {
                    return p1.name.compareTo(p2.name);
                }
            }
        });

        System.out.println("After sort:");
        players.forEach(System.out::println);

        Collections.sort(players, (p1, p2) -> {
            if (p1.score != p2.score) {
                return p2.score - p1.score;
            } else {
                return p1.name.compareTo(p2.name);
            }
        });

        System.out.println("After sort:");
        players.forEach(System.out::println);

    }

}
