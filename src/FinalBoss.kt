// 🏆 Final Boss: The Guardian’s Riddle (Classes, Inheritance & Companion Object)

// 💀 Problem: The Guardian blocks the exit because the class structure is broken!

open class Guardian(var name: String) {
    fun speak() = println("I am $name, the dungeon guardian!")
}

class FireGuardian(name: String) : Guardian(name) {
    companion object {
        val guardianType = "Fire"
    }
}

fun main() {
    val boss = FireGuardian("Inferno")
    boss.name= boss.name.reversed()
    println(boss.name)
    println("Type: " + FireGuardian.guardianType)  // 💣 Error: Companion object is not an instance property
}


// 👑 Escape Condition: If you correctly print the guardian type, you win the game!