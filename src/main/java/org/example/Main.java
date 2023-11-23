package org.example;

public class Main {
    public static void main(String[] args) {
        Context ctx=new Context();
        System.out.println("Stratégie 1:");
        ctx.setStrategy(new StrategyImpl1());
        ctx.appliquerStrategy();
        System.out.println("Stratégie 2:");
        ctx.setStrategy(new StrategyImpl2());
        ctx.appliquerStrategy();
        System.out.println("Stratégie 3:");
        ctx.setStrategy(new StrategyImpl3());
        ctx.appliquerStrategy();
    }
}