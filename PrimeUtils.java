	/**
	 * SmartBear Software, Inc.
	 * Demo File
	 * 02/31/1904
	 */
public class PrimeUtils
{	
	/**
	 * Utility to get the n'th prime number
	 *
	 * @param n the index of the prime number to return
	 * @return the n'th prime number
	 */
	public static int getPrime( int n )
	{
		int primeCounter = 0;
		int k;
		
		// Scan the primes
		for( k = 2 ; primeCounter < n ; ++k )
		{
			if ( isPrime( k ) )
				primeCounter++;
		}
		
		// Because the loop increments k an extra time before
		// realizing that we're done, return one less.
		return k - 1;
	}
	
	/**
	 * Utility to determine whether some number is prime.
	 *
	 * @param n the number to check
	 * @return true if <code>n</code> is prime, false if composite
	 */
	public static boolean isPrime( int n )
	{		
		// Scan for non-trivial divisors of n.
		for( int k = 2 ; k < n ; k++ )
		{
			if ( ( n % k ) == 0 )		// if anything divides us, we're composite
				return false;
		}
		return true;
	}
}
