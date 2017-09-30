package kr.ac.hansung.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.RequiredArgsConstructor;


public class PetOwner {

	@Autowired //wiring by type
	@Qualifier(value="qf_dog")
	private AnimalType animal;
	
	public void play() {
		animal.sound();
		
	}
	
	
}
