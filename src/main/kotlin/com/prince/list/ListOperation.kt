/*
* List collection in Kotlin stores a list of ordered elements.
* It can also store duplicate values. List is an interface in Kotlin,
* so it is implemented by specific implementations.
* */


fun main(args: Array<String>) {

    var listOfName = listOf("prince","kumar","singh")
    print(listOfName)

    /*
    * We can iterate a list using for each loop.
    * */
    for (name in listOfName){
        println(name)
    }
}