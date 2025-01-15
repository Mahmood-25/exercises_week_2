package main;



public class Hedgehog {
    private String name;
    private int age;

    public Hedgehog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(String name){
        return name;
    }

    public int getAge(int age){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void speak(){
        System.out.println("What does hedgehog say?");
        System.out.println();
        System.out.println("I am " + name + " and my age is " + age + ", but could you still give me input values?");
    }

    public void run(int laps){
        for (int i = 0; i < laps; i++){
            System.out.println(name + " runs really fast!");
        }
    }

}
