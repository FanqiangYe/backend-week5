import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private static final String type = "grass";
    public static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used leaf storm on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 70 hp");
                enemy.setHp(enemy.getHp() - 70);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used solar beam on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 65 hp");
                enemy.setHp(enemy.getHp() - 65);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 85 hp");
                enemy.setHp(enemy.getHp() - 85);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 45 hp");
                enemy.setHp(enemy.getHp() - 45);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used leech seed on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + (" loses 10 hp and ") + name.getName() + ( "gains 10 hp"));
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + (" loses 40 hp and ") + name.getName() + ( "gains 40 hp"));
                enemy.setHp(enemy.getHp() - 40);
                name.setHp(name.getHp() + 40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + (" loses 30 hp and ") + name.getName() + ( "gains 30 hp"));
                enemy.setHp(enemy.getHp() - 30);
                name.setHp(name.getHp() + 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + (" loses 20 hp and ") + name.getName() + ( "gains 20 hp"));
                enemy.setHp(enemy.getHp() - 20);
                name.setHp(name.getHp() + 20);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used leave blade on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 20 hp");
                enemy.setHp(enemy.getHp() - 20);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 80 hp");
                enemy.setHp(enemy.getHp() - 80);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
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

