
public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void makeSound () {
		System.out.println(getName() + ", Dog barks!");
	}
	public void fetchBall() {
		System.out.println(getName() + ", Fetching the ball!");
	}

}
