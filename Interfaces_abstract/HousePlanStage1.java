package com.Interfaces_abstract;

public abstract class HousePlanStage1 implements HousePlan {
	
	@Override
	public void manPower() {
		System.out.println("Stage-1 : Man Power 100");
		
	}
	@Override
	public void amountRelease() {
		System.out.println("Stage-1 : Amount Release 10L");
		
	}
	@Override
	public void startConstruction() {
		System.out.println("Started base and pillars");
		
	}
	
	

}
