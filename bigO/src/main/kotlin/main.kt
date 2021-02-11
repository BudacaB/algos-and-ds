import java.lang.StringBuilder
import kotlin.math.floor
import kotlin.system.measureNanoTime


fun main(args: Array<String>) {
//    val nemo = arrayOf("nemo", "bla")
//
//    val large = Array(5000){"$it"}
//    large.fill("nemo")
//
//    fun findNemo(array: Array<String>) {
//        for (element in array) {
//            if (element == "nemo") {
//                println("Found NEMO!")
//                break;
//            }
//        }
//    }
//
//    val time = measureNanoTime{
//        findNemo(large) // O(n) -> Linear time
//    }
//    println(time)

    // Rule 1 -  can't assume "nemo" would be first in the array so we'd get O(1)
    // Worst case is O(n) if "nemo" is last in the array

// -------

//    fun printFirstItemThenFirstHalfThenSayHi100Times(items: Array<String>) {
//        println(items[0]) // O(1)
//
//        var middleIndex = floor((items.size / 2).toDouble())
//        var index = 0
//
//        while (index < middleIndex) { // O(n / 2)
//            println(items[index])
//            index++
//        }
//
//        for(i in 0..100) { // O(100)
//            println("hi")
//        }
//    }

    // overall it's O(n)


//    fun compressBoxesTwice(boxes: Array<String>) {
//        boxes.forEach { box -> println(box) }
//
//        boxes.forEach { box -> println(box) }
//    }

    // O(2n) => O(n)
    // Rule 2 - drop constants

// -------

//    fun compressBoxesTwice(boxes: Array<String>, boxes2: Array<String>) {
//        boxes.forEach { box -> println(box) }
//
//        boxes2.forEach { box -> println(box) }
//    }

    // O(a + b) -> if nested => O(a * b)
    // Rule 3 - different inputs


    // log all pairs of array
//    val boxes = arrayOf(1, 2, 3, 4, 5)
//
//    fun logAllBoxPairs(array: Array<Int>) {
//        for (i in array.indices) {
//            for (j in array.indices) {
//                println(StringBuilder().append(array[i]).append(" ").append(array[j]))
//            }
//        }
//    }
//
//    logAllBoxPairs(boxes)

    // O(n * n) -> O(n^2) - quadratic time

// -------

    fun printAllNumbersThenAllPairSums(numbers: Array<Int>) {
        println("Print these numbers")
        numbers.forEach { number -> println(number) }

        println("and these are their sums:")
        numbers.forEach { firstNumber ->
            run {
                numbers.forEach { secondNumber -> println(firstNumber + secondNumber) }
            }
        }
    }

    printAllNumbersThenAllPairSums(numbers = arrayOf(1, 2, 3, 4, 5))

    // O(n + n^2) -> O(n^2)
    // Rule 4 - drop non dominants

// -------

//    val boxes = Array(6){"$it"}
//    // O(1) -> constant time
//    val compressFirstBox = { boxes: Array<String> -> println(boxes[0])}
//    fun compressFirstBox2(boxes: Array<String>) {
//        println(boxes[0])
//        println(boxes[1])
//    }
//
//    compressFirstBox(boxes)
//    compressFirstBox2(boxes)

}