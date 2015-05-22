package tools;
import java.util.Vector;
public class Print{
	public static <T> void s(T s){
		System.out.print(s);
	}

	public static <T> void sln(T s){
		System.out.println(s);
	}

	public static void array(int[][] arr){
		int max = findMaxLen(arr);
		for (int[] row : arr){
			for (int el : row){
				String str = String.valueOf(el);
				for (int k=0;k<((max-String.valueOf(el).length()));++k) str = "0"+str;
				s(str+" ");
			}
			sln("");
		}
	}
	public static void array(int[] arr){
		for (int i : arr)
			s(i+" ");
		sln("");
	}
	public static <T> void array(T[][] arr){
		int max = findMaxLen(arr);
		for (T[] row : arr){
			for (T el : row){
				s(el);
				for (int k=0;k<((max-String.valueOf(el).length()));++k)	s(" ");
			}
			sln("");
		}
	}
	public static <T> void array(T[] arr){
		for (T el : arr)
			s(String.valueOf(el+" "));
		sln("");
	}

	public static <T> void vector(Vector<T> vector){
		for (int i=0; i<vector.size(); ++i)
			s(String.valueOf(vector.get(i))+" ");
		sln("");
	}

	public static void triangle(int[][] triangle, int[] path){
		int max=findMaxLen(triangle), r=0, c=0;
		boolean p = (path!=null);
		for (int[] row : triangle){
			int space = ((((triangle[triangle.length-1].length)*max)/2)-(row.length));
			for (int i =0; i<space; ++i)
				for (int j=0; j<max; ++j)
					s(" ");
			for (int el : row){
				s(((p&&c==0&&path[r]==c)?"[":""));
				for (int k=0;k<((max-String.valueOf(el).length()));++k)
					s(0);
				s(el+((p&&path[r]==c)?"] ":(c<r)?(p&&path[r]==c+1)?" [":"  ":"  "));
				++c;
			}
			sln("");
			++r;
			c=0;
		}
	}

	private static int findMaxLen(int[][] arr){
      int max=0;
      for (int[] row : arr){
      	int k = findMaxLen(row);
        max=(k>max)?k:max;
      }
      return max;
    }

    private static int findMaxLen(int[] arr){
      int max=0;
      for (int el : arr)
        max = (String.valueOf(el).length() > max)?String.valueOf(el).length():max;
      return max;
    }
	private static <T> int findMaxLen(T[][] arr){
      int max=0;
      for (T[] row : arr)
      	for (T el : row)
         max = (String.valueOf(el).length() > max)?String.valueOf(el).length():max;
      return max;
    }    
}