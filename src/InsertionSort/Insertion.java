package InsertionSort;

public class Insertion {

	/**
	 * @param args
	 */
	public static boolean less (double i,double j){
    	return i>j;
    }
    public static void exch(double a[],int i,int j){
    	double temp = a[i];
    	a[i] = a[j];
    	a[j] = temp;
    }
    public static void sort(double[] a){
    	for (int i = 0; i < a.length; i++) {
			for(int j=i;j>0;j--){
				if (less(a[j-1], a[j])) {
					exch(a, j-1, j);
				}
			}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n[] = {1,2,556,3,5,6,11,42,56,43,21};
		Insertion.sort(n);
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}

}
