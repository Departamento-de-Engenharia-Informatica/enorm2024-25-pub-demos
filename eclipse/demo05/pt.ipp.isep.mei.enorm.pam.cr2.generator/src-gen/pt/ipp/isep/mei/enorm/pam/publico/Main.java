package pt.ipp.isep.mei.enorm.pam.publico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SFactoryMain.setSFactoryImpl(new SFactoryAlternativeImpl());
		SFactoryMain.getSFactory();
		
		MainMenu.executeMenu();
		System.out.println("See you next time!");
	}
}