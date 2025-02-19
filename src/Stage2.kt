// 🗝️ Stage 2: The Poisoned Potion (Functions & Null Safety)

// 💀 Problem: The healing potion is null, causing an error!

fun healPlayer(potion: String?) {
    println("Drinking potion: " + potion?.toUpperCase())  // 💣 Possible crash!
}

fun main() {
    val potion: String? = null
    healPlayer(potion)
}

// 🥤 Escape Condition: If you avoid the NullPointerException, you move to Stage 3.