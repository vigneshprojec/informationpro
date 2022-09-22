package org.transport;

public class ByRoad extends Road {
	public void bus() {
		System.out.println("i travel in bus");
	}
	@Override
	public void bike() {
		System.out.println("........");
		System.out.println("bike is not my life");
		System.out.println("My branch is vignesh");
		System.out.println("bike is my life");
		System.out.println("bike is not my life");
		System.out.println("My branch is neriyarasan");
		System.out.println("My branch is vignesh kumar");
	}
	
	public static void main(String[] args) {
		ByRoad b=new ByRoad();
		b.car();
		b.bike();
	}

}
