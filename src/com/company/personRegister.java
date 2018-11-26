package com.company;

import java.util.ArrayList;
import java.util.List;

public class personRegister {

    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person p){
        personList.add(p);
    }

    public Person findPerson(String pNbr){
        for (int counter = 0; counter < personList.size(); counter++){
            if (personList.get(counter).getpNbr() == pNbr){
                return personList.get(counter);
            }
        } return personList.get(0);
    }
    public int getSizeOfList() {
        return personList.size();
    }


    //public Person removePerson(String pNbr){
      //  personList.remove(pNbr);
    // }
}
