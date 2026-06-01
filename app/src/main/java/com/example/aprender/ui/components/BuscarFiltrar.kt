package com.example.aprender.ui.components

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BuscarFiltrar(
    valor:String,
    aoMudarValor: (String) -> Unit,
){
    TextField(
        value = valor,
        onValueChange = aoMudarValor,
        placeholder = {Text("Buscar")},
        label = {Text("Buscar")},
        singleLine = true
    )
}

@Composable
@Preview
fun PreviewBuscarPreview(){
    BuscarFiltrar(
        valor = "a",
        aoMudarValor = {})
}
