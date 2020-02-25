package configLogs;

/**
 * 
 * @author Harmeet
 *The class above has two constructors, 
 *one without any parameters setting the color attribute to a default value of "Red", 
 *and another constructor that accepts a parameter and assigns it to the attribute.
 */
public class Vehicle {

	/**
	 * Get Set is used for the Accept and passing the value.
	 * Constructor as describe above
	 */
		private String color;
		protected int legs;

		public void eat() {
			legs = 4;
		    System.out.println("Animal runs with "+legs+" Legs");
		  }
/**
 * Below is the extends example without passing any value to main class Animal
 * Only protected/public variable, class and methods are extends through main class. 		
 * @return
 */
		/*class Animal { public void makeSound() {
			   System.out.println(''Hi'');     }   } 
		class Dog extends Animal {	}
		class A { public static void main(String args[]) {
			Dog dog = new Dog();
			dog.makeSound();                }    }  OutPut: Hi */
		
		
		// Getter
		public String getColor() {
		    return color;
		}

		// Setter
		public void setColor(String c) {
		    this.color = c;
		}

		Vehicle() {
	        this.setColor("Red");
	    }
	    Vehicle(String c) {
	        this.setColor(c);
	    }
}
