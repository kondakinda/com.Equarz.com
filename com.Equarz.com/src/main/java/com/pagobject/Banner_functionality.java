package com.pagobject;

public class Banner_functionality {
	public class BannerGenerator {
	    public static void main(String[] args) {
	        String textToBanner = "Hello, World!";
	        generateBanner(textToBanner);
	    }

	    public static void generateBanner(String text) {
	        int bannerWidth = text.length() + 4; // Add padding on both sides
	        printLine(bannerWidth);
	        System.out.println("| " + text + " |");
	        printLine(bannerWidth);
	    }

	    public static void printLine(int width) {
	        for (int i = 0; i < width; i++) {
	            System.out.print("-");
	        }
	        System.out.println();
	    }
	}

}
