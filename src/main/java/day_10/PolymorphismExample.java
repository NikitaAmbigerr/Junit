package day_10;

	// Parent class
	class Animal {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	// Child class 1
	class Dog extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	// Child class 2
	class Cat extends Animal {
	    @Override
	    void sound() {
	        System.out.println("Cat meows");
	    }
	}

	public class PolymorphismExample {
	    public static void main(String[] args) {
	        // Parent reference, child objects
	        Animal a;

	        a = new Dog();  // Dog object
	        a.sound();      // Output: Dog barks

	        a = new Cat();  // Cat object
	        a.sound();      // Output: Cat meows
	    }
	}


