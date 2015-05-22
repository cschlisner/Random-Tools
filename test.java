import tools.*;
class test {
	public static void main(String[] args){
		int n = (args.length > 0)?Integer.valueOf(args[0]):4;
		int[] narr = {1,2,3,4};
		int[][] narrarr = {narr,narr,narr};
		String[] sarr = {"b","d","c","a"};
		String[][] sarrarr = {sarr,sarr,sarr};
		int[][] triangle = {{75},{95, 64},{17, 47, 82},{18, 35, 87, 10},{20, 4, 82, 47, 65}};
		int[] path = {0,1,1,2,3};

		// Factor.java
		Print.sln("---Factor.java---");
		Print.sln("getFactors: "); Print.vector(Factor.getFactors(n)); 
		Print.sln("");

		Print.sln("getPrimes: "); Print.array(Factor.getPrimes(n)); 
		Print.sln("");

		Print.sln("isPrime: "); Print.sln(Factor.isPrime(n)); 
		Print.sln("\n");


		// List.java
		Print.sln("---List.java---");
		Print.sln("binaryCount: "); Print.array(List.binaryCount(n));
		Print.sln("");

		Print.sln("factorial: "); Print.sln(List.factorial(n));
		Print.sln("");

		Print.sln("permutation: "); Print.array(List.permutation(narr));
		Print.sln("\n");

		// Print.java
		Print.sln("---Print.java---");
		Print.sln("array(int[][]): "); Print.array(narrarr);
		Print.sln("");

		Print.sln("array(int[]): "); Print.array(narr);
		Print.sln("");

		Print.sln("array(T[][]): "); Print.array(sarrarr);
		Print.sln("");

		Print.sln("array(T[]): "); Print.array(sarr);
		Print.sln("");

		Print.sln("vector: "); Print.vector(Factor.getFactors(n));
		Print.sln("");

		Print.sln("triangle: "); Print.triangle(triangle,path);
		Print.sln("");

		Print.sln("\n");

		// Sort.java
		Print.sln("---Sort.java---");

		Print.sln("swap(T[],int,int): "); Print.array(Sort.swap(sarr, 0, 1));
		Print.sln("");

		Print.sln("swap(int[],int,int): "); Print.array(Sort.swap(narr, 0, 1));
		Print.sln("");

		Print.sln("size(int[]): "); Print.array(Sort.size(narr));
		Print.sln("");

		Print.sln("size(int[],int[]):"); Print.array(Sort.size(narrarr[0],narrarr[1]));
		Print.sln("");

		Print.sln("reverse: "); Print.array(Sort.reverse(narr));
		Print.sln("");

		Print.sln("maxVal(int[][]): "); Print.sln(Sort.maxVal(narrarr));
		Print.sln("");

		Print.sln("maxVal(int[]): "); Print.sln(Sort.maxVal(narr));
		Print.sln("");

		Print.sln("sum: "); Print.sln(Sort.sum(narr));
		Print.sln("");

		Print.sln("alphabetical: "); Print.array(Sort.alphabetical(sarr));
		Print.sln("");

		Print.sln("compareWords: "); Print.sln(Sort.compareWords(sarr[0],sarr[1]));
		Print.sln("\n");

		// Timer.java
		Print.sln("---Timer.java---");
		Timer t = new Timer();
		t.start();
		Print.sln("getTime: "); Print.sln(t.getTime());
		t.stop();
		Print.sln("printTime: "); t.printTime();
	}
}
