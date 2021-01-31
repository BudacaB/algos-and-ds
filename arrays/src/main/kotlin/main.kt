fun main(args: Array<String>) {
    // val strings = arrayOf("a", "b", "c", "d")
    // on a 32-bit (4 bytes) system this array would take up 4 * 4 = 16 bytes of storage

    val strings = arrayListOf("a", "b", "c", "d")

    // push
    strings.add("e"); // O(1)

    // pop
    strings.removeAt(strings.size - 1); // O(1)

    // unshift
    strings.add(0, "x"); // O(n) -> shifting (or looping to shift) the rest of the elements

    // splice
    strings.add(2, "y"); // O(n)

    // lookup
    println(strings[2]); // O(1)
}