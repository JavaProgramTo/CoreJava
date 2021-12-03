package com.javaprogramto.java8.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparatorExample3 {

	public static void main(String[] args) {

		Queue<Customer> priorityVipQueue = new PriorityQueue<>(Comparator.comparing(Customer::isVip).reversed());

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
