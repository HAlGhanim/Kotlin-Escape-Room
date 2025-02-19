// 🏹 Stage 3: The Magic Chest (Loops & Collections)

// 💀 Problem: The magic chest contains duplicate treasures, but it must only return unique items.

fun main() {
    val chest = listOf("Gold", "Silver", "Gold", "Diamond", "Silver")
    var uniqueLoot = listOf<String>()

    for (item in chest) {
        if (!uniqueLoot.contains(item)) {
            uniqueLoot.add(item)  // 💣 Error: listOf() creates an immutable list
        }
    }
    println("Loot: $uniqueLoot")
}

// 🥤 Escape Condition: If you remove duplicates successfully, you move to Stage 4.