package com.java.w3schools.blog.java.program.to.threads.matrix;

import java.util.ArrayList;
import java.util.List;

public class ParallelThreadsCreator {

	// creating 10 threads and waiting for them to complete then again repeat steps.
	public static void multiply(int[][] matrix1, int[][] matrix2, int[][] result) {
		List<Thread> threads = new ArrayList<>();
		int rows1 = matrix1.length;
		for (int i = 0; i < rows1; i++) {
			RowMultiplyWorker task = new RowMultiplyWorker(result, matrix1, matrix2, i);
			Thread thread = new Thread(task);
			thread.start();
			threads.add(thread);
			if (threads.size() % 10 == 0) {
				waitForThreads(threads);
			}
		}
	}

	private static void waitForThreads(List<Thread> threads) {
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		threads.clear();
	}
}
