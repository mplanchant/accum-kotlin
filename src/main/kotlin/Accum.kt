package uk.co.logiccache.accum

fun accum(characters: String): String {
    if (characters.isBlank()) return ""
    return characters.mapIndexed { index, it -> repeatChar(index + 1, it) }.joinToString(separator = "-")
}

private fun repeatChar(index: Int, character: Char): String {
    return "${character.toUpperCase()}${character.toLowerCase().toString().repeat(index - 1)}"
}