import kotlin.math.max

fun main() {
    val n = readln().toInt()
    val heights = readln().split(" ").map { it.toInt() }

    var answer = 0

    for (i in 0 until n) {
        var count = 0

        for (j in i + 1 until n) {
            if (heights[j] < heights[i]) {
                count++
            } else {
                break
            }
        }

        answer = max(answer, count)
    }

    println(answer)
}