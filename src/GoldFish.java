public class GoldFish extends Animal{
    public GoldFish(String name){
        super(name);
    }

    //It is useless to have this method for a goldFish, but we are
    //forced to have it since GoldFish is inheriting from Animal!
    //This inheriteance violates Liskov's substitution principle
    //
    public void makeSound(){
        System.out.println("No Sound!");
    }
}
