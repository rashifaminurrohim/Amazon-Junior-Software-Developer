import java.io.*;

abstract public class Animal implements Eat, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    // property representing name of the animal
    private String nameOfAnimal;

    // property representing weight
    private int weight;

    // property representing the height
    private int height;

    // property representing the age
    private int age;

    public Animal() {
        nameOfAnimal = "Unknown Animal";
    }

    public Animal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;

        // set default weight 200 and height 2 feet and age to 5 years
        this.weight = 200;
        this.height = 2;
        this.age = 5;
    }

    public String getNameOfAnimal() {
        return nameOfAnimal;
    }

    public void setNameOfAnimal(String nameOfAnimal) {
        this.nameOfAnimal = nameOfAnimal;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eatingFood() {
        System.out.println("The animal: " + nameOfAnimal + " is eating.");
    }

    public static void serializedAnimal(Animal animals, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(animals);
            System.out.println("Serialized animal data is saved in " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserializedAnimal(String filePath) {
        Animal animal = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))){
            animal = ((Animal) ois.readObject());
            System.out.println("Deserialized File:\n" +
                    animal.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
