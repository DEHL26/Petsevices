package com.petservices.petsevices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via user/password.
 */
public class Login extends AppCompatActivity {
    private EditText et1;
    private EditText et2;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
    }


    public void verificar(View v) {
        String usuario=et1.getText().toString();
        String clave=et2.getText().toString();
        if(usuario.equals("Esperanza") && clave.equals("Hernandez1")) {
            Intent i = new Intent(this, RegistroUse.class);
            startActivity(i);
        }
        else{
            Toast notification= Toast.makeText(this,"Clave incorrecta",Toast.LENGTH_LONG);
             notification.show();
        }
    }
}

