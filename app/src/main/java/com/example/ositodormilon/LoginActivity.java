package com.example.ositodormilon;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        textView = findViewById(R.id.textView);
        textView.setText("Bienvenidos, Osito Dormilón");

        // Aquí puedes implementar la lógica para iniciar sesión, crear sesión, etc.
        // Por ejemplo, puedes agregar botones e implementar sus acciones.
    }
}
