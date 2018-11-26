package com.company;

public class Main {

    public static void main(String[] args) {
        personRegister myPersonregister = new personRegister();
        for(int i = 0; i < 2; ++i){
            Person tempPerson = new Person();
            Bankkonto tempBankkonto = new Bankkonto();
            tempPerson.addKonto(tempBankkonto);
            tempPerson.addKonto(tempBankkonto);
            myPersonregister.addPerson(tempPerson);

        }
        System.out.println(myPersonregister.getSizeOfList());
    }
}
