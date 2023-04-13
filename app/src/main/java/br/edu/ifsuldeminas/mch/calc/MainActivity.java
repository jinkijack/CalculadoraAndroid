package br.edu.ifsuldeminas.mch.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

import de.congrace.exp4j.Calculable;
import de.congrace.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ifsuldeminas.mch.calc";
    private Button buttonIgual, buttonMais, buttonMenos, buttonMultiplicacao, buttonDivisao;
    private Button buttonVirgula, buttonReset, buttonDelete;
    private Button buttonUm, buttonDois, buttonTres, buttonQuatro, buttonCinco, buttonSeis, buttonSete, buttonOito, buttonNove, buttonZero;
    private TextView textViewResultado;
    private TextView textViewUltimaExpressao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();
        Objects.requireNonNull(getSupportActionBar()).hide();

        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);
        //operações
        buttonMais.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonMenos.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonMultiplicacao.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonDivisao.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonDelete.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonVirgula.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ".";
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        //numeros
        buttonZero.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonUm.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonDois.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonTres.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonQuatro.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonCinco.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonSeis.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonSete.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonOito.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonNove.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = ((Button) view).getText().toString();
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });

        buttonReset.setOnClickListener(view -> {
            textViewUltimaExpressao.setText("");
            textViewResultado.setText("");
        });
        buttonDelete.setOnClickListener(view -> {
            // Obtém a expressão atual
            String string = textViewUltimaExpressao.getText().toString();
            // Verifica se a expressão não está vazia
            if (!string.isEmpty()) {
                // Remove o último caractere da expressão
                String txtExpressao = string.substring(0, string.length() - 1);
                textViewUltimaExpressao.setText(txtExpressao);
            }
            // Limpa o resultado
            textViewResultado.setText("");
        });
        buttonDivisao.setOnClickListener(view -> {
            // Obtém o número digitado
            String numero = "/";
            // Obtém a expressão atual
            String expressao = textViewUltimaExpressao.getText().toString();
            // Adiciona o número à expressão
            String novaExpressao = expressao + numero;
            textViewUltimaExpressao.setText(novaExpressao);
        });
        buttonIgual.setOnClickListener(view -> {
            Calculable avaliadorExpressao = null;
            try {
                avaliadorExpressao = new ExpressionBuilder(textViewUltimaExpressao.getText().toString()).build();
                Double resultado = avaliadorExpressao.calculate();
                textViewResultado.setText(String.valueOf(resultado));
                Long longResult = resultado.longValue();
                if (resultado == longResult.doubleValue()){
                    textViewResultado.setText(String.valueOf(longResult));
                }else{
                    textViewResultado.setText(String.valueOf(resultado));
                }
            } catch (Exception e) {
                Log.d(TAG, e.getMessage());
            }
        });

    }
    private void inicializarComponentes(){
        textViewResultado = findViewById(R.id.textViewResultadoID);
        textViewUltimaExpressao = findViewById(R.id.textViewUltimaExpressaoID);
        buttonDelete = findViewById(R.id.buttonDeleteID);
        buttonReset = findViewById(R.id.buttonResetID);
        buttonVirgula = findViewById(R.id.buttonVirgulaID);
        buttonDivisao = findViewById(R.id.buttonDivisaoID);
        buttonMultiplicacao = findViewById(R.id.buttonMultiplicacaoID);
        buttonMenos = findViewById(R.id.buttonSubtracaoID);
        buttonMais = findViewById(R.id.buttonSomaID);
        buttonIgual = findViewById(R.id.buttonIgualID);
        buttonZero = findViewById(R.id.buttonZeroID);
        buttonUm = findViewById(R.id.buttonUmID);
        buttonDois = findViewById(R.id.buttonDoisID);
        buttonTres = findViewById(R.id.buttonTresID);
        buttonQuatro = findViewById(R.id.buttonQuatroID);
        buttonCinco = findViewById(R.id.buttonCincoID);
        buttonSeis = findViewById(R.id.buttonSeisID);
        buttonSete = findViewById(R.id.buttonSeteID);
        buttonOito = findViewById(R.id.buttonOitoID);
        buttonNove = findViewById(R.id.buttonNoveID);

    }

}