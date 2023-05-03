package greene.ctis310;

public class Dog implements Comparable<Dog>{
    //attributes
    private String name;
    private int age;
    private String breed;
    private String color;
    private int barked = 0;

    //constructor that generates random values for each attribute
    public Dog() {
        //choose a random name from the list of names
        String[] names = {"Buddy", "Max", "Bella", "Lucy", "Charlie", "Daisy", "Molly", "Lola", "Sadie", "Maggie", "Bailey", "Sophie", "Chloe", "Duke", "Lily", "Harley", "Rocky", "Cooper", "Jack", "Stella", "Roxy", "Zoey", "Toby", "Bear", "Riley", "Lucky", "Leo", "Jax", "Scout", "Shadow", "Zeus", "Sam", "Gus", "Sammy", "Bentley", "Murphy", "Oliver"};
        int randomIndex = (int) (Math.random() * names.length);
        this.name = names[randomIndex];
        //choose a random age between 1 and 25
        this.age = (int) (Math.random() * 25) + 1;
        //choose a random breed from the list of 5 breeds
        String[] breeds = {"Labrador Retriever", "German Shepherd", "Golden Retriever", "French Bulldog", "Westie"};
        randomIndex = (int) (Math.random() * breeds.length);
        this.breed = breeds[randomIndex];
        //choose a random color from the list of 5 colors
        String[] colors = {"Black", "White", "Brown", "Tan", "Grey"};
        randomIndex = (int) (Math.random() * colors.length);
        this.color = colors[randomIndex];
    }
    

    public Dog(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }


    //implement the compareTo method
    @Override
    public int compareTo(Dog otherDog) {
        //if this dog's name is alphabetically before the other dog's name, return a negative number
        //if this dog's name is alphabetically after the other dog's name, return a positive number
        //if this dog's name is the same as the other dog's name, return 0
        return this.name.compareTo(otherDog.getName());
    }

    //create a method that makes the dog bark
    public void bark() {
        barked++;
    }


    //getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getBarked() {
        return barked;
    }

    public void setBarked(int barked) {
        this.barked = barked;
    }

    //toString
    @Override
    public String toString() {
        return "Dog [age=" + age + ", breed=" + breed + ", color=" + color + ", name=" + name + "]";
    }
}
