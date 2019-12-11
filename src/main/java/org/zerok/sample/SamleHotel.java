package org.zerok.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
public class SamleHotel {

	private Chef chef;
	
	public SamleHotel(Chef chef) {
		this.chef = chef;
	}
}
