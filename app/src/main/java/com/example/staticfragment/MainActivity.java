package com.example.staticfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DeleteData{
    TextView txtMain;
    Button btnMain,btnTruyen,btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMain = (TextView) findViewById(R.id.textViewMain);
        btnMain = (Button) findViewById(R.id.buttonMain);
        btnTruyen = (Button) findViewById(R.id.buttonTruyen);
        btnDialog = (Button) findViewById(R.id.buttonDialog);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentHopThoai fragmentHopThoai = new FragmentHopThoai();
                fragmentHopThoai.show(getFragmentManager(),"dialog");
            }
        });

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                FragmentA fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmentA);
//                Bundle bundle = new Bundle();
//                bundle.putString("Ho ten", "Nguyen Van An");
//                fragmentA.setArguments(bundle);
//                fragmentA.ganNoiDung("Activity sang fragment A");
//                fragmentA.txtFragA.setText("Activity sang fragment A");
            }
        });
        btnTruyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               FragmentA fragmentA = new FragmentA();

                Bundle bundle = new Bundle();
                bundle.putString("Ho ten", "Nguyen Van An");
                fragmentA.setArguments(bundle);

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.myLinearLayout,fragmentA);
                fragmentTransaction.commit();
            }
        });
    }

    @Override
    public void GiaTrixoa(boolean delete) {
        if (delete)
            Toast.makeText(this,"Bạn đã chọn Xóa",Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Bạn đã không chọn xóa",Toast.LENGTH_LONG).show();
    }
}