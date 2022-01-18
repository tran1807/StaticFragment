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

public class FragmentA extends Fragment {

    TextView txtFragA;
    EditText edtFragA;
    Button btnFragA;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_a,container,false);

       txtFragA = (TextView) view.findViewById(R.id.textViewFragA);
       edtFragA = (EditText) view.findViewById(R.id.editTextFragA);
       btnFragA = (Button) view.findViewById(R.id.buttonFragA);

       Bundle bundle= getArguments();
       if(bundle!=null){
           txtFragA.setText(bundle.getString("Hoten"));
       }

       btnFragA.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
//               Toast.makeText(getActivity(),edtFragA.getText().toString(),Toast.LENGTH_SHORT).show();
           TextView txtMain = (TextView) getActivity().findViewById(R.id.textViewMain);
           txtMain.setText(edtFragA.getText().toString());
           }
       });
        return view;
    }

    public void ganNoiDung(String noiDung){
        txtFragA.setText(noiDung);
    }
}
