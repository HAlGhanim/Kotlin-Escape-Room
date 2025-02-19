// 🛑 Stage 1: The Locked Door (Basics & Variables)

// 💀 Problem: The door lock’s PIN code is incorrect because of an integer division issue!

fun main() {
    val pinCode = 7.0 / 2.0  // Should be 3.5
    if (pinCode == 3.5) {
        println("Door Unlocked!")
    } else {
        println("Access Denied!")
    }
}

// 🚪 Escape Condition: If you print "Door Unlocked!", you move to Stage 2.
