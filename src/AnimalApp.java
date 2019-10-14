
public class AnimalApp {
	
	public static void main (String [] args) {
		
		//Animal a1 = new Animal ("Some Animal");
		Animal a2 = new Cat ("Fluffy");
		
		Animal a3 = new Dog ("Sparky");
		Dog d3 = new Dog ("Spot");
		
		Cat c1 = new Cat ("MyCat");
		c1.makeSound();
		
		//a3.makeSound(a3.get);
		
		Dog newDog = (Dog)a3;
		
		newDog.fetchBall();
		
		a3.makeSound();
		d3.makeSound();
		d3.fetchBall();
		//a3.fetchBall();  //This won't work because fetchBall is not a method 
		//that is defined in the parent class (i.e. Animal). so a3 is not 
		//able to resolve this at run time.
	}

}
