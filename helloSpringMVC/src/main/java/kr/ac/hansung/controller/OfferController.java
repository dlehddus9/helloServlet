package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Offer;
import kr.ac.hansung.service.OfferService;

@Controller
public class OfferController {
	
	@Autowired
	private OfferService offerService;
	
	@RequestMapping("/offers")
	public String showOffers(Model model) {
		List<Offer> offers = offerService.getCurrent();
		model.addAttribute("offers",offers);
		return "offers";
	}
	
	@RequestMapping("createoffer")
	public String createOffer(Model model) {
		
		model.addAttribute("offer",new Offer());
		return "createoffer";
	}

	
	@RequestMapping("docreate")
	public String doCreate(Model model, Offer offer) {
		offerService.insert(offer);
		
		//System.out.println(offer); //Tostring ¿Ã ∫“∏≤
		return "offercreated";
	}
}
