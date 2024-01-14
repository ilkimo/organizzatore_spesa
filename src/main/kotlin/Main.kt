package org.example

import org.example.organizzazione_spesa.*

fun main() {
    val supermercati = mutableListOf<Supermercato>()
    val ricette = mutableListOf<Ricetta>()
    var listaSpesa = ListaSpesa(mutableListOf())

    while (true) {
        println("\n--- Menu Principale ---")
        println("1. Aggiungi supermercato")
        println("2. Aggiungi ingrediente al supermercato")
        println("3. Aggiungi ricetta")
        println("4. Aggiungi ingrediente alla ricetta")
        println("5. Aggiungi ricetta alla lista della spesa")
        println("6. Ottieni lista della spesa")
        println("7. Esci")
        print("Scegli un'opzione: ")

        when (readLine()) {
            "1" -> { /* Logica per aggiungere un supermercato */ }
            "2" -> { /* Logica per aggiungere un ingrediente al supermercato */ }
            "3" -> { /* Logica per aggiungere una ricetta */ }
            "4" -> { /* Logica per aggiungere un ingrediente alla ricetta */ }
            "5" -> { /* Logica per aggiungere una ricetta alla lista della spesa */ }
            "6" -> { /* Stampa la lista della spesa */ }
            "7" -> break
            else -> println("Opzione non valida.")
        }
    }
}
