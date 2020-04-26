package com.javaprogramto.threads;

public class ThreadJoinExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread started execution. Current thread name : " + Thread.currentThread().getName());
		PrintNumbers t1 = new PrintNumbers(1, 10);
		PrintNumbers t2 = new PrintNumbers(11, 20);
		PrintNumbers t3 = new PrintNumbers(21, 30);

		t1.start();
		t1.join(500);

		t2.start();
		t2.join(500);

		t3.start();
		t3.join(500);

		System.out.println("All threads completed excution.");
		System.out.println(Thread.currentThread().getName() + " complete execution");
	}

}

class PrintNumbers extends Thread {

	private int start;
	private int end;

	public PrintNumbers(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread execution completed.");
	}
}