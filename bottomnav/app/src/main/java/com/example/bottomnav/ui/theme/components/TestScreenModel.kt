package com.example.bottomnav.ui.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun TestInputScreen() {
    // Define your data input fields here
    var enduranceValue by remember { mutableStateOf("") }
    var speedValue by  remember { mutableStateOf("") }
    var strengthValue by remember { mutableStateOf("") }

    Column(Modifier.fillMaxSize()) {
        // Define your input icons for each data field
        OutlinedTextField(
            value = enduranceValue,
            onValueChange = { enduranceValue = it },
            label = { Text("Endurance Test Value") },
            leadingIcon = {
                Icon(Icons.Filled.Person, contentDescription = "Endurance Icon",modifier = Modifier.size(24.dp))
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)

        )

        OutlinedTextField(
            value = speedValue,
            onValueChange = { speedValue = it },
            label = { Text("Speed Test Value") },
            leadingIcon = {
                Icon(Icons.Filled.Person, contentDescription = "Speed Icon",modifier = Modifier.size(24.dp))
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        OutlinedTextField(
            value = strengthValue,
            onValueChange = { strengthValue = it },
            label = { Text("Strength Test Value") },
            leadingIcon = {
                Icon(Icons.Filled.Person, contentDescription = "Strength Icon", modifier = Modifier.size(24.dp))
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        // Define your submit button here
        Button(
            onClick = { submitTestResults(enduranceValue, speedValue, strengthValue) },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Submit")
        }
    }
}

// Function to handle submitting the test results
fun submitTestResults(enduranceValue: String, speedValue: String, strengthValue: String) {
    // Add your code to handle the submitted data here
}


@Preview
@Composable
fun ShoTestScreen(){
    TestInputScreen()
    }