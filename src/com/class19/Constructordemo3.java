package com.class19;

public class Constructordemo3 {
	
	String name;
	double salary;
	double bonus;
	int numberOfDaysWorked;
	double bonusPercentage;
	
		Constructordemo3(String name,double salary,int numberOfDaysWorked,double bonusPercentage){
		this.name=name;
		this.salary=salary;
		this.bonus=1000;
		this.numberOfDaysWorked=numberOfDaysWorked;
		this.bonusPercentage=bonusPercentage;
	}

		void printBonus(){
			
			//int numberOfDaysWorked=0;
			if(numberOfDaysWorked>300) {
				bonus=1000;
			}else {
				bonus=500;
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructordemo3 ramObj=new Constructordemo3("Ram",100000,300,100);
		
		System.out.println(ramObj.name);
		System.out.println(ramObj.salary);
		System.out.println(ramObj.bonus);
		System.out.println(ramObj.numberOfDaysWorked);
		System.out.println(ramObj.bonusPercentage);
		ramObj.printBonus();
		System.out.println(ramObj.name);
		System.out.println(ramObj.salary);
		System.out.println(ramObj.bonus);
		System.out.println(ramObj.numberOfDaysWorked);
		System.out.println(ramObj.bonusPercentage);
		
	}

}
