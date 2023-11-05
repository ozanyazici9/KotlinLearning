package com.ozanyazici.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello kotlin")
        println(4 * 5)

        //Conversion
        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)

        //Collections

        //Arrays

        println("----------Array---------")

        val myArray = arrayOf("ozan", "mahmut", "ali")

        println(myArray[0])
        myArray[0] = "ozan yazıcı"
        println(myArray[0])
        println(myArray)

        //List

        println("------------list---------")

        val myMusician = arrayListOf<String>("ozan","ali")
        myMusician.add("lars")
        println(myMusician[2])
        myMusician.add(0,"rob")
        println(myMusician[0])

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add(3)
        myMixedArrayList.add(23.34)
        myMixedArrayList.add(false)

        println(myMixedArrayList[0])
        println(myMixedArrayList[2])

        //set diziden farkı elemanları uniqe dir

        println("------------set----------")

        val mySet = setOf<Int>(1,1,2,3)

        println(mySet.size)

        //For Each

        mySet.forEach { println(it) }

        val myStringSet = HashSet<String>()
        myStringSet.add("Atil")
        myStringSet.add("Atil")
        println(myStringSet.size)

        //Map - hashMap

        println("-------------Map------------")

        //Key - Value

        val fruitMap = hashMapOf<String,Int>()
        fruitMap.put("Apple",100)
        fruitMap.put("banana",150)
        println(fruitMap["Apple"])

        val myHashmap = hashMapOf<String,Int>("a" to 1,"b" to 2, "c" to 3)
        println(myHashmap["c"])

        //Switch - When
        println("--------------------when-----------")

        val day = 3
        var dayString = ""

        when(day) {
            1 -> dayString = "monday"
            2 -> dayString = "tuesday"
            3 -> dayString = "wendesday"
            else -> dayString = "saturday"
        }

        println(dayString)


        








    }
}