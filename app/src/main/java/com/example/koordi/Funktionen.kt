val verfuegbareTageUndZeiten = mutableListOf<String>(
    "Dienstag 16:00",
    "Mittwoch 16:00",
    "Donnerstag 16:00"
)

fun stundeHinzufuegen(tagUndUhrzeit: String) {
    verfuegbareTageUndZeiten.add(tagUndUhrzeit)
}
fun gruppenAnzeigen() {
    println("Wählen Sie eine Gruppe:")
    verfuegbareTageUndZeiten.forEachIndexed { index, zeit ->
        println("${index + 1}. Koordi $zeit")
        println("${index + 1}. Kleinfeldtennis $zeit")
    }

    val eingabe = readLine()?.toIntOrNull()
    if (eingabe != null && eingabe > 0 && eingabe <= verfuegbareTageUndZeiten.size) {
        val ausgewählteGruppe = verfuegbareTageUndZeiten[eingabe - 1]
        println("Sie haben die Gruppe $ausgewählteGruppe gewählt.")
        // Weitere Logik, um Kinder der Gruppe anzuzeigen
    } else {
        println("Ungültige Eingabe.")
    }
}
val kinderListe = mutableListOf<Kind>()

fun wartelisteAnzeigen() {
    val kinderAufWarteliste = kinderListe.filter { it.warteliste }
    if (kinderAufWarteliste.isNotEmpty()) {
        println("Kinder auf der Warteliste:")
        kinderAufWarteliste.forEach { println(it.name) }
    } else {
        println("Keine Kinder auf der Warteliste.")
    }
}
fun kinderErstellen(
    name: String,
    alter: Int,
    geschlecht: String,
    tennisArt: TennisArt,
    verfuegbareTage: List<String>,
    warteliste: Boolean
): Kind {
    val kind = Kind(name, alter, geschlecht, tennisArt, verfuegbareTage, warteliste)
    kinderListe.add(kind)
    return kind
}
