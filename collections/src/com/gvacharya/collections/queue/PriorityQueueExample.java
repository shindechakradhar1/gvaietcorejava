package com.gvacharya.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import com.gvacharya.collections.entities.Mails;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> intQueue = 
				new PriorityQueue<>();
		
//		boolean add(e) / boolean offer(e)
//		enqueing
		intQueue.offer(10);
		intQueue.offer(9);
		intQueue.offer(1);
		intQueue.offer(3);
		intQueue.offer(7);
		intQueue.offer(5);
		
		System.out.println(intQueue);
		
//		Dequeing
//		E remove() / E poll()
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		
//		Queue<Mails> mailQueue = 
//				new PriorityQueue<>((e1,e2)->e1.getPriority().compareTo(e2.getPriority()));
		Queue<Mails> mailQueue = 
				new PriorityQueue<>();
		mailQueue.offer(new Mails("abc1@abc.in","p4"));
		mailQueue.offer(new Mails("abc2@abc.in","p1"));
		mailQueue.offer(new Mails("abc3@abc.in","p1"));
		mailQueue.offer(new Mails("abc4@abc.in","p2"));
		mailQueue.offer(new Mails("abc5@abc.in","p2"));
		mailQueue.offer(new Mails("abc6@abc.in","p3"));
		
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
		System.out.println(mailQueue.poll());
	}
}
