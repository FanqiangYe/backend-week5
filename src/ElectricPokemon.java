import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "electric";

    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "Hydrocanon", "RainDance");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used thunder punch on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used electro ball on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used thunder on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " gains 15 hp and " + name.getName() + (" gains 25 hp"));
                enemy.setHp(enemy.getHp() + 15);
                name.setHp(name.getHp() + 25);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 70 hp");
                enemy.setHp(enemy.getHp() - 70);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used volt tacke on " + enemy.getName());
        switch (enemy.getType()) {
            case "grass" -> {
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            }
            case "fire" -> {
                System.out.println(enemy.getName() + " loses 40 hp");
                enemy.setHp(enemy.getHp() - 40);
            }
            case "electric" -> {
                System.out.println(enemy.getName() + " loses 30 hp");
                enemy.setHp(enemy.getHp() - 30);
            }
            case "water" -> {
                System.out.println(enemy.getName() + " loses 60 hp");
                enemy.setHp(enemy.getHp() - 60);
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

