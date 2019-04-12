package com4.zhuruA;

public aspect CriticAspect {
    private CriticismEngine criticismEngine;

    public CriticAspect(){}

    /*public CriticismEngine getCriticismEngine() {
        return this.criticismEngine;
    }*/

    public void setCriticismEngine(CriticismEngine criticismEngine){
        this.criticismEngine = criticismEngine;
    }
    pointcut performance():execution(* com4.zhuruA.Performance.perform(..));

    pointcut construct():execution(concert.CriticismEngineImpl.new());

    after():performance(){
        System.out.println(criticismEngine.getCriticism());
    }

    after():construct(){
        System.out.println("After Performance constructor");
    }

    before():construct(){
        System.out.println("Before Performance constructor");
    }
}
