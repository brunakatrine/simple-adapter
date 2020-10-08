package com.example.meuprograma.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.meuprograma.R;
import com.example.meuprograma.debug.DebugActivity;

import org.w3c.dom.Text;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibir(View view) {

        // Pegar a opção da tela passada por parâmetro
        int opcao = view.getId();

        Intent intent = null;

        switch(opcao){
            case R.id.btnAddress:

                intent = new Intent(this,AddressActivity.class);
                startActivity(intent);

                break;

            case R.id.btnPessoa:

                intent = new Intent(this,PessoaActivity.class);
                startActivity(intent);

                break;

            case R.id.btnUser:

                intent = new Intent(this,UserActivity.class);
                startActivity(intent);

                break;

            case R.id.btnPost:

                intent = new Intent(this,PessoaActivity.class);
                startActivity(intent);

                break;

            default:
                Toast.makeText(this, "Opção Inválida!", Toast.LENGTH_LONG).show();
        }
    }
}