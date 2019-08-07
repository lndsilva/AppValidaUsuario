package br.sp.senac.appvalidausuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RespondeUsuario_Activity extends AppCompatActivity {

    Button txtvoltar;
    TextView recebeValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.responde_usuario_layout);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        recebeValor = (TextView) findViewById(R.id.lblRespostaUsuario);
        recebeValor.setText(message);


        txtvoltar = (Button)findViewById(R.id.btnVoltar);

        txtvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });
    }
}
