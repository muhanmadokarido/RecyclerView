package com.mk_kadish.mk3;


import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {
    private Button bn_save;
    private EditText txt_id,txt_name;

    public AddUserFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_add_user, container, false);
        bn_save=view.findViewById(R.id.AddUser_bn_save);
        txt_id=view.findViewById(R.id.AddUser_txt_school_id);
        txt_name=view.findViewById(R.id.AddUser_txt_school_name);

        bn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String id=txt_id.getText().toString();
                String name=txt_name.getText().toString();
                SchoolDbHelper schoolDbHelper=new SchoolDbHelper(getActivity());
                SQLiteDatabase sqLiteDatabase=schoolDbHelper.getWritableDatabase();
                schoolDbHelper.addUser(Integer.parseInt(id),name,sqLiteDatabase);
                schoolDbHelper.close();
                txt_id.setText("");
                txt_name.setText("");
                Toast.makeText(getActivity(),"User saved successfully",Toast.LENGTH_SHORT);
            }
        });
        return view;
    }
}