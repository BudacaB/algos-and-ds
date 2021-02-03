import kotlin.system.measureNanoTime


fun main(args: Array<String>) {
    val nemo = arrayOf("nemo", "bla")

    val large = Array(5000){"$it"}
    large.fill("nemo")

    fun findNemo(array: Array<String>) {
        for (element in array) {
            if (element == "nemo") {
                println("Found NEMO!")
                break;
            }
        }
    }

    val time = measureNanoTime{
        findNemo(large) // O(n) -> Linear time
    }
    println(time)

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