package org.example.organizzazione_spesa

class Supermercato(
    val nome: String,
    val citta: String,
    val ingredientiSalvati: MutableList<Ingrediente> = mutableListOf()
) {
    fun aggiungiIngrediente(ingrediente: Ingrediente) {
        ingredientiSalvati.add(ingrediente)
    }
}