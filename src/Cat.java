
public class Cat extends Animal {

	
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public void makeSound () {
		System.out.println(super.getName() + ", the cat Meows!");
	}

}
