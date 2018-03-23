package com.fun.project;

import android.support.annotation.Nullable;
import android.util.Log;

import org.jetbrains.annotations.NotNull;

public class PlayGround001Java {
    private static final String HELLO_WORLD = "HELLO_WORLD";
    private static final String TAG = "TEST Java";


    private PlayGround001Java() {
    }


    // Hello world!
    /************************************************/

    /**
     * {@link PlayGround001Kotlin#F001_Hello_World()}
     * {@link PlayGround001Kotlin#F001_Hello_World_01()}
     */
    public static String F001_Hello_World() {
        return HELLO_WORLD;
    }


//    Default Arguments

    /*******************************************************/

    public static String F002_Default_Arguments(String name) {
        return F002_Default_Arguments(name, 42);
    }

    public static String F002_Default_Arguments(String name, int number) {
        return F002_Default_Arguments(name, number, false);
    }

    public static String F002_Default_Arguments(String name, boolean toUpperCase) {
        return F002_Default_Arguments(name, 42, toUpperCase);
    }

    /**
     * {@link PlayGround001Kotlin#F002_Default_Arguments(String, int, boolean)} ()}
     * {@link PlayGround001Kotlin#F002_Default_Arguments_01(String, int, boolean)} ()}
     */
    public static String F002_Default_Arguments(String name, int number, boolean toUpperCase) {
        return (toUpperCase ? name.toUpperCase() : name) + number;
    }


    // Lambdas

    /*******************************************************/

    /**
     * {@link PlayGround001Kotlin#F003_Contains_Even(int[])}
     */
    public static boolean F003_Contains_Even(int[] intList) {

        for (int item : intList) {
            if (item % 2 == 0) {
                return true;
            }
        }
        return false;
    }


    //Data classes

    /*******************************************************/
    /**
     * {@link PlayGround001Kotlin#F004_Show_Person_Info()}
     */
    public static void F004_Show_Person_Info() {
        Person person = new Person("Data class", 1000);
        Log.d(TAG, "person.name:" + person.getName());
        Log.d(TAG, "person.age:" + person.getAge());
    }


    public static class Person {
        private final String name;
        private final int age;
        public PersonalInfo PersonalInfo = null;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public PersonalInfo getPersonalInfo() {
            return PersonalInfo;
        }

        public void setPersonalInfo(PersonalInfo personalInfo) {
            PersonalInfo = personalInfo;
        }
    }

    public static class PersonalInfo {
        private final String email;

        public PersonalInfo(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }

    //Nullable types

    /*******************************************************/

    public static void sendMessageToClient(
            @Nullable Person toPerson,
            @Nullable String message,
            @NotNull Mailer mailer) {

        if (toPerson == null || message == null) return;

        PersonalInfo personalInfo = toPerson.getPersonalInfo();
        if (personalInfo == null) return;

        String email = personalInfo.getEmail();
        if (email == null) return;

        mailer.sendMessage(email, message);
    }

    interface Mailer {
        void sendMessage(@Nullable String email, @Nullable String message);
    }
    /*******************************************************/

}
