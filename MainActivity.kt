package hr.ferit.kv3_projekt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import hr.ferit.kv3_projekt.ui.theme.Kv3projektTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kv3projektTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF27A436)
                ) {
                   LoginScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ribicica),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(160.dp) // Promijenjena veličina slike
                    .padding(top = 32.dp) // Dodajemo padding iznad slike
            )
            Text(
                text = "Fisher",
                fontSize = 35.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 16.dp)
            )
            Spacer(modifier = Modifier.height(16.dp)) // Dodajemo prostor između naslova i polja za unos
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
            }
            Spacer(modifier = Modifier.height(16.dp)) // Dodajemo prostor između polja za unos i login forme
            Surface(
                modifier = Modifier
                    .width(350.dp)
                    .height(300.dp),
                shape = RoundedCornerShape(8.dp),
                color = Color(0xFF62cc6f)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "Username:",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    // Polje za unos korisničkog imena
                    TextField(
                        value = "",
                        shape = RoundedCornerShape(8.dp),
                        onValueChange = { },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        textStyle = TextStyle(color = Color.Black),
                        colors = TextFieldDefaults.textFieldColors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp)) // Dodajemo prostor između polja za unos i login forme
        }
        Button(
            onClick = { },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(8.dp)
                .height(48.dp)
                .width(200.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
        ) {
            Text(
                text = "Login",
                fontSize = 20.sp,
                color = Color.White,
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    Kv3projektTheme {
        LoginScreen()
    }
}
