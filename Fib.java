/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
	if (n == 1 || n == 2)
		return 1;
	else if (n < 1)
		return 0;
	else
		return fib_recurrence(n-1) + fib_recurrence(n-2);
    }
     /* These are class / instance methods because...
		UserOfFib does not create an instance of this class, and directly invokes the method.
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        int num0 = 0; // pre-number
		int num1 = 1; // first number of fibonacci sequence
		int temp;
		int currentFib = 1; // "n", or the number of num1
		if (n == 0) return 0;
		
		while (currentFib < n){
			temp = num0;
			num0= num1;
			num1 = temp + num1;
			currentFib++;
		}
		return num1;
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count 
	   the number of times currentFib is incremented
       
       Then cost of the the recurrence algorithm
       grows proportional to n
       as the size of the problem increases,
       because as "n" increases, two more invocations of the method are needed.  
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
		double phi = (1 + Math.sqrt(5)) / 2;
		double psi = (1 - Math.sqrt(5)) / 2;
        return ( Math.pow( phi , n) 
				-  Math.pow( psi, n) ) 
				/ Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count the (?)
       
       Then cost of the the recurrence algorithm
       remains constant	   
       as the size of the problem increases,
       because the same number of operations are being performed is not dependent on n.
     */
}
