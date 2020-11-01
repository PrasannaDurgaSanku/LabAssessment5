import java.io.*;
import java.util.*;
class MultiThreadedProgram implements Runnable 
{
	@Override
	public void run() 
	{

		for (int j = 0; j <= 100; j++) 
		{
			System.out.println(" Thread name is: " + Thread.currentThread().getName() + " " + j);
		}
	}

}

public class Prgm1 
{
	public static void main(String[] args)
	{
		MultiThreadedProgram multithread = new MultiThreadedProgram();
		Thread t1 = new Thread(multithread, "Thread1");
		Thread t2 = new Thread(multithread, "Thread2");
		Thread t3 = new Thread(multithread, "Thread3");
		t1.start();
		t2.start();
		t3.start();

}

}
