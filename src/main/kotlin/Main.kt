
fun main () {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    println("What is 75 / 5?")
    var studentAnswer1 = Integer.valueOf(readLine())

    println("6 * 2y = 36. What is value of y?")
    var studentAnswer2 = Integer.valueOf(readLine())

    println("Name the type of triangle that has two equal sides:")
    val studentAnswer3 = readLine()

    println("What is value of 8* 6 - (3 - 2)")
    var studentAnswer4 = Integer.valueOf(readLine())

    var points = 0

    if (studentAnswer1 == quizAnswer1) {
        points += 25
    }

    if (studentAnswer2 == quizAnswer2) {
        points += 25
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
        points += 20
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2")
    }

    if (studentAnswer3 == quizAnswer3) {
        points += 25
    } else if (studentAnswer3 == "equilateral") {
        points += 10
    } else {
        points += 1
    }

    if (studentAnswer4 == quizAnswer4) {
        points += 25
    } else if (studentAnswer4 in 44..54) {
        points += 20
    } else {
        points += 1
    }
}