package com.`fun`.project

import android.util.Log


class PlayGround001Kotlin {
    companion object {
        const val HELLO_WORLD = "HELLO_WORLD"
        const val TAG = "TEST KOTLIN"
    }


    // Hello world!
    /************************************************/

    /**
     * @see PlayGround001Java.F001_Hello_World
     */
    fun F001_Hello_World(): String {
        return HELLO_WORLD
    }

    fun F001_Hello_World_01(): String = HELLO_WORLD

    fun F001_Hello_World_02() = HELLO_WORLD


//    Default Arguments
    /*******************************************************/

    /**
     * @see PlayGround001Java.F002_Default_Arguments
     */
    fun F002_Default_Arguments(name: String, number: Int = 42, toUpperCase: Boolean = false): String {

        return if (toUpperCase) {
            name.toUpperCase() + number
        } else {
            name + number
        }
    }

    fun F002_Default_Arguments_01(name: String, number: Int = 42, toUpperCase: Boolean = false)
            = (if (toUpperCase) name.toUpperCase() else name) + number


    // Lambdas
    /*******************************************************/
    /**
     * @see PlayGround001Java.F003_Contains_Even
     */
    fun F003_Contains_Even(intList: IntArray): Boolean {
        return intList.any { it % 2 == 0 }
    }


    //Data classes

    /*******************************************************/

    /**
     * @see PlayGround001Java.F004_Show_Person_Info
     */
    fun F004_Show_Person_Info() {
        val person = Person("Data class", 1000)
        Log.d(TAG, "person.name:" + person.name)
        Log.d(TAG, "person.age:" + person.age)
    }

    data class Person(val name: String, val age: Int) {
        var personInfo: PersonInfo? = null
    }

    class PersonInfo(val email: String)


    //Nullable types
    /*******************************************************/


    interface Mailer {
        fun sendMessage(email: String, message: String)
    }
    /*******************************************************/

}