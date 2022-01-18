package com.example.staticfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class FragmentB extends Fragment {
    TextView txtFragB;
    EditText edtFragB;
    Button btnFragB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);

        txtFragB = (TextView) view.findViewById(R.id.textViewB);
        edtFragB = (EditText) view.findViewById(R.id.editTextFragB);
        btnFragB = (Button) view.findViewById(R.id.buttonFragB);

        btnFragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(),edtFragB.getText().toString(),Toast.LENGTH_SHORT).show();
            TextView txtFragA = (TextView) getActivity().findViewById(R.id.textViewFragA);
            txtFragA.setText(edtFragB.getText().toString());
            }
        });
        return view;
    }
}
