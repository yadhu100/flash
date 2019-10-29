package com.hoegh.alloc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	MobileProcessor x;
	public MobileProcessor getX() {
		return x;
	}

	public void setX(MobileProcessor x) {
		this.x = x;
	}

	public void tress()
	{
		System.out.println("OCTA, 4gb RAM,12 MP camera");
		x.process();
	}

}
