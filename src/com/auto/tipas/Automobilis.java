package com.auto.tipas;

public interface Automobilis{
    void  setMarke(String setMarke);
    void  setDuruSkaicius(int setDuruSkaicius);
   void  setArVaromasElektra(boolean arVaromasElektra );

   boolean getArVaromasElektra();
   int getDuruSkaicius();
   String getMarke();

}