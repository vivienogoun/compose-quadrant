package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrants()
                }
            }
        }
    }
}

@Composable
fun Quadrant(color: Color, composable: String, role: String, modifier: Modifier = Modifier) {
    Column(
        modifier
            .background(color = color)
            .padding(16.dp)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = composable, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
        Text(text = role, textAlign = TextAlign.Justify)
    }
}

@Composable
fun Quadrants(modifier: Modifier = Modifier) {
    Column(modifier) {
        Row(modifier.weight(1F)) {
            Quadrant(
                color = Color(0xFFEADDFF),
                composable = stringResource(R.string.text_composable),
                role = stringResource(R.string.text_composable_role),
                modifier = Modifier.weight(1F)
            )
            Quadrant(
                color = Color(0xFFD0BCFF),
                composable = stringResource(R.string.image_composable),
                role = stringResource(R.string.image_composable_role),
                modifier = Modifier.weight(1F)
            )
        }
        Row(modifier.weight(1F)) {
            Quadrant(
                color = Color(0xFFB69DF8),
                composable = stringResource(R.string.row_composable),
                role = stringResource(R.string.row_composable_role),
                modifier = Modifier.weight(1F)
            )
            Quadrant(
                color = Color(0xFFF6EDFF),
                composable = stringResource(R.string.column_composable),
                role = stringResource(R.string.column_composable_role),
                modifier = Modifier.weight(1F)
            )
        }
    }
}
