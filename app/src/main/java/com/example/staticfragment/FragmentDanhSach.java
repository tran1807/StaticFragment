package com.example.staticfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class FragmentDanhSach extends ListFragment {
    String[] arrayThanhPho = {"Hà Nội","TP Hồ Chí Minh","Đà Nẵng","Huế"};
    ArrayAdapter arrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1,arrayThanhPho);
         setListAdapter(arrayAdapter);
        return inflater.inflate(R.layout.fragment_danh_sach,container,false);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(),arrayThanhPho[position],Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }
}
