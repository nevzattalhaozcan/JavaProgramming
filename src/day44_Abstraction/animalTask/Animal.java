package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name, size;
    private final String breed, color;
    private final char gender;
    private int age;

    public final static boolean canBreath;

    static {
        canBreath = true;
    }

    public Animal(String name, String size, String breed, String color, char gender, int age) {
        setName(name);
        setSize(size);
        setAge(age);
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        }else {
            throw new RuntimeException("Invalid gender: " + gender);
        }
        if (!color.isEmpty()) {
            this.color = color;
        } else {
            throw new RuntimeException("Color cannot be empty");
        }
        if (!breed.isEmpty()) {
            this.breed = breed;
        } else {
            throw new RuntimeException("Breed cannot be empty");
        }
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setSize(String size) { //TODO Try to use different way for assignment
        if(size.equals("small") || size.equals("middle") || size.equals("big")){
            this.size = size;
        }else{
            throw new RuntimeException("Invalid size: " + size);
        }
    }

    public void setAge(int age) {
        if(age < 0){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public abstract void eat();

    public final void drink(){
        System.out.println(name + " is drinking water.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + // this gets the class' name, getName() is more detailed
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal

		Create the following subclasses of Animal:
				Dog
					eat(): eats Pizza

				Cat
					eat(): eats Biryani

				Tiger
					eat(): eats deer

				Parrot
					eat(): eats chocolate

				Eagle
					eat(): eats snake
 */