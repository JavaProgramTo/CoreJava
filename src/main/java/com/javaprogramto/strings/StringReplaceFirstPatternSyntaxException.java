package com.javaprogramto.strings;

public class StringReplaceFirstPatternSyntaxException {

    public static void main(String[] args) {

        String str = "Pattern invalid program";

        String replacedString = str.replaceFirst("[invalid}}", "invalid is not accecpted");

        System.out.println("replaceFirst() special chars output : " + replacedString);

    }
}
