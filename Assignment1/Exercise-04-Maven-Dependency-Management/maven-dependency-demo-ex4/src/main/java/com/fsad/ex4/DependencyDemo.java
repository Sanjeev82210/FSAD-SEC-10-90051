package com.fsad.ex4;

import org.apache.commons.lang3.StringUtils;

public class DependencyDemo {

    public static void main(String[] args) {

        String input = "   Maven Dependency Management   ";

        // Using Apache Commons Lang
        String trimmed = StringUtils.trim(input);
        String reversed = StringUtils.reverse(trimmed);
        boolean isBlank = StringUtils.isBlank(input);

        System.out.println("Original String : '" + input + "'");
        System.out.println("Trimmed String  : '" + trimmed + "'");
        System.out.println("Reversed String : '" + reversed + "'");
        System.out.println("Is Blank?       : " + isBlank);
    }
}
