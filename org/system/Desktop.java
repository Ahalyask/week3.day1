package org.system;

public class Desktop extends Computer{

	public static void main(String[] args) {
		Desktop ds = new Desktop();
		ds.computerModel();
		ds.desktopSize();
		

	}
	public void desktopSize() {
		System.out.println("from Desktop - desktopSize()");
	}

}
