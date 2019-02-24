
fun main() {
    var x = 10
    var y = 20

    println("x = $x, y = $y")

    var temp = y
    y = x
    x = temp

    println("x = $x, y = $y")
}