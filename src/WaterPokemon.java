import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";

    public static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used surf on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 70 hp");
                enemy.setHp(enemy.getHp() - 70);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used hydro pump on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 80 hp");
                enemy.setHp(enemy.getHp() - 80);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used hydro cannon on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 85 hp");
                enemy.setHp(enemy.getHp() - 85);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 65 hp");
                enemy.setHp(enemy.getHp() - 65);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used rain dance on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " gains 15 hp");
                enemy.setHp(enemy.getHp() + 15);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "electric" -> {
                System.out.println("has no effect on " + enemy.getName());
                enemy.setHp(enemy.getHp());
            }
            case "water" -> {
                System.out.println(enemy.getName() + " gains 20 hp");
                enemy.setHp(enemy.getHp() + 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");

    }
public List<String>getAttacks(){
        return attacks;
}

    @Override
    public void eatFood(){
        System.out.println(getName() + " eats " + getFood() + " and had gained 30 hp");
        setHp(getHp() + 30);
    }
}

