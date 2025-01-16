package main;


/**
 * Class for Hedgehog
 * @author asheque
 */
public class Hedgehog {
    private String name;
    private int age;

    // Constructor
    public Hedgehog(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Get name
    public String getName(String name){
        return name;
    }
    // Get age
    public int getAge(int age){
        return age;
    }
    // Set name
    public void setName(String name){
        this.name = name;
    }
    // Set age
    public void setAge(int age){
        this.age = age;
    }

    // Methods
    // Hedgehog can speak
    public void speak(String userInput){
        if(userInput == null | userInput.isEmpty()){
            System.out.println("I am " + name + " and my age is " + age + ", but could you still give me input values?");
        }else{
            System.out.println(name + ": " + userInput);
        }
    }

    // Hedgehog can run
    public void run(int laps){
        for (int i = 0; i < laps; i++){
            System.out.println(name + " runs really fast!");
        }
    }

}
