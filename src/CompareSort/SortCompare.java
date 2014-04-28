package CompareSort;

import InsertionSort.Insertion;
import SelectionSort.Selection;
import ShellSort.Shell;
import Tools.StdRandom;
import Tools.Stopwatch;

public class SortCompare {
   public static double time(String method, double a[]){
	   Stopwatch stopwatch = new Stopwatch();
	   if (method.equals("insertion")) Insertion.sort(a);
	   if (method.equals("selection")) Selection.sort(a);
	   if (method.equals("shell")) Shell.sort(a);
	   return stopwatch.elapsedTime();
   }
   public static double timeCalculate(String method, int N,int T){
	   double a[] = new double[N];
	   double time = 0.0;
	   for (int i = 0; i < T; i++) {
		for (int j = 0; j < a.length; j++) 
			a[j] = StdRandom.uniform();
			time += time(method, a);
	}
	   return time;
   }
   public static void main(String[]args){
	   String method1 = args[0];
	   String method2 = args[1];
	   String method3 = args[2];
	   int N = Integer.parseInt(args[3]);
	   int T = Integer.parseInt(args[4]);
	  
	   double t3 = timeCalculate(method3, N, T);
	   System.out.println("method3:"+method3+" time is "+t3);
	   double t1 = timeCalculate(method1, N, T);
	   System.out.println("method1:"+method1+" time is "+t1);
	   double t2 = timeCalculate(method2, N, T);
	  
	   System.out.println("method2:"+method2+" time is "+t2);
	   
	   System.out.println("method is faster than method2："+t2/t1);
   }
}
