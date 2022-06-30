package com.prince.list

/*
* ArrayList provides implementation
* for MutableList interface in Kotlin. It comes under List collection.
* */

fun main(args: Array<String>) {
    // creating blank list
    var emptyArrayList = arrayListOf<String>()

    var planets = arrayListOf<String>("Mercury", "Venus", "Earth", "Pluto")
    for (planet in planets) {
        println(planet)
    }
    // Add element in existing ArrayList using addAll to add a list of elements to array list
    planets.addAll(listOf("Jupiter", "Saturn"))
    for (planet in planets) {
        println(planet);
    }
    // Adding element to end of an ArrayList
    planets.add("new Jupiter");

    for (planet in planets) {
        println(planet);
    }
    //Adding element to middle of an ArrayList
    planets.add(2, "Jupiter at 2");

    for (planet in planets) {
        println(planet);
    }
    // chek element in list
    if (planets.contains("Pluto")) {
        println("Pluto is a Planet!")
    } else {
        println("Pluto is NOT a Planet!")
    }
    //Removing single element from ArrayList
    planets.remove("Pluto")

    for (planet in planets) {
        println(planet)
    }

    // Removing list of element
    planets.removeAll(listOf("Earth", "Pluto"))

    for (planet in planets) {
        println(planet)
    }
    // Remove element at index
    planets.removeAt(2)

    for (planet in planets) {
        println(planet)
    }
    // Remove element in certain condition
    planets = arrayListOf<String>("Mercury", "Venus", "Earth", "Pluto", "Eldorado")
    planets.removeIf { x -> x.startsWith("E") }

    for (planet in planets) {
        println(planet)
    }
    // Reverse of array list
    planets.reverse()

    for (planet in planets) {
        println(planet)
    }
    // clear array list
    planets.clear()
    for (planet in planets) {
        println(planet)
    }
    // Remove duplicates from array list
    planets = arrayListOf<String>("Mercury", "Venus", "Earth", "Earth", "Venus", "Pluto")
    var uniquePlanets = planets.distinct()
    for (planet in uniquePlanets) {
        println(planet)
    }
    //Maximum value in ArrayList
    var numbersData = arrayListOf<Int>(21, 44, 99, 74, 33)
    var maxValue = numbersData.max()

    println("ArrayList Max value = " + maxValue)

    var minValue = numbersData.min()

    println("ArrayList Min value = " + minValue)
    //indexOf function to get the index position of a particular element
    var value = numbersData.indexOf(99)

    println("value = " + value)
}
