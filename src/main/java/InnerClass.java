class InnerClass {
	int id;
/*
 *Java supports nesting classes; a class can be a member of another class.
 *Creating an inner class is quite simple. Just write a class within a class. 
 *Unlike a class, an inner class can be private. Once you declare an inner class private, 
 *it cannot be accessed from an object outside the class. 
 */
	public class Brain {
		public void think() {
			System.out.println(id + " is thinking");
		}
	}

	InnerClass(int i) {
		id = i;
		Brain b = new Brain();
		b.think();
	}

	public static void main(String[] args) {
		InnerClass r = new InnerClass(23);
	}
}