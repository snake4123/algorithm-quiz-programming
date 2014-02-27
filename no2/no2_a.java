import java.util.ArrayList;

public class no2_a {

	public class MyStack {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		public void push( int value ) {
			stack.add(value);
		}

		public int pop( ) {
			int rtn;
			if( stack.isEmpty() ) {
				System.out.println( "スタックは空です." );
				System.exit( 1 );
			}

			rtn = stack.get( 0 );
			stack.remove( 0 );

			return rtn;
		}
		public int peek() {
			int rtn;
			rtn = stack.get(0);
			return rtn;
		}
	}

		/*public boolean empty();
		public int peek();
		public int pop() ;
		public int push(int value);
		public int size();*/

}

