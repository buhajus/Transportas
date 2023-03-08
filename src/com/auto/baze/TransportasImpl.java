package com.auto.baze;

public class TransportasImpl implements Transportas {

    private String tipas;
    boolean arSuVarikliu;
    int pagaminimoMetai;

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    public String getTipas() {
        return tipas;
    }

    public TransportasImpl(String tipas, boolean arSuVarikliu, int pagaminimoMetai) {
        this.tipas = tipas;
        this.arSuVarikliu = arSuVarikliu;
        this.pagaminimoMetai = pagaminimoMetai;
    }

    public TransportasImpl() {

    }

    @Override
    public boolean getArSuVarikliu() {
        return arSuVarikliu;
    }

    @Override
    public int getPagaminimoMetai() {
        return pagaminimoMetai;
    }

    public void setArSuVarikliu(boolean arSuVarikliu) {
        this.arSuVarikliu = arSuVarikliu;
    }


    public void setPagaminimoMetai(int pagaminimoMetai) {
        this.pagaminimoMetai = pagaminimoMetai;
    }

    @Override
    public String toString() {
        return "TransportasImpl{" +
                "tipas='" + tipas + '\'' +
                ", arSuVarikliu=" + (arSuVarikliu ? "Taip" : "Ne") +
                ", pagaminimoMetai=" + pagaminimoMetai +
                '}';
    }

    public int rastiSeniausiaAutomobili(TransportasImpl[] sarasas) {
        int metai = 9999;

        for (TransportasImpl x : sarasas) {

            if (x.getPagaminimoMetai() < metai) {
                metai = x.getPagaminimoMetai();
            }
        }

        return metai;
    }
}
