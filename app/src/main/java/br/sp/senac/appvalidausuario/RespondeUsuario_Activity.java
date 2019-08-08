package br.sp.senac.appvalidausuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RespondeUsuario_Activity extends AppCompatActivity {

    Button txtvoltar, btnRating;
    TextView recebeValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.responde_usuario_layout);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        recebeValor = (TextView) findViewById(R.id.lblRespostaUsuario);
        recebeValor.setText(message);

        final RatingBar ratingBar = (RatingBar) findViewById(R.id.idRatingBar);


        txtvoltar = (Button) findViewById(R.id.btnVoltar);

        txtvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });

        btnRating = (Button) findViewById(R.id.btnRating);

        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = "Sua avaliação : " + ratingBar.getRating();
                Toast.makeText(getApplicationContext(),
                        rating, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
