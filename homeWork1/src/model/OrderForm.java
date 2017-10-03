package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class OrderForm {
	
	private String cardNum;
	private String cardType;
	private String price;
	private String inital;
	private String itemNum;
	private String address;
	private String firstName;
	private String description;
	private String lastName;
	
	public OrderForm(String cardNum, String cardType, String price, String inital, String itemNum, String address,
			String firstName, String description, String lastName) {
		
		this.cardNum = cardNum;
		this.cardType = cardType;
		this.price = price;
		this.inital = inital;
		this.itemNum = itemNum;
		this.address = address;
		this.firstName = firstName;
		this.description = description;
		this.lastName = lastName;
	}
	
	
	

}
