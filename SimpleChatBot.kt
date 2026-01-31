fun main() {
    greet("Aid", "2026")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.\nI was created in ${birthYear}.")
}

fun remindName() {
    println("Please, remind me your name.")
    println("What a great name you have, ${readln()}!")
}

fun guessAge() {
    println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.")
    val (rem3, rem5, rem7) = IntArray(3) { readln().toInt() }
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = readln().toInt()
    for (i in 0..num) println("$i!")
}

fun test() {
    println("Let's test your programming knowledge.")
    println("""
        1. To repeat a statement multiple times.
        2. To decompose a program into several small subroutines.
        3. To determine the execution time of a program.
        4. To interrupt the execution of a program.
    """.trimIndent())
    while (readln() != "4") println("Please, try again.")
}

fun end() = println("Congratulations, have a nice day!")
