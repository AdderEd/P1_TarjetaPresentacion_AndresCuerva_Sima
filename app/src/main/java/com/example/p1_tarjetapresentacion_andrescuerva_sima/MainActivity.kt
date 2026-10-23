package com.example.p1_tarjetapresentacion_andrescuerva_sima

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_andrescuerva_sima.ui.theme.P1_TarjetaPresentacion_AndresCuerva_SimaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P1_TarjetaPresentacion_AndresCuerva_SimaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                color = Color(

                                    red = 0.8f,
                                    green = 3.5f,
                                    blue = 1.1f,
                                    alpha = 0.8f
                                )
                            )

                    ) {
                        Tarjeta(

                            nombres = stringResource(R.string.nombres),
                            titulo = stringResource(R.string.titulo),
                            instituto = stringResource(R.string.instituto),
                            correo1 = stringResource(R.string.correoAndres),
                            correo2 = stringResource(R.string.correoSima),
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun Tarjeta(nombres: String, titulo: String, instituto: String, correo1: String, correo2: String, modifier: Modifier = Modifier) {


    Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Card(

            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            //TODO: Cambiar esta parte del código por mala práctica
            modifier = Modifier.size(349.dp, 600.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {


                Image(
                    painter = painterResource(

                        R.drawable.gatos
                    ),
                    contentDescription = null,
                    modifier
                        .padding(2.dp)
                        .size(150.dp)
                )

                Text(

                    text = nombres.uppercase(),
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    textDecoration = TextDecoration.Underline,
                )

                Text(

                    text = titulo.uppercase(),
                    textAlign = TextAlign.Center,
                    fontSize = 10.sp
                )

                Column (modifier = Modifier.padding(top = 90.dp), horizontalAlignment = Alignment.CenterHorizontally) {

                    Row (verticalAlignment = Alignment.CenterVertically) {

                        Image(

                            painter = painterResource(R.drawable.cmadrid),
                            contentDescription = null,
                            Modifier
                                .size(25.dp)
                                .padding(end = 2.dp))

                        Text(

                            text = instituto,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(8.dp),
                            fontSize = 14.sp
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Image(

                            painter = painterResource(R.drawable.iconocorreo),
                            contentDescription = null,
                            Modifier
                                .size(25.dp)
                                .padding(end = 2.dp))

                        Text(

                            text = correo1,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(8.dp),
                            fontSize = 14.sp
                        )
                    }

                    Row(verticalAlignment = Alignment.CenterVertically) {

                        Image(

                            painter = painterResource(R.drawable.iconocorreo),
                            contentDescription = null,
                            Modifier
                                .size(25.dp)
                                .padding(end = 2.dp))

                        Text(

                            text = correo2,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(8.dp),
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }
}