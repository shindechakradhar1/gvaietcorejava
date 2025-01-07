package batchpractices;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Student> studentQueue = 
				new PriorityQueue<>();
		
		studentQueue.offer(new Student(1,"ABC1"));
		studentQueue.offer(new Student(2,"ABC2"));
		studentQueue.offer(new Student(3,"ABC2"));
		studentQueue.offer(new Student(4,"ABC1"));
//		studentQueue.offer(null);
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		System.out.println(studentQueue.poll());
		
		BlockingQueue<Integer> blockingQueue = 
				new ArrayBlockingQueue<>(100);
		new Thread(()->{
			try {
				for(int i=0;i<100;i++) {
					System.out.println("Set : " +i);
					blockingQueue.put(i);
					Thread.sleep(100);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();;
		
		new Thread(()->{
			int get=0;
			try {
			while(get<=100) {
				get=blockingQueue.take();
				System.out.println("Get : " + get);
				Thread.sleep(1000);
			}
			}catch(Exception e) {
				System.out.println(e);
			}
		}).start();;
	}
}
