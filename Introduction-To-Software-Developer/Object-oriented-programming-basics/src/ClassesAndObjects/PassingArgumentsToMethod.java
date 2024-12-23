package ClassesAndObjects;

public class PassingArgumentsToMethod {

    public static int calculatePunchDamage(int strength) {
        return strength * 2;
    }

    public static int calculateSpecialAttackDamage(int strength, String attackType){
        int damage = strength;
        if (attackType.equals("Fire Punch")){
            damage *= 3;
        } else if (attackType.equals("Ice Blast")) {
            damage *= 2;
        }
        return damage;
    }

    public static void main(String[] args){
        int villainHealth = 100;
        int punchStrength = 20;
        String specialAttack = "Fire Punch";

        int remainingHealth = villainHealth - calculatePunchDamage(punchStrength);
        int damageBySpecialAttack = calculateSpecialAttackDamage(punchStrength, specialAttack);
        System.out.println("Villain's remaining health: " + remainingHealth);
    }

}
