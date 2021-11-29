package co.onb.basicsofjava;

//How to create object and methods

public class Animal {

	public void Dog()
	{
		System.out.println("Am your pett");
	}
	

	public static void main(String[] args) {
		
Animal a= new Animal();
a.Dog();
a.eat();
Animal aa = new Animal();
aa.run();
Bird b=new Bird();
b.fly();

	}
	void eat()

{
		System.out.println("I am eating");
		}
	void run()
	
	{
		System.out.println("Am running");
	}
	}
class Bird{
	void fly()
	{
		System.out.println("Am flying");
	}
}

