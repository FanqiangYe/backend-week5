import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";

    public static final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used inferno storm on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 70 hp");
                enemy.setHp(enemy.getHp() - 70);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used pyroball on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used fire lash on " + enemy.getName());
        switch (enemy.getType()) {
                case "grass" -> {
                    System.out.println(enemy.getName() + " loses 50 hp");
                    enemy.setHp(enemy.getHp() - 50);
                }
                case "fire" -> {
                    System.out.println(enemy.getName() + " loses 20 hp");
                    enemy.setHp(enemy.getHp() - 20);
                }
                case "electric" -> {
                    System.out.println(enemy.getName() + " loses 30 hp");
                    enemy.setHp(enemy.getHp() - 30);
                }
                case "water" -> {
                    System.out.println(enemy.getName() + " loses 40 hp");
                    enemy.setHp(enemy.getHp() - 40);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used flamethrower on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 85 hp");
                enemy.setHp(enemy.getHp() - 85);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 55 hp");
                enemy.setHp(enemy.getHp() - 55);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 65 hp");
                enemy.setHp(enemy.getHp() - 65);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 75 hp");
                enemy.setHp(enemy.getHp() - 75);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public List<String> getAttacks() {
        return attacks;
    }

    @Override
    public void eatFood(){
        System.out.println(getName() + " eats " + getFood() + " and had gained 30 hp");
        setHp(getHp() + 30);
    }

}
