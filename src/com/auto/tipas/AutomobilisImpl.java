package com.auto.tipas;

import com.auto.baze.TransportasImpl;

public class AutomobilisImpl extends TransportasImpl implements Automobilis {
    String marke;
    int duruSkaicius;
    boolean arVaromasElektra;

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getMarke() {
        return marke;
    }

    public int getDuruSkaicius() {
        return duruSkaicius;
    }

    public void setDuruSkaicius(int duruSkaicius) {
        this.duruSkaicius = duruSkaicius;
    }


    public boolean getArVaromasElektra() {
        return arVaromasElektra;
    }

    public void setArVaromasElektra(boolean arVaromasElektra) {
        this.arVaromasElektra = arVaromasElektra;
    }

    public AutomobilisImpl(String tipas, boolean arSuVarikliu, int pagaminimoMetai, String marke, int duruSkaicius, boolean arVaromasElektra) {
        super(tipas, arSuVarikliu, pagaminimoMetai);
        this.marke = marke;
        this.duruSkaicius = duruSkaicius;
        this.arVaromasElektra = arVaromasElektra;
    }

    public AutomobilisImpl() {

    }

    @Override
    public String toString() {
        return super.toString() + "AutomobilisImpl{" +
                "marke='" + marke + '\'' +
                ", duruSkaicius=" + duruSkaicius +
                ", arVaromasElektra=" + (arVaromasElektra ? "Taip" : "Ne") +
                '}';
    }

    public void lyginiaiAutomobilioMetai(TransportasImpl sarasas[]) {

        for (TransportasImpl auto : sarasas) {

            if (auto instanceof AutomobilisImpl) {
                //  AutomobilisImpl automobilis = (AutomobilisImpl) auto;

                if (auto.getPagaminimoMetai() % 2 == 0) {
                    System.out.print("Automobiliai su lyginiais pagaminimo metais:\t");
                    System.out.println(auto);
                }
            }
        }
    }

    public void audiPliusDviDurys(TransportasImpl sarasas[]) {

        for (TransportasImpl auto : sarasas) {

            if (auto instanceof AutomobilisImpl) {
                AutomobilisImpl automobilis = (AutomobilisImpl) auto;

                if (automobilis.getMarke().equals("Audi") && automobilis.getDuruSkaicius() == 2) {
                    System.out.print("Audi ir 2 durys: \t");
                    auto.setPagaminimoMetai(2000);
                    System.out.println(auto);
                }
            }
        }
    }

    public void automobiliaiVaromiElektra(TransportasImpl sarasas[]) {

        for (TransportasImpl auto : sarasas) {

            if (auto instanceof AutomobilisImpl) {
                AutomobilisImpl automobilis = (AutomobilisImpl) auto;

                if (automobilis.getArVaromasElektra()) {
                    System.out.print(" \nAutomobilis varomas elektra: \t");
                    System.out.print(auto);
                }
            }

        }

    }

    public void seniausiasAutomobilis(TransportasImpl sarasas[]) {

        for (TransportasImpl auto : sarasas) {

            if (auto instanceof AutomobilisImpl) {
                AutomobilisImpl automobilis = (AutomobilisImpl) auto;

                if (rastiSeniausiaAutomobili(sarasas) == auto.getPagaminimoMetai()) {
                    System.out.println("\nSeniausias automobilis - tampa Rolls-Royce");
                    automobilis.setMarke("Rolls-Royce");
                    System.out.println(auto);
                }
            }
        }
    }
}




