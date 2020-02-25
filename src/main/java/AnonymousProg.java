
public class AnonymousProg {

	/*The modification is applicable only to the current object, 
	 * and not the class itself. So if we create another object of that class,
	 * the start method's implementation will be the one defined in the class. 
	 * Note: It Override the Method of the class
	 */
	public static void main(String[ ] args) {
        Machine m1 = new Machine() {
            @Override public void start() {
                System.out.println("Wooooo");
            }
        };
         Machine m2 = new Machine();
         m2.start();
    }
}
