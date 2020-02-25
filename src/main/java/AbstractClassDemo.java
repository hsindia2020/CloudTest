
/**
 * @author Harmeet
 *
 */
public class AbstractClassDemo{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tanishaphone obj = new Tanishaphone() {
			
			@Override
			void something() {
				System.out.println("Something...");
			}
		};
		obj.move();
		obj.make1();
		obj.doing();
		obj.something();
		}
}
