package com.example.staticfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class FragmentHopThoai extends DialogFragment {
    DeleteData deleteData;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        deleteData = (DeleteData) getActivity();
        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
        dialog.setTitle("Xác nhận");
        dialog.setMessage("Bạn có muốn xóa sản phẩm này hay không");
        dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                deleteData .GiaTrixoa(true);
            }
        });
        dialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                deleteData .GiaTrixoa(false);
            }
        });
        Dialog hopThoai = dialog.create();
        return hopThoai;
    }
}
