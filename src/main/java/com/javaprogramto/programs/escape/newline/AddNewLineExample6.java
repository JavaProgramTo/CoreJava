package com.javaprogramto.programs.escape.newline;

public class AddNewLineExample6 {

	public static void main(String[] args) {

		// html break tag
		String tag1 = "<p>hello</p>";
		String tag2 = "<p>world</p>";

		String tag3 = tag1 + "</br>" + tag2;

		// using java \n
		String tag4 = tag1 + "\n" + tag3;

		// using unicodes

		String tag5 = "<p>This is paragraph text and &#13; woops there is a new line.</p>";
	}
}
