package edu.miu.cs.cs425.swe_online_market_project.model;

public enum AddressType {
    BILLING("BILLING"), SHIPPING("SHIPPING");

    private String type;

    AddressType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
