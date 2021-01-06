fun sumConsecutives(s: List<Int>): List<Int> {
    val mutList = mutableListOf<Int>()
    var i = 0
    while (i < s.size){
        var tempIndex = i + 1
        var value = s[i]
        while(s.size > tempIndex && s[tempIndex] == s[i]){
            value += s[tempIndex]
            tempIndex++
            i++
        }
        mutList.add(value)
        i++
    }
    return mutList
}