package com.example.codigoaleatorio.Actividades;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.codigoaleatorio.Entidades.Persona;
import com.example.codigoaleatorio.R;

public class MainActivity extends AppCompatActivity {

    EditText campoNombre,campoApellido;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNombre=findViewById(R.id.campoNombre);
        campoApellido=findViewById(R.id.campoApellido);
        textView=findViewById(R.id.mostrar);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void OnClick(View view) {
        switch (view.getId()){
            case R.id.btnGenerar:
                Persona persona=new Persona(campoNombre.getText().toString(),campoApellido.getText().toString());
                textView.setText(persona.MostrarInfo());

                break;
        }
    }
}
