package tools;
import java.util.Vector;
import java.math.*;
public class Factor {
	public static Vector<Integer> getFactors(int n, boolean proper){
		Vector<Integer> res = getFactors(n);
		if (proper)
			res.removeElement(n);
		return res;
	}

	public static Vector<Integer> getFactors(int n){
		int odd = (n%2==0)?1:2;
		int d;
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(1);
		v.addElement(n);
		for (int i=1; i<(n/2); i+=odd){
			if (n%i==0&&!v.contains(i)){
				v.addElement(i);
				d=n; 
				while (d%i==0){
					d/=i;
					if (!v.contains(d))
						v.addElement(d);
				}
			}
		}
		return v;
	}

	public static int[] getPrimes(int n){
		if (n==3) return new int[]{2};
		boolean[] p = new boolean[n];
		int[] result;
		int k=n/2;
		//initialize array p
		for (int i=3; i<p.length; i+=2)
			p[i] = true;
		p[2]=true;
		int max = (int)(Math.sqrt(n))+1;
		for (int i=3; i<max+1; i+=2){
			if (!p[i])
			 	continue;
			for (int j=i+1; j<n; ++j){
				if (j%i==0){					
					if (p[j])
						--k;
					p[j]=false;					
				}
			}
		}
		//transfer every true element to new array
		result = new int[k];
		int rIndex = 0;
		for (int i=0; i<p.length; ++i)
			if (p[i])
				result[rIndex++]=i;
		return result;
	}

	

	public static boolean isPrime(int n){
		if (n%2==0) return false;
		if (n==2||n==3) return true;
		for (int i=3; i<(n/2); i+=2)
				if (n%i==0)				
					return false;				
		return true;
	}
}