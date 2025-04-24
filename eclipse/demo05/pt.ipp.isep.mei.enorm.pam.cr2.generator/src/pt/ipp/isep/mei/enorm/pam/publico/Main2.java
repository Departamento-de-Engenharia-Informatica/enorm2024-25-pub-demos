package pt.ipp.isep.mei.enorm.pam.publico;

import pt.ipp.isep.mei.enorm.pam.publico.Main;
import pt.ipp.isep.mei.enorm.pam.publico.MainMenu;
import pt.ipp.isep.mei.enorm.pam.publico.SFactoryMain;

public class Main2 extends Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SFactoryMain.setSFactoryImpl(new SFactoryAlternativeImpl());
		//SFactoryMain.getSFactory();
		
		MainMenu.executeMenu();
		System.out.println("See you soon!");
	}

}