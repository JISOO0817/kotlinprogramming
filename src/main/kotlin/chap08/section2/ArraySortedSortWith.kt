package chap08.section2

data class Product2(val name: String, val price: Double)

fun main() {
    val products2 = arrayOf(
        Product2("snow ball",870.00),
        Product2("Smart Phone A",999.00),
        Product2("Drone",240.00),
        Product2("Mouse",633.55),
        Product2("Mouse",500.55),
        Product2("Keyboard",125.99)
    )
//    products2.sortWith(
//        {p1,p2 ->
//            when{
//                p1.price > p2.price -> 1
//                p1.price == p2.price -> 0
//                else -> -1
//            }
//        }
//    )

    products2.sortWith(compareBy({it.name},{it.price}))

    products2.forEach { println(it) }
}