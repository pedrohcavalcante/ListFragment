package com.example.pedro.listfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

/**
 * Created by pedro on 17/04/2018.
 */

public class AlimentosFragments extends ListFragment {

    private ArrayAdapter<Alimento> adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1);
        String[] nomes = getActivity().getResources().getStringArray(R.array.alimentos_nome);
        String[] precos = getActivity().getResources().getStringArray(R.array.alimentos_precos);
        for (int i = 0; i < nomes.length; i++){
            Alimento alimento = new Alimento(nomes[i], Double.parseDouble(precos[i]));
            adapter.add(alimento);
        }
        setListAdapter(adapter);
    }
}
