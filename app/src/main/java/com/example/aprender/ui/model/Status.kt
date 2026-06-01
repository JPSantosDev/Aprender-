package com.example.aprender.ui.model

enum class Status {
    DISPONIVEL,
    INDISPONIVEL,
    EM_BREVE;

    fun label(): String = when (this) {
        DISPONIVEL   -> "Disponível"
        EM_BREVE     -> "Em breve"
        INDISPONIVEL -> "Indisponível"
    }

}

