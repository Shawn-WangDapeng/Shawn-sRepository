package Tools;

public class Stopwatch {
/**
 * author Shawn 
 * method 用于测试计算时间的
 */
	private final long start;
	/**
	 * initialize a stopwatch object
	 */
     public Stopwatch(){
    	 start = System.currentTimeMillis();
     }
     /**
      * return the elapsed time(in seconds )since this object was created
      */
     public double elapsedTime(){
    	 long now = System.currentTimeMillis();
    	 return (now - start)/1000.0;
     }
}
