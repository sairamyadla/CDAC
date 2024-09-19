class Animal {
    protected String name; 

    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name); 
    }
    public void bark() {
        System.out.println(name + " is barking.");
    }
}


public class Program1 {
    public static void main(String[] args) {
        
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.eat();  
        genericAnimal.sleep();  

        System.out.println(); 

        
        Dog dog = new Dog("puppy");
        dog.eat();    
        dog.sleep(); 
        dog.bark();   
    }
}
