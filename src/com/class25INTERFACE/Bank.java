package com.syntax.class25;

public interface Bank extends Trustable {

	void depositMoney();

	void withdraw();
}

interface Trustable {
	void trust();
	
}

interface CreditUnion {
	void creditApply();
}

abstract class Finance {
	abstract void financialTransactions();

}

class PNC extends Finance implements Bank {
	@Override
	public void depositMoney() {
	}

	@Override
	public void withdraw() {
	}

	@Override
	void financialTransactions() {
		// TODO Auto-generated method stub
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
	}
}

class BOA extends Finance implements Bank, CreditUnion {
	@Override
	public void depositMoney() {
	}

	@Override
	public void withdraw() {
	}

	@Override
	void financialTransactions() {
		// TODO Auto-generated method stub
	}

	@Override
	public void trust() {
		System.out.println("trust");
	}
	@Override
	public void creditApply() {
		System.out.println("you can take credit");
	}
}