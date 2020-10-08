package com.example.meuprograma.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.meuprograma.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommentsActivity extends AppCompatActivity {

    EditText txtPostId;
    EditText txtName;
    EditText txtEmail;
    EditText txtBody;
    ListView listViewPost;

    List<HashMap<String,String>> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
    }

    public void adicionarPost(View view) {

        //ENTRADA
        txtPostId = findViewById(R.id.txtItemPostId);
        txtName = findViewById(R.id.txtItemName);
        txtEmail = findViewById(R.id.txtItemEmail);
        txtBody = findViewById(R.id.txtItemBody);

        //PROCESSAMENTO
        String postId, name, email, body;
        postId = txtPostId.getText().toString();
        name = txtName.getText().toString();
        email = txtEmail.getText().toString();
        body = txtBody.getText().toString();

        //Agora vamos iniciar os trabalhos para o SimpleAdapter
        //SimpleAdapter precisa de um List< extends HasMap

        /*List<String> bla = new ArrayList<>();
        bla.add(""); //0
        bla.add(""); //1
        bla.add(""); //2
        bla.add(""); //3
        bla.add(""); //4
        bla.add(""); //5

        HashMap<String,String> mapExemplo = new HashMap<>();
        mapExemplo.put("index1","valor1");
        mapExemplo.put("index2","valor2");
        mapExemplo.put("index3","valor3");
        mapExemplo.put("index4","valor4");
        mapExemplo.put("index5","valor5");

        mapExemplo.get("index5"); //retorna "valor5"
     */

        HashMap<String ,String> map = new HashMap<>();
        map.put("postId",postId);
        map.put("name",name);
        map.put("email",email);
        map.put("body",body);

        lista.add(map);

        //SAIDA
        String[] from = {"postId","name","email","body"};
        int[] to = {R.id.txtItemPostId, R.id.txtItemName, R.id.txtItemEmail, R.id.txtItemBody};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,lista,R.layout.item_comments,from,to);

        listViewPost = findViewById(R.id.listViewPost);
        listViewPost.setAdapter(simpleAdapter);

    }
}