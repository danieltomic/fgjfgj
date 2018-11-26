package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String pNbr;
    private String name;
    private List<Bankkonto> myBankkontos = new ArrayList<>();

    public void addKonto(Bankkonto konto){

        myBankkontos.add(konto);

    }
    public String getpNbr(){
        return pNbr;
    }
}
