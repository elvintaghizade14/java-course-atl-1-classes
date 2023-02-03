package az.atlacademy.module01.lesson16;

import java.util.Objects;

public class Player implements Comparable<Player> {
    int score;
    String name;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ",score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name);
    }

    @Override
    public int compareTo(Player that) {
        return this.score - that.score;
    }

//    @Override
//    public int compareTo(Player that) {
//        return that.name.compareTo(this.name);
//    }
}