package SelectionSort;

public class Selection {
    public static void sort(double[] a){
//    	int n = a.length;
    	for (int i = 0; i < a.length; i++) {
    		int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (less(a[i], a[j])) {
					min = j;
				}
				exch(a, i, min);
			}
		}
    }
    public static boolean less (double i,double j){
    	return i>j;
    }
    public static void exch(double a[],int i,int j){
    	double temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
    public static void main (String args[]){
      double n[] = {1,2,556,3,5,6,11,42,56,43,21};
      Selection.sort(n);
      for (int i = 0; i < n.length; i++) {
		System.out.println(n[i]);

	}
    }
}
