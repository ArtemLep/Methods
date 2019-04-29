package com.class27;

import java.util.ArrayList;

/*
Create a generic ArrayList that will store 5 names into it.

Find out whether the given ArrayList is empty or not?

Check whether the specific name is present in an ArrayList or not?

Find the size of your arrayList and print all values from that
 */
public class ArrayListTask {

public static void main(String[] args) {

        

        ArrayList <String> names=new ArrayList <String>();

        names.add("Muhammad");

        names.add("Inna");

        names.add("Toly");

        names.add("Alaiksei");

        names.add("shayh");

        

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Muhammad"));

        System.out.println(names.size());

        

        for (String a:names) {       
        	System.out.println(a);

    }

    }

}
