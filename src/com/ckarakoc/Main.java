package com.ckarakoc;

import com.ckarakoc.color.ANSI;

public class Main {

	public static void main(String[] args) {
		System.out.println(ANSI.Attr.BOLD + "BOLD");
		System.out.println(ANSI.Attr.DARK + "DARK");
		System.out.println(ANSI.Attr.UNDERLINE + "UNDERLINE");
		System.out.println(ANSI.Attr.REVERSE + "REVERSE");
		System.out.println(ANSI.Attr.HIDDEN + "HIDDEN");
		System.out.println(ANSI.Color.BLACK + "BLACK");
		System.out.println(ANSI.Color.BLUE + "BLUE");
		System.out.println(ANSI.Color.CYAN + "CYAN");
		System.out.println(ANSI.Color.GREEN + "GREEN");
		System.out.println(ANSI.Color.PURPLE + "PURPLE");
		System.out.println(ANSI.Color.RED + "RED");
		System.out.println(ANSI.Color.WHITE + "WHITE");
		System.out.println(ANSI.Color.YELLOW + "YELLOW" + ANSI.RESET);
		System.out.println(ANSI.Background.BLACK + "BLACK");
		System.out.println(ANSI.Background.BLUE + "BLUE");
		System.out.println(ANSI.Background.CYAN + "CYAN");
		System.out.println(ANSI.Background.GREEN + "GREEN");
		System.out.println(ANSI.Background.PURPLE + "PURPLE");
		System.out.println(ANSI.Background.RED + "RED");
		System.out.println(ANSI.Background.WHITE + "WHITE");
		System.out.println(ANSI.Background.YELLOW + "YELLOW");
		ANSI ansi = new ANSI("multiline_ANSI", ANSI.Attr.UNDERLINE, ANSI.Color.CYAN, ANSI.Background.EMPTY);
		ansi.print();
		ansi.changeBackground(ANSI.Background.BLACK);
		ansi.changeColor(ANSI.Color.WHITE);
		ansi.changeAttr(ANSI.Attr.BOLD);
		ansi.setMessage("multiline_ANSI II");
		ansi.print();
		System.out.println(ANSI.RESET + "END");
	}
}
