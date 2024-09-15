fun kinderErstellenScreen() {
    println("Name des Kindes:")
    val name = readLine() ?: ""

    println("Alter des Kindes:")
    val alter = readLine()?.toIntOrNull() ?: 0

    println("Geschlecht des Kindes (m/w):")
    val geschlecht = readLine() ?: ""

    println("Tennisart wählen (1 für Koordi, 2 für Kleinfeldtennis):")
    val tennisArt = when (readLine()) {
        "1" -> TennisArt.KOORDI
        "2" -> TennisArt.KLEINFELDTENNIS
        else -> TennisArt.KOORDI // Standard Koordi
    }

    println("Wählen Sie die Tage (Mehrfachauswahl durch Komma getrennt):")
    verfuegbareTageUndZeiten.forEachIndexed { index, zeit ->
        println("${index + 1}. $zeit")
    }
    val tageEingabe = readLine()
    val verfuegbareTage = tageEingabe?.split(",")?.mapNotNull {
        verfuegbareTageUndZeiten.getOrNull(it.trim().toInt() - 1)
    } ?: listOf()

    println("Soll das Kind auf die Warteliste? (ja/nein):")
    val aufWarteliste = readLine()?.toLowerCase() == "ja"

    val kind = kinderErstellen(name, alter, geschlecht, tennisArt, verfuegbareTage, aufWarteliste)
    println("Kind ${kind.name} wurde erfolgreich erstellt.")
}
