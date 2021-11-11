package com.javaprogramto.programs.strings.substring.count;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringCountExample2 {

	public static void main(String[] args) {

		int count = countSubStringInString("222", "22");
		System.out.println(count);

		count = countSubStringInString("madam", "ma");
		System.out.println(count);

	}

	public static int countSubStringInString(String string, String toFind) {
		Pattern pattern = Pattern.compile(Pattern.quote(toFind));
		Matcher matcher = pattern.matcher(string);
		int position = 0;
		int count = 0;
		while (matcher.find(position)) {
			position = matcher.start() + 1;
			count++;
		}
		return count;
	}
}
