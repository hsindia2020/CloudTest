/**
 * 
 */
package configLogs;

/**
 * @author Harmeet
 * To achieve encapsulation in Java, declare the class' variables as private 
 * and provide public setter and getter methods to modify and view the variables' values.
 * In summary, encapsulation provides the following benefits:
 * - Control of the way data is accessed or modified
 * - More flexible and easily changed code
 * - Ability to change one part of the code without affecting other parts
 */

public class GetSetmain extends Vehicle{

	/**
	 * @param args
	 * Getters and setters allow us to have control over the values. 
	 * You may, for example, validate the given value in the setter  
	 * before actually setting the value.
	 */
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Green"); 
		v1.setColor("Red");
		System.out.println("Get the private variable "+v1.getColor());
		System.out.println("Get the private variable "+v2.getColor());
		System.out.println("Extends class ");
		v1.eat();
	    }
}
