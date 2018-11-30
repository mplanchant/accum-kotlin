package uk.co.logiccache.accum

fun accum(characters: String): String {
    if (characters.isBlank()) return ""
    return characters.mapIndexed { index, c -> repeatChar(index + 1, c) }.joinToString(separator = "-")
}

private fun repeatChar(index: Int, character: Char): String {
    return "${character.toUpperCase()}${character.toLowerCase().toString().repeat(index - 1)}"
}