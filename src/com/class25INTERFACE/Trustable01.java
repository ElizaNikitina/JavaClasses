package com.class25INTERFACE;

public interface Trustable01{
    void trust01();
}
interface Bank01 extends Trustable01{

    void depositMoney01();
    void withdraw01();
}

class FinancialInstitute{
    void financialTransaction(){
        System.out.println("Use our financial operation");
    }
}

interface CreditUnion01{
    void creditApply01();
}

class PNC01 extends FinancialInstitute implements Bank01{

    @Override
    public void depositMoney01() {
        System.out.println("PNC deposit money");
    }

    @Override
    public void withdraw01() {
        System.out.println("PNC withdraw money");
    }

    @Override
    public void trust01() {
        System.out.println("PNC is trustable");
    }
}

class  BOA01 extends  FinancialInstitute implements Bank01, CreditUnion01{

    @Override
    public void depositMoney01() {
        System.out.println("BOA deposit money");
    }

    @Override
    public void withdraw01() {
        System.out.println("BOA withdraw money");
    }

    @Override
    public void trust01() {
        System.out.println("BAO is trustable");
    }

    @Override
    public void creditApply01() {
        System.out.println("Apply for credit with us");
    }
}


