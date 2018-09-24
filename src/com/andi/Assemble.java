package com.andi;

public class Assemble implements WorkShop {

    @Override
    public void make() {
        System.out.print(" ... and");
        System.out.println(" assembling");
    }
}
