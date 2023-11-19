package br.upf.poo.appmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Motor motor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ------------------------------------------------
        motor = new Motor(8000);
        atualizarTela();

    }

    private void atualizarTela() {
        // Pegamos as referências dos componentes visuais que estão no XML
        CheckBox editLigado = (CheckBox) findViewById(R.id.editLigado);
        ProgressBar editRpm = (ProgressBar) findViewById(R.id.editRpm);
        EditText editRpmNumber = (EditText) findViewById(R.id.editRpmNumber);
        // Agora usamos dados do objeto para inicializar os compoentes visuais
        editLigado.setChecked(motor.isLigado());
        editRpm.setProgress(motor.getRpmAtual());
        editRpmNumber.setText(motor.getRpmAtual()+" RPM");

    }

    public void ligar(View v){
        try {
            motor.ligar();
            atualizarTela();
            Toast.makeText(getBaseContext(), "Motor ligado", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void desligar(View v){
        try {
            motor.desligar();
            atualizarTela();
            Toast.makeText(getBaseContext(), "Motor desligado", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void acelerar(View v){
        try {
            motor.acelerar();
            atualizarTela();
            Toast.makeText(getBaseContext(), "Acelerado", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void desacelerar(View v){
        try {
            motor.desacelerar();
            atualizarTela();
            Toast.makeText(getBaseContext(), "Desacelerado", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

}
