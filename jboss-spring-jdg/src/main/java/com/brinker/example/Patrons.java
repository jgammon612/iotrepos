package com.brinker.example;

public class Patrons {
	
	private BrinkerPatron patron;

    public BrinkerPatron getPatron(String key) {
        return patron;
    }
    
    public BrinkerPatron getPatronByPhone(String phone) {
    	return null;
    }

    public void setPatron(BrinkerPatron patron) {
        this.patron = patron;
    }

    public Patrons(BrinkerPatron patron) {
        this.patron = patron;
    }

}
