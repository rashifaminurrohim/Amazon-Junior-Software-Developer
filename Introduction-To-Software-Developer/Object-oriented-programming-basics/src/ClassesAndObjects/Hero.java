package ClassesAndObjects;

public class Hero {
    // properties of Hero
    String name = "Hero";
    int strength = 20;
    int health = 100;

    // move method in the PassingArgumentsToMethodClass and delete static, strength argument
    public int calculatePunchDamage() {
        return strength * 2;
    }

    public int calculateSpecialAttackDamage(String attackType){
        int damage = strength;
        if (attackType.equals("Fire Punch")){
            damage *= 3;
        } else if (attackType.equals("Ice Blast")) {
            damage *= 2;
        }
        return damage;
    }

}
