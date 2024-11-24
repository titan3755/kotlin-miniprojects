fun main() {
    println("Sentence Repeat")
    print("Enter a sentence: ")
    val sentence = readln()
    print("Enter the number of repeat: ")
    val repeat = readln().toInt()
    iterator(sentence, repeat)
}

fun iterator(sentence: String, repeat: Int) {
    for (number in 1..repeat) {
        println("Repeat: $sentence")
    }
}