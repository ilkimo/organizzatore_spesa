package org.example.organizzazione_spesa

class ListaSpesa(val listaRicette: List<Ricetta>) {
    fun ottieniLista(): List<Ingrediente> {
        val mappaIngredienti = mutableMapOf<String, Ingrediente>()

        listaRicette.flatMap { it.listaIngredienti }.forEach { ingrediente ->
            mappaIngredienti.merge(ingrediente.nome, ingrediente) { ing1, ing2 ->
                ing1.apply { quantita += ing2.quantita }
            }
        }

        return mappaIngredienti.values.sortedBy { it.posizioneSupermercato }
    }
}
