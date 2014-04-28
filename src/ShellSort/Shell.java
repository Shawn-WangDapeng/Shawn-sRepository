package ShellSort;

public class Shell {
	 public static boolean less (double i,double j){
	    	return i>j;
	    }
	    public static void exch(double a[],int i,int j){
	    	double temp = a[i];
	    	a[i] = a[j];
	    	a[j] = temp;
	    }
	    public static void sort(double[] a){
	    	int N = a.length;
	    	int h = 1;
	    	while(h<N/3) h = 3*h+1;
	    	while(h>=1){
	    		for (int i = h; i < N; i++) {
					for (int j = i; j >=h; j-=h) {
						if (!less(a[j], a[j-h])) {
							exch(a, j, j-h);
						}
					}
				}
	    		h = h/3;
	    	}
	    }
	    public static void main(String[]args){
	    	double n[] = {1,2,556,3,5,6,11,42,56,43,21};
	        Shell.sort(n);
	        for (int i = 0; i < n.length; i++) {
	  		System.out.println(n[i]);
	    }
	   }
}
