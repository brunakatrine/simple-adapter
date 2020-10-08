package com.example.meuprograma.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.meuprograma.R;
import com.example.meuprograma.debug.DebugActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostActivity extends DebugActivity {

    EditText txtUserId;
    EditText txtTitle;
    EditText txtBody;
    ListView listViewPost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }

    public void adicionarPost(View view) {

        //ENTRADA
        txtUserId = findViewById(R.id.txtUserId);
        txtTitle = findViewById(R.id.txtTitle);
        txtBody = findViewById(R.id.txtBody);

        //PROCESSAMENTO
        String userId,title,body;
        userId = txtUserId.getText().toString();
        title = txtTitle.getText().toString();
        body = txtBody.getText().toString();

        // Agora vamos iniciar os trabalhos para o SimpleAdapter


        List< HashMap<String,String>> lista = new ArrayList<>(); //pega a lista de dados enviada pelo usuário

        HashMap<String,String> map = new HashMap<>(); //Armazena as informações do usuário num map (mapa de valores)
        map.put("userId",userId);
        map.put("title",title);
        map.put("body",body);

        lista.add(map);


        //SAIDA
        String[] from = {"userId","title","body"}; //chaves do seu map

        int[] to = {R.id.txtItemUserId, R.id.txtItemTitle, R.id.txtItemBody};  //ids do layout do tipo ""Item

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,lista,R.layout.item_post, from,to);

        // Procurar a referência  da listView para que essa possa imprimir dos dados utilizado o padrão ADAPTER
        listViewPost = findViewById(R.id.listViewPost);
        listViewPost.setAdapter(simpleAdapter);
    }
}