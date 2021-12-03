package com.javaprogramto.java8.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparatorExample {

	public static void main(String[] args) {

		Queue<Customer> priorityVipQueue = new PriorityQueue<>(new VipComparator());

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

class VipComparator implements Comparator<Customer> {

	public int compare(Customer c1, Customer c2) {

		return Boolean.valueOf(c2.isVip()).compareTo(Boolean.valueOf(c1.isVip()));
	}
}

class Customer {

	private int id;
	private String name;
	private boolean vip;

	public Customer(int id, String name, boolean vip) {
		this.id = id;
		this.name = name;
		this.vip = vip;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

}