package com.javaprogramto.java8.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparatorExample2 {

	public static void main(String[] args) {

		Queue<Customer> priorityVipQueue = new PriorityQueue<>(
				(c1, c2) -> Boolean.valueOf(c2.isVip()).compareTo(Boolean.valueOf(c1.isVip())));

		priorityVipQueue.add(new Customer(1, "name 1", true));
		priorityVipQueue.add(new Customer(2, "Name 2", false));
		priorityVipQueue.add(new Customer(3, "Name 3", false));
		priorityVipQueue.add(new Customer(4, "Name 4", true));
		priorityVipQueue.add(new Customer(5, "Name 5", false));

		while (!priorityVipQueue.isEmpty()) {
			Customer c = priorityVipQueue.poll();
			System.out.println("Name - " + c.getName() + " - is Vip - " + c.isVip());
		}

	}

}
