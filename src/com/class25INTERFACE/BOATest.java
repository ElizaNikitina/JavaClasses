package com.class25INTERFACE;

public class BOATest {

    public static void main(String[] args) {
      Bank01 bank = new BOA01();

      bank.depositMoney01();
      bank.withdraw01();
      bank.trust01();


      BOA01 bank1 = new BOA01();
      bank1.creditApply01();
      bank1.depositMoney01();
      bank1.trust01();
      bank1.financialTransaction();
      bank1.withdraw01();

    }
}
