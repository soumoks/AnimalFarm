
public abstract class Animal {
	
	private String name;
	
	public Animal (String name) {
		this.setName(name);
		
	}

	public abstract void makeSound (); //{
		//System.out.println("Animal making a sound" );
	//}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
