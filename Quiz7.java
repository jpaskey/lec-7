public class Pet {
  public String name;
  public String sound;
  
  public void Pet(String name) {
    this.name=name;
  }
  
  public void printName(Pet pet) {
    System.out.println(pet.name);
  }
  
  public void makeNoise() {
    System.out.println(this.name + " says " + this.sound +".");
  }
  
}

public class Cat extends Pet {
  public int lives;
  
  public void Cat(String name, int lives) {
    super.name=name;
    super.sound="meow";
    this.lives=lives;
  }
  
}

public class Dog extends Pet {
  
  public void Dog(String name) {
    super.name=name;
    super.sound="woof";
  }
  
  public static void main(String[] args) {
    Collection animals = new ArrayList();
    Dog d1 = new Dog("Fido");
    Dog d2 = new Dog("Spot");
    animals.add(d1);
    animals.add(d2);
    Cat c1 = new Cat("Fluffy", 9);
    Cat c2 = new Cat("Mowzer", 8);
    Cat c3 = new Cat("Pig", 7);
    animals.add(c1);
    animals.add(c2);
    animals.add(c3);
    
    d1.printName();
    d2.printName();
    c1.printName();
    c2.printName();
    c3.printName();
    
    d1.makeNoise();
    c2.makeNoise();
  }
}