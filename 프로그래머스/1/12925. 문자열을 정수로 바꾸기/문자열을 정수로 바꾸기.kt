class Solution {
    fun solution(s: String): Int {
        var answer = 0

        answer = when(s.first()) {
            '+' -> s.drop(1).toInt()
            '-' -> s.drop(1).toInt() * -1
            else -> s.toInt()
        }

            return answer
    }
}