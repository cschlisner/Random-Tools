package tools;
public class Sort {
    /*
     *   Type-Dependant Functions
     */
    public static <T> T[] swap(T[] arr, int i, int j){
      T[] tarr = arr;
  		T temp = tarr[i];
		  tarr[i] = tarr[j];
		  tarr[j] = temp;
      return tarr;
  	}

	/*
	 *  Numerical Functions
	 */
  	public static int[] size(int[] base, int[] secondary){
  		if (secondary != null && base.length != secondary.length){
  			System.out.println("Arrays need to be same size!");
  			return null;
		  }
  		int[] arr = new int[base.length];
  		for (int k = 0; k<base.length; ++k){
  			int place=0;
  			for (int i=0; i<arr.length; ++i){
  				if (base[k]>base[i]) ++place;
  			}
  			arr[place] = (secondary==null)?base[k]:secondary[k];
  		}
  		return arr;
  	}

  	public static int[] swap(int[] arr, int i, int j){
      int[] iarr = arr;
  		int temp = iarr[i];
		  iarr[i] = iarr[j];
		  iarr[j] = temp;
      return iarr;
  	}

  	public static int[] size(int[] arr){
  		int[] base = new int[arr.length];
  		System.arraycopy(arr, 0, base, 0, base.length);
  		return size(base, null);
  	}

  	public static int[] reverse(int[] base){
  		int[] arr = new int[base.length];
  		System.arraycopy(base, 0, arr, 0, base.length);
  		for (int i=0, j=arr.length-1; i<j; ++i, --j)
  			arr = swap(arr, i, j);
  		return arr;
  	}

    public static int maxVal(int[][] arr){
      int max = 0;
      for (int[] row : arr){
        int k = maxVal(row);
        max = (k>max)?k:max;
      }
      return max;
    }
    public static int maxVal(int[] arr){
      int max = 0;
      for (int el : arr)
        max = (el>max)?el:max;
      return max;
    }

    public static int sum (int[] arr){
      int sum=0;
      for (int i : arr) sum+=i;
      return sum;
    }

    /*
     *   String Functions
     */
    public static String[] alphabetical(String[] base){
    	String[] arr = new String[base.length];
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	int p = 0;
    	for (String i : base){
    		p = 0;
    		for (String j : base)
    			if (compareWords(i, j)) ++p;
    		arr[p] = i;
    	}
    	return arr;
    }

    public static boolean compareWords (String s1, String s2){ // returns true if s1 is lower on list than s2
    	boolean swap = false; 
    	if (s1.length() < s2.length()){
    		swap = true;
    		String tmp = s1;
    		s1 = s2;
    		s2 = tmp;
    	}
    	s1 = s1.toLowerCase();
    	s2 = s2.toLowerCase();
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	for (int i = 0; i < s1.length(); ++i){
    		if (i==s2.length())
    			return !swap;

    		else if (alphabet.indexOf(s1.charAt(i)) == alphabet.indexOf(s2.charAt(i)))
    			continue;

    		else if (alphabet.indexOf(s1.charAt(i)) > alphabet.indexOf(s2.charAt(i)))
    			return !swap;

    		else return swap;
    	}
    	return swap;

    	// swap will == false if the original s1 is longer than original s2
    	// likewise, !swap will == true if the original s1 is longer than original s2
    	// so if a swap occurred, all the return values will flip as well.
    }
}