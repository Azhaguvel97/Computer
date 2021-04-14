package org.computer;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("desktop size is 1GB");
		
	}
	public static void main(String []args){
		Desktop a=new Desktop();
		a.desktopSize();
		a.computerMode1();
		
	}


}
