package pt.ipp.isep.mei.enorm.pam.cr2.proto3;

public class SFactoryMain {
	
	private static SFactory sFactory=null;
	
	public static void setSFactoryImpl(SFactory sFactory) {
		SFactoryMain.sFactory=sFactory;
	}
	
	static public SFactory getSFactory() {
		if (sFactory==null) {
			sFactory=new SFactoryDefaultImpl();
		}
		return sFactory;
	}

}
