package miscLib;
public abstract class GenLib {

	public static int genInt(int start, int end) {
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		return ( (int)(Math.random() * (end - start + 1)) + start );
	}


}