package chap09.section3

fun main() {

    val capitalCityMap: MutableMap<String, String> = mutableMapOf("korea" to "seoul", "china" to "beijing", "japan" to "tokyo")
    println(capitalCityMap.values)
    println(capitalCityMap.keys)

    capitalCityMap.put("uk","london")
    capitalCityMap.remove("china")
    println(capitalCityMap)

}