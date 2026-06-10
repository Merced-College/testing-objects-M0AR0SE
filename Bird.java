public class Bird {

    private String species;
    private int age;
    private String color;

    // Default constructor
    public Bird() {
        species = "Unknown";
        age = 0;
        color = "Gray";
    }

    // Parameterized constructor
    public Bird(String species, int age, String color) {
        this.species = species;
        this.age = age;
        this.color = color;
    }

    // Getters and setters
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{species='" + species + "', age=" + age + ", color='" + color + "'}";
    }
}


