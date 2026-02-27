fun main() {
    val n = readln().toInt()
    val descendingNumber = mutableListOf<Long>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val candidate: MutableList<Int> = mutableListOf(1, 0)

    while (true) {
        val currentNum = candidate.joinToString("").toLong()
        descendingNumber.add(currentNum)
        if (currentNum == 9876543210L) break
        var isChanged = false

        for (i in candidate.indices.reversed()) {
            val canIncrement = if (i == 0) {
                candidate[i] < 9
            } else {
                candidate[i] + 1 < candidate[i - 1]
            }

            if (canIncrement) {
                candidate[i]++
                var resetValue = 0
                for (j in candidate.lastIndex downTo i + 1) {
                    candidate[j] = resetValue++
                }

                isChanged = true
                break
            }
        }

        if (!isChanged) {
            val newSize = candidate.size + 1
            candidate.clear()
            for (i in newSize - 1 downTo 0) {
                candidate.add(i)
            }
        }
    }

    val result = if (n < descendingNumber.size) descendingNumber[n] else -1
    println(result)
}