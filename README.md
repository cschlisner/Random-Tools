# Random-Tools

To use it just make sure the tools directory is in the same directory as your program and
<code>import tools.*;</code>

###Factors.java

<code>getFactors(int n)</code> returns vector of all factors (non proper) of n.

<code>getFactors(int n, true)</code> returns vector of all proper divisors of n.

<code>getPrimes(int n)</code> returns array of all prime numbers <= n.

<code>isPrime(int n)</code> returns true if n is prime, else false.



####List.java

<code>binaryCount(int n)</code> returns array of every binary number <= n.

<code>factorial(int n)</code> returns n!

<code>permutations(int[] arr, lim)</code> returns two dimensional array of all (or s if s != -1) permutations of objects in arr.



###Print.java

<code>s(T s)</code> literally <code>System.out.print(s)</code>

<code>sln(T s)</code> literally <code>System.out.println(s)</code>

<code>array(int[][] arrarr)</code> prints 2d int array

<code>array(int[] arr)</code> prints int array

<code>array(T[][] arrarr)</code> prints 2d T array

<code>array(T[] arr)</code> prints T array

<code>triangle(int[][] t, int[] path)</code> prints a triangle of numbers <i>t</i>, with an index path <i>path</i> highlighted



###Sort.java

<code>swap(T[],int i, int j)</code> returns a T array with elements i and j switched

<code>swap(int[],int i, int j)</code> returns an int array with elements i and j switched

<code>size(int[] arr)</code> returns sorted (by size) copy of arr

<code>size(int[] base, int[] secondary)</code> returns sorted (by size of base) copy of secondary

<code>reverse(int[] arr)</code> returns reversed copy of arr

<code>maxVal(int[][] arrarr)</code> returns largest value in 2d array <i>arrarr</i>

<code>maxVal(int[] arr)</code> returns largest value in array <i>arr</i>

<code>sum(int[] arr)</code> returns sum of elements in arr

<code>alphabetical(String[] sarr)</code> returns sorted (alphabetically) copy of sarr

<code>compareWords(String a, String b)</code> returns true if <i>a</i> is before <i>b</i> in alphabet



###Timer.java

<code>Timer()</code> creates new timer object

<code>start()</code> sets a start time

<code>stop()</code> sets an end time

<code>getTime()</code> returns current elapsed time of timer (nanoseconds). 

<code>printTime()</code> prints the elapsed time in nanoseconds and seconds






