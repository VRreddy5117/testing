package com.Interfaces_abstract;

public class HouseCompleted extends HousePlanStage1{

	@Override
	public void interior() {
		System.out.println("Interior completed");
		
	}
	
	public static void main(String[] args) {
		HousePlan plan = new HouseCompleted();
		plan.amountRelease();
	}

}
