package org.codejudge.sb.entity;

public class Response {

	long sum;

	public Response(long sum) {
		super();
		this.sum = sum;
	}

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Response [sum=" + sum + "]";
	}
	
	
}
