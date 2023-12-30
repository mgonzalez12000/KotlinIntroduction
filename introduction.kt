// In order to excecute the file, code should be ran on the main function
fun main() {
      // This is how you write comments in Kottlin
      println("Hello World")
      /*
      This is how you can write mult-line comments in Kotlin
      The format of writing comments in Kotlin is very similar to Java
      The syntax for Kotlin is very similar to Java and JS
      */
    

      /*
      VARIABLES
      ----------
      - Unlike other strictly written languages, when declaring variables in Kotlin you do NOT need to declare the type for the variable.
      - When declaring variables, Kotlin uses two ways to declare variables: var AND val:
                  Use val for a variable that is immutable (never changes)
                  Use var for a variable that is mutable (value can change)
      This concept is SIMILAR to JS variable declaration.
      */
      println("----------")
      println("VARIABLES")
      println("----------")
      var name = "John"
      val birthYear = 1975
      println(name)
      println(birthYear)
      // If you insist to declare the variable type, you can do the following syntax:
      var name2: String = "John2"
      val birthYear2: Int = 1975
      println(name2)
      println(birthYear2)


      /*
      LOOPS
      -----
      - Very similar to Java/Pyhton syntax. However, uses 'until' keyword instead of variable decleration, size, incrementation
            eg: for (int i = 0; i < iterable.length; i++) is written as for (i in 0 until iterable.size)
      - Like other languages, elements can be pulled from an iterable by using the indexing operator, such as, iterable[i] when iterating through the iterable
      */
      println("------") 
      println("LOOPS")
      println("------") 
      for (i in 1..5){
            print(i)
      }
      // Creating a populated list to loop over.
      var listOfStrings = listOf("StringNumberOne", "StringNumberTwo", "StringNumberThree")
      println("\n" + listOfStrings)
      // while loops
      var i = 0
      println("\nUsing a while loop:")
      while(i < listOfStrings.size){
            println(listOfStrings[i])
            i++
      }
      // using forEach() method
      println("Using a forEach loop:")
      listOfStrings.forEach{e -> println(e)}
      // using for loop (basic loop)
      println("\nUsing a basic for loop:")
      for (i in listOfStrings){
            println(i)
      }
      // using an alternative for loop (common with data structures usage). Notice the 'until' key word.
      println("\nUsing the alternative for loop for indeces:")
      for (i in 0 until listOfStrings.size){
            println(listOfStrings[i] + " ")
      }

      /*
      Common Data Strcutures in Kotlin:
      Lists/Arrays: To declare lists, there are two important details when declaring lists:
            - listOf() is used for any IMMUTABLE list. This declared list cannot be appended to or removed from.
            - mutableListOf() is used for a MUTABLE list. This declared list can be appended to or removed from.
            - When declaring an empty list, its needed to declare list type such as:
                  var exampleList = listOf<Integer>()
      Hashmap: Unlike Java, there is no need to import Java.util.hashmap. Syntax is similar with type decleration.
      HashSet: Unliked Java, there is no need to import Java.util.hashset. Syntac is similar with type declartion.
       */

      // Hashmap
      val locationsMap = HashMap<String, String>()
      locationsMap.put("USA", "Washington D.C.")
      locationsMap.put("India", "New Delhi")
      locationsMap.put("Nigeria", "Abuja")
      locationsMap.put("France", "Paris")
      println(locationsMap)
      // Accessing a value from a key, value pair
      println(locationsMap["USA"]) // "Washing D.C."
      // Accesing a key from a key, value pair
      val emptyListExample = mutableListOf<String>()
      for ((key, value) in locationsMap){
            if (value == "Paris"){
                  emptyListExample.add(key)
            }
      }
      println(emptyListExample)

      // Hashset
      val hashSetExampleInts = HashSet<Int>()
      hashSetExampleInts.add(1)
      hashSetExampleInts.add(2)
      hashSetExampleInts.add(3)
      hashSetExampleInts.add(4)
      hashSetExampleInts.add(5)
      println(hashSetExampleInts)
      for (item in hashSetExampleInts) {
            print(item)
      }
      println()
      // Keep in mind, when adding an element to a hashset that is a duplicate, the item will not be added
      hashSetExampleInts.add(3)
      println(hashSetExampleInts)

}