package com4.zhuruA;

public class CriticismEngineImpl implements CriticismEngine {
    private String[] criticismPool;

    public CriticismEngineImpl(){}

    public String getCriticism(){
        int i=(int)(Math.random()*criticismPool.length);
        return criticismPool[i];
    }
    public String[] getCriticismPool() {
        return criticismPool;
    }
    public void setCriticismPool(String[] criticismPool){
        this.criticismPool = criticismPool;
    }
}