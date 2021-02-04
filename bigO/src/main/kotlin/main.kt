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
    

    fun compressBoxesTwice(boxes: Array<String>) {
        boxes.forEach { box -> println(box) }

        boxes.forEach { box -> println(box) }
    }

    // O(2n) => O(n)

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