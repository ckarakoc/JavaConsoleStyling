package com.ckarakoc.color;

public class ANSI {

	private static final String PREFIX = "\033[";
	private static final String SEPARATOR = ";";
	private static final String POSTFIX = "m";

	public static final String RESET = PREFIX + "0" + POSTFIX;

	private Attr attr = Attr.EMPTY;
	private Color color = Color.EMPTY;
	private Background background = Background.EMPTY;
	private String msg = "";

	public ANSI(String msg, Attr attr, Color color, Background background) {
		this.msg = msg;
		this.attr = attr;
		this.color = color;
		this.background = background;
	}

	public void changeAttr(Attr attr) {
		this.attr = attr;
	}

	public void changeColor(Color color) {
		this.color = color;
	}

	public void changeBackground(Background backgroundColor) {
		this.background = backgroundColor;
	}

	public void setMessage(String message) {
		this.msg = message;
	}

	public void print() {
		System.out.println(PREFIX + attr.getANSI_Attribute() + SEPARATOR +
				color.getANSI_Color() + SEPARATOR + background.getANSI_BColor() + POSTFIX + msg + RESET);
	}

	/**
	 * Attributes.
	 */
	public enum Attr {
		BOLD("1"), DARK("2"), UNDERLINE("4"), REVERSE("7"), HIDDEN("8"), EMPTY("");

		private String ANSI_Attribute;

		Attr(String ANSI_Attribute) {
			this.ANSI_Attribute = ANSI_Attribute;
		}

		public String getANSI_Attribute() {
			return this.ANSI_Attribute;
		}

		@Override
		public String toString() {
			return PREFIX + this.ANSI_Attribute + POSTFIX;
		}
	}

	/**
	 * Text-Color.
	 */
	public enum Color {
		BLACK("30"), RED("31"), GREEN("32"), YELLOW("33"),
		BLUE("34"), PURPLE("35"), CYAN("36"), WHITE("37"), EMPTY("");

		private String ANSI_Color;

		Color(String ANSI_Color) {
			this.ANSI_Color = ANSI_Color;
		}

		public String getANSI_Color() {
			return this.ANSI_Color;
		}

		@Override
		public String toString() {
			return PREFIX + this.ANSI_Color + POSTFIX;
		}
	}

	/**
	 * Background-color.
	 */
	public enum Background {
		BLACK("40"), RED("41"), GREEN("42"), YELLOW("43"),
		BLUE("44"), PURPLE("45"), CYAN("46"), WHITE("47"), EMPTY("");

		private String ANSI_BColor;

		Background(String ANSI_BColor) {
			this.ANSI_BColor = ANSI_BColor;
		}

		public String getANSI_BColor() {
			return this.ANSI_BColor;
		}

		@Override
		public String toString() {
			return PREFIX + this.ANSI_BColor + POSTFIX;
		}
	}
}
