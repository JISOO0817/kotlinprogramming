package chap08.section2

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
        Product("snow ball",870.00),
        Product("Smart Phone",999.00),
        Product("Drone",240.00),
        Product("Mouse",333.55)
    )

    products.sortBy { it.price }
    products.forEach { println(it) }
}