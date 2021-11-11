package com.javaprogramto.programs.strings.substring.count;

public class SubstringCountExample {

	public static void main(String[] args) {

		int count = countSubStringInString("222", "22");
		System.out.println(count);

		count = countSubStringInString("madam", "ma");
		System.out.println(count);

	}

	public static int countSubStringInString(String string, String toFind) {
		int position = 0;
		int count = 0;
		while ((position = string.indexOf(toFind, position)) != -1) {
			position = position + 1;
			count++;
		}
		return count;
	}

}
