package Stack;

public class Stack {
 int top ;
 int maxSize ;
 Object [] objects;
 public Stack(int maxSize){
	 this.maxSize = maxSize;
	 objects = new Object[maxSize];
	 top = -1;
 }
 /**
  * 判断是否栈满
  * @return 
  */
 public  boolean isFull(){
	 return top+1==maxSize;
 }
 /**
  * 判断 栈中元素的个数
  */
 public int getElementCount(){
	 return top;
 }
 /**
  * 获取对栈的长度
  * @return
  */
 public int getSize(){
	 return maxSize;
 }
 /**
  * 判断栈是否为空
  */
 public boolean isEmpty(){
	 return top== -1;
 }
 /**
  * 入栈
  * @param data
  * @return 成功或者失败
  */
 public boolean push(Object data){
	 if (isFull()) {
		 System.out.println("栈已满");
		return false;
	}
	// top++;
	 objects[++top] = data;
	 return true;
 }
 /**
  * 出栈 取出栈中数据
  * @return
  * @throws Exception
  */
 public Object pop() throws Exception{
	 if (isEmpty()) {
		// System.out.println("栈已空");
		 throw new Exception("栈已空");
	}
	return objects[top--]; 
 }
 /**
  * 返回栈顶元素
  * @return
  */
 public Object peek(){
	 return objects[getElementCount()];
 }
 public static void main(String[]args) throws Exception{
	 Stack stack = new Stack(5);
	 stack.push(new String("wang1"));
	 stack.push(new String("wang2"));
	 stack.push(new String("wang3"));
	 stack.push(new String("wang4"));
	 stack.push(new String("wang5"));
	 stack.push(new String("wang6"));
	 stack.push(new String("wang7"));
	 System.out.println(stack.peek());
	 while(stack.top>=0){
		System.out.println(stack.pop()) ;
	 }
	 
 }
}
