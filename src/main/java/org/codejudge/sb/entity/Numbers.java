package org.codejudge.sb.entity;

public class Numbers {

	long number1;
	long number2;

	public long getNumber1() {
		return number1;
	}

	public void setNumber1(long number1) {
		this.number1 = number1;
	}

	public long getNumber2() {
		return number2;
	}

	public void setNumber2(long number2) {
		this.number2 = number2;
	}

	@Override
	public String toString() {
		return "Numbers [number1=" + number1 + ", number2=" + number2 + "]";
	}

}
