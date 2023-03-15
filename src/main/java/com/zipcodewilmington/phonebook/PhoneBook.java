package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = null;
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> newNumbers = new ArrayList<>();
        newNumbers.addAll(List.of(phoneNumbers));
        phonebook.put(name, newNumbers);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if (Objects.requireNonNull(phonebook).containsKey(name))
            return true;
        return false;
    }


    public List<String> lookup(String name) {
        if (phonebook.containsKey(name)) {
            return Collections.singletonList(name);
        }
        return null;
    }

    public String reverseLookup(String phoneNumber)  {
        for(String n : (phonebook).keySet())
            if(phonebook.get(n).contains(phoneNumber))
        return n;
        return null;
    }

    public List<String> getAllContactNames() {
        List<String> allContacts = new ArrayList<>();
        for (String n : (phonebook).keySet())
            allContacts.add(n);

        return allContacts;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
