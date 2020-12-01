package com.javaprogramto.threads.java8;

public class CreateThreadLambda {

	public static void main(String[] args) {

		// Thread creation using java 8 lambda using runnable
		Thread evenNumberThread = new Thread(() -> {
			
			// this logic is implementation of run() method to print only even numbers
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0) {
					System.out.println("Even Number Thread : "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		// starting the thread
		evenNumberThread.start();
		
		// Printing the odd numbers from main thread.
		for (int i = 0; i < 20; i++) {
			if (i % 2 == 1) {
				System.out.println("Odd Number Thread : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
