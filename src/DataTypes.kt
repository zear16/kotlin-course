
fun main() {

    val name = "Pratchaya"
    val age = 16
    val gpa = 2.6

    println("===== User Info =====")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $gpa")

    var count = 1
    println("Count: $count")
    count = 10
    println("Count: $count")

    var department: String?
    department = null
    department = "Information Engineering"
    println("Department: ${department!!}")
}