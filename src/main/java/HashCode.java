import java.util.Objects;

public class HashCode {

		   private int x;
		   /* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			return Objects.hash(x);
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			HashCode other = (HashCode) obj;
			return x == other.x;
		} 
		   public static void main(String[ ] args)  {
			   HashCode a = new HashCode();
		    a.x = 9;
		    HashCode b = new HashCode();
		    b.x = 5;
		    System.out.println(a.equals(b));
		   }
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={2,5,9};
		int i;

		for(i=0;i<=2;i++) {
			System.out.println("This is the value of array "+arr[i]);
		}

	}*/
}