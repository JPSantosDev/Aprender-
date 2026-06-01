package com.example.aprender.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.aprender.ui.components.BuscarFiltrar
import com.example.aprender.ui.components.Cabecalho

@Composable
fun MainScreen(
    valor: String,
    aoMudarValor: (String) -> Unit
){
    Cabecalho()
    BuscarFiltrar(valor,aoMudarValor)
}