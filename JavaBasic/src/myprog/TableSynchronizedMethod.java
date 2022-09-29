package myprog;

class Table {
	public synchronized void printTable(int n) // t1&t2 without synch prog will excute combine 
	{
		for(int i=1;i<=10;i++) //lock t1 &t2 one by one excute
		{
	 System.out.println(n*i);
		}
	}
}
class thread1 extends Thread {
	Table t;
	thread1(Table t)
	{
		this.t=t;
	}
	public void run ()
	{
		t.printTable(5);
	}
}
class thread2 extends Thread {
	Table t;
	thread2(Table t)
	{
		this.t=t;
	}
	public void run ()
	{
		t.printTable(2);
	}
}
public class TableSynchronizedMethod {

	public static void main(String[] args) {

Table obj=new Table();  // obj - 1 lock

thread1 t1=new thread1(obj);
thread2 t2=new thread2(obj);

t1.start(); t2.start();
	}

}
