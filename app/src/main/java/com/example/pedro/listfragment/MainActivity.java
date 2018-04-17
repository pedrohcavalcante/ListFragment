package com.example.pedro.listfragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AlimentosFragments.OnItemClick{

    private TextFragment textFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textFragment = (TextFragment) getFragmentManager().findFragmentById(R.id.frag_list_preco);
    }

    @Override
    public void onClickAlimento(Alimento alimento) {
        textFragment.setText("O preço do " + alimento.getNome() + " é: R$" + alimento.getPreco());
    }
}
