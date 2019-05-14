package com.gaurav.javafromnotes.threads.creation;

public class ThreadLocalInner {
	public static void main(String[] args) {
		// Thread as a Local Inner Class
		class MyThread1 extends Thread {
			@Override
			public void run() {
				System.out.println("Keep some task here.....");
			}
		}

		// Another thread as a Local Inner Class
		class MyThread2 implements Runnable {
			@Override
			public void run() {
				System.out.println("Keep some task here.....");
			}
		}

		// Using MyThread1 and it's task

		MyThread1 thread1 = new MyThread1();
		thread1.start();

		// Using MyThread2 and it's task

		MyThread2 thread2 = new MyThread2();
		Thread t = new Thread(thread2);
		t.start();
	}
}
