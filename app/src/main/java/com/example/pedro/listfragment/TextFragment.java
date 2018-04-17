package com.example.pedro.listfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by pedro on 17/04/2018.
 */

public class TextFragment extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);
        textView = view.findViewById(R.id.txt_msg);
        return view;
    }

    public void setText(String text){
        textView.setText(text);
    }


}
