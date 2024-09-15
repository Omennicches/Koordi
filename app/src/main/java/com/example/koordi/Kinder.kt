data class Kind(
    val name: String,
    val alter: Int,
    val geschlecht: String,
    var tennisArt: TennisArt,
    var verfuegbareTage: List<String>,
    var warteliste: Boolean = false
)

enum class TennisArt {
    KOORDI, KLEINFELDTENNIS
}
