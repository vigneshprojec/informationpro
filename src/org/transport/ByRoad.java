package org.transport;

public class ByRoad extends Road {
	public void bus() {
		System.out.println("i travel in bus");
	}
	@Override
	public void bike() {
		System.out.println("bike is not my life");
	}
	public static void main(String[] args) {
		ByRoad b=new ByRoad();
		b.car();
		b.bike();
	}

}
