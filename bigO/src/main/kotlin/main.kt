import kotlin.system.measureNanoTime


fun main(args: Array<String>) {
    val nemo = arrayOf("nemo")

    val large = Array(5000){"$it"}
    large.fill("nemo")

    fun findNemo(array: Array<String>) {
        for (element in array) {
            if (element == "nemo") {
                println("Found NEMO!")
            }
        }
    }

    val time = measureNanoTime{
        findNemo(large)
    }

    println(time)

}