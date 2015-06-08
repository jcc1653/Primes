	/**
	 * SmartBear Software, Inc.
	 * Demo File
	 * 02/31/201123
	 */
public class Prime
{
	// Main subroutine
	public static void main( String[] args )
	{
		// Parse integer input
		int n = new Integer( args[0] );
		
		// Determine the n'th prime number
		int prime = PrimeUtils.getPrime( n );
		
		// Print the result
		System.out.println( n + "th prime number: " + prime );
	}
}
