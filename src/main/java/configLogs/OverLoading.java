/**
 * 
 */
package configLogs;

/**
 * @author Harmeet
 *Methods have the same name, but different parameters, it is known as method overloading.
 *This can be very useful when you need the same method functionality for different types of parameters.
 */
public class OverLoading {

	/**
	 * However, we might want to use it for doubles, as well. 
	 * For that, you need to overload the max method:
	 * Now, our max method will also work with doubles.
	 * An overloaded method must have a different argument list; 
	 * the parameters should differ in their type, number, or both.
	 * @param args
	 */
	static double max(double a, double b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }
    static int max(int a, int b) {
        if(a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {        
        System.out.println(max(8, 17));
        System.out.println(max(3.14, 7.68));
        System.out.println(max(2.14, 4.68));
    }

}

/* Subclass can define a behavior that's specific to the subclass type, 
 * meaning that a subclass can implement a parent class method based on its requirement.
 * This feature is known as method overriding.
 class Animal {           
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Program {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}      OutPut -- Meow*/
