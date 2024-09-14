package com.exceptions.IITException_pack;
public class ReservationException  extends Exception{
    private final String s;

    public ReservationException(String s){
        this.s = s;
    }
    public String toString(){
        return s;
    }

}
