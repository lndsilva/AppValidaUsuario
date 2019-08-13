package br.sp.senac.appvalidausuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Cadastrar_Activity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar_layout);

        toolbar = (Toolbar) findViewById(R.id.idToolBar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(), "Cliquei em buscar", Toast.LENGTH_SHORT).show();
                break;

            case R.id.mConfiguracoes:
                Toast.makeText(getApplicationContext(), "Cliquei em configurações", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
