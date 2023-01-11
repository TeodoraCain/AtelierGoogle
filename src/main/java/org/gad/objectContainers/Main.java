package org.gad.objectContainers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //1. You need to store Persoane in a TreeSet. Define 2 Comparators
        // (one for name - nume and one for age-varsta) that will be used when creating the TreeSet;
        //Add Persoane to the TreeSet; iterate throug the treeset and print the name and the age;
        //NOTE: if you are using a Comparator, the class Persoana should not implement Comparable anymore.

        Person p1, p2, p3, p4, p5;
        p1 = new Employed("Anne", 26);
        p2 = new Unemployed("George", 29);
        p3 = new Student("Alex", 18);
        p4 = new Employed("Dianne", 32);
        p5 = new Person("Ann", 26);

        TreeSet<Person> treeSetName = new TreeSet<>(new PersonNameComparator());
        treeSetName.add(p1);
        treeSetName.add(p2);
        treeSetName.add(p3);
        treeSetName.add(p4);
        treeSetName.add(p5);

        TreeSet<Person> treeSetAge = new TreeSet<>(new PersonAgeComparator());
        treeSetAge.add(p1);
        treeSetAge.add(p2);
        treeSetAge.add(p3);
        treeSetAge.add(p4);
        treeSetAge.add(p5);

        System.out.println(treeSetName);
        System.out.println(treeSetAge);

    ///////////////////////////////////////////
        HashMap<Person, List<Hobby>> hashMap = new HashMap<>();

        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(new Address("Washington",15, "UK"));
        addressList1.add(new Address("Sprout", 78,"Germany"));
        addressList1.add(new Address("Domneasca", 115,"Romania"));

        List<Address> addressList2 = new ArrayList<>();
        addressList2.add(new Address("Washington",15, "Italy"));
        addressList2.add(new Address("Sprout", 78,"Spain"));
        addressList2.add(new Address("Domneasca", 115,"Portugal"));

        List<Address> addressList3 = new ArrayList<>();
        addressList3.add(new Address("Washington",15, "France"));
        addressList3.add(new Address("Sprout", 78,"Germany"));
        addressList3.add(new Address("Domneasca", 115,"Estonia"));

        List<Hobby> hobbyList1 = new ArrayList();
        hobbyList1.add(new Hobby("yoga",2, addressList1));
        hobbyList1.add(new Hobby("dance",4, addressList2));
        hobbyList1.add(new Hobby("painting",2, addressList3));

        List<Hobby> hobbyList2 = new ArrayList();
        hobbyList2.add(new Hobby("dance",4, addressList2));
        hobbyList2.add(new Hobby("yoga",2, addressList1));
        hobbyList2.add(new Hobby("painting",2, addressList3));

        List<Hobby> hobbyList3 = new ArrayList();
        hobbyList3.add(new Hobby("painting",2, addressList3));
        hobbyList3.add(new Hobby("dance",4, addressList2));
        hobbyList3.add(new Hobby("yoga",2, addressList1));

        hashMap.put(p1,hobbyList1);
        hashMap.put(p2,hobbyList2);
        hashMap.put(p4,hobbyList3);

        for(Person person: hashMap.keySet()){
            if(person.equals(p2)){
                hashMap.get(person).forEach(hobby -> hobby.getAddressList().forEach(address -> System.out.println(address.getCountry())) );
            }
        }

    }
}
