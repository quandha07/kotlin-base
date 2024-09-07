enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

class Robot(private var x: Int, private var y: Int, private var direction: Direction) {

    private fun move(instruction: Char) {
        when (instruction) {
            'R' -> turnRight()
            'L' -> turnLeft()
            'A' -> advance()
        }
    }

    private fun turnRight() {
        direction = when (direction) {
            Direction.NORTH -> Direction.EAST
            Direction.EAST -> Direction.SOUTH
            Direction.SOUTH -> Direction.WEST
            Direction.WEST -> Direction.NORTH
        }
    }

    private fun turnLeft() {
        direction = when (direction) {
            Direction.NORTH -> Direction.WEST
            Direction.WEST -> Direction.SOUTH
            Direction.SOUTH -> Direction.EAST
            Direction.EAST -> Direction.NORTH
        }
    }

    private fun advance() {
        when (direction) {
            Direction.NORTH -> y++
            Direction.EAST -> x++
            Direction.SOUTH -> y--
            Direction.WEST -> x--
        }
    }

    fun processInstructions(instructions: String) {
        for (instruction in instructions) {
            move(instruction)
        }
    }

    fun getPosition(): String {
        return "($x, $y) facing $direction"
    }
}