package br.com.acessibilidade.map;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.List;

public class AddLocalActivity extends AppCompatActivity {

    private CheckBox Auditivo;
    private CheckBox FisicaOuMotora;
    private CheckBox Idoso;
    private CheckBox IntelectualOuMental;
    private CheckBox MobilidadeReduzida;
    private CheckBox Obesidade;
    private CheckBox Visual;
    private Button BtnEnviar;
    private List<CheckBox> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_local);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Auditivo = findViewById(R.id.chkAuditivo);
        FisicaOuMotora = findViewById(R.id.chkFisicaOuMotora);
        Idoso = findViewById(R.id.chkIdoso);
        IntelectualOuMental = findViewById(R.id.chkIntelecturalOuMental);
        MobilidadeReduzida = findViewById(R.id.chkMobilidadeReduzida);
        Obesidade = findViewById(R.id.chkObesidade);
        Visual = findViewById(R.id.chkVisual);
        BtnEnviar = findViewById(R.id.btnEnviar);


        BtnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckAcessibilidades();
            }
        });
    }

    public void CheckAcessibilidades(){
        if(Auditivo.isChecked()){
            Lista.add(Auditivo);
        }

        if(FisicaOuMotora.isChecked()){
            Lista.add(FisicaOuMotora);
        }

        if (Idoso.isChecked()){
            Lista.add(Idoso);
        }

        if (IntelectualOuMental.isChecked()){
            Lista.add(IntelectualOuMental);
        }

        if (MobilidadeReduzida.isChecked()){
            Lista.add(MobilidadeReduzida);
        }

        if (Obesidade.isChecked()){
            Lista.add(Obesidade);
        }

        if (Visual.isChecked()){
            Lista.add(Visual);
        }
    }
}
