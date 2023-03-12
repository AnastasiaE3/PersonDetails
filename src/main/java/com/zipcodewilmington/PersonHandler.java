package com.zipcodewilmington;

import org.w3c.dom.css.Counter;

import java.util.ArrayList;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            Person currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
            counter++;

        }


        // create a `counter` \/
        // while `counter` is less than length of array \/
            // begin loop \/
            // start : help : end!
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        for (int counter = 0; counter < personArray.length; counter ++) {
            Person currentPerson = personArray[counter];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;

        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        ArrayList<String> arr = new ArrayList<>();
        arr.add("\nMy first name is Leon\n");
        arr.add("My last name is Hunter\n");
        arr.add("My first name is Tariq\n");
        arr.add("My last name is Hook\n");
        arr.add("My first name is Dolio\n");
        arr.add("My last name is Durant");
        for (String currentString : arr) {
            String stringRepresentation = currentString.toString();
            result += stringRepresentation;
        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
