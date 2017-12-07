package kr.ac.hansung.csemall;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("kr/ac/hansung/conf/beans.xml"); 

	OfferDAO offerDAO = (OfferDAO)context.getBean("offerDAO");
	System.out.println("The record count is " + offerDAO.getRowCount());
	
	List<Offer> offerList = offerDAO.getOffers();
	
	for(Offer offer : offerList)
		System.out.println(offer);
	Offer offer = new Offer();
	offer.setName("nykim");
	offer.setEmail("nykim@hansung.ac.kr");
	offer.setText("an instructor of spring framework");
	
	if(offerDAO.insert(offer)) {
		System.out.println("Object is inserted successfully");
	}
	else {
		System.out.println("Object insert failed");
	}
	
	offer = offerDAO.getOffer("nykim");
	offer.setName("Namyun Kim");
	
	if(offerDAO.update(offer)) {
		System.out.println("Object is updated successfully");
	}
	else {
		System.out.println("Object updated failed");
	}
	
	offer = offerDAO.getOffer("Namyun Kim");
	
	System.out.println(offer);
	
	if(offerDAO.delete(offer.getId())) {
		System.out.println("Object is delted successfully");
	}
	else {
		System.out.println("Object delted failed");
	}
	
	context.close();
	}

}
