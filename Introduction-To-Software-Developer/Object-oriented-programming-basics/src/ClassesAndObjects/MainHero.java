package ClassesAndObjects;

public class MainHero {
    public static void main(String[] args) {
        Hero fireFist = new Hero(); // fireFist is reference variables from Hero class
        fireFist.name = "Fire Fist";
        System.out.println("Name of the Hero: " + fireFist.name);

        int punchDamage = fireFist.calculatePunchDamage();
        System.out.println("Your punch caused " + punchDamage + "% damage");

        // make your own hero from the Hero class (blueprint class)
        Hero frostBlizzard = new Hero();
        frostBlizzard.name = "Frost Blizzard";
        frostBlizzard.strength = 35;
        int specialAttackDamage = frostBlizzard.calculateSpecialAttackDamage("Ice Blast");
        System.out.println("Your Attack caused " + specialAttackDamage + "% damage");

    }
}
