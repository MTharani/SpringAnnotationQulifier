package com.edu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTeck implements MobileProcessor {

	public void processor() {
		System.out.println("mediteck run");
		
	}

}
