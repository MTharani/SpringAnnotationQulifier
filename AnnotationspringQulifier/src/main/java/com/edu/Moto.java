package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Moto {
	@Autowired
	@Qualifier("mediaTeck")
	MobileProcessor cpu;

public MobileProcessor getCpu() {
	return cpu;
}

public void setCpu(MobileProcessor cpu) {
	this.cpu = cpu;
}
public void mobileFun()
{
	System.out.println("8GB RAM,Dual Sim");
	cpu.processor();
}

}
