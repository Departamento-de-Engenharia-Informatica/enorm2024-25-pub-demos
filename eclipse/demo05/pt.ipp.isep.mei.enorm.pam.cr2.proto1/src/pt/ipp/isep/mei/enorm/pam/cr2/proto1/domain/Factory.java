package pt.ipp.isep.mei.enorm.pam.cr2.proto1.domain;

import java.math.BigDecimal;

public class Factory {
	
	public static Product newProduct(String name, String code, String description, BigDecimal price) {
		Product p=new Product(name, code, description, price);
		return p;
	}
}
