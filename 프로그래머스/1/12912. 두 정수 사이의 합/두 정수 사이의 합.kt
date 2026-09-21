import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        val start = min(a, b)
        val end = max(a, b)
        for(i in start..end) {
            answer += i
        }
        return answer
    }
}