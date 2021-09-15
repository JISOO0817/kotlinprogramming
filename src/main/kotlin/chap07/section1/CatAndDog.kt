package chap07.section1

open class Animal(val name: String)

class Dog(name: String, override var category: String) : Animal(name), Pet {
    override fun feeding() {
        println("Feed the dog a bone")
    }

    override fun test() {
        TODO("Not yet implemented")
    }

    override var species: String = "dog"
}

class Master {
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}")
    }
}

fun main() {
    val master = Master()
    val dog = Dog("Toto","small")
    val cat = Cat("coco","BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)
}