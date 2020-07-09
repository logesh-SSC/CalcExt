package com.example.calcext;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Age extends Fragment {

    public void converToEuro(View view)
    {

        EditText editText = (EditText) view.findViewById(R.id.edtText);
        int dollars = Integer.parseInt(editText.getText().toString());
        int euro = 79;
        double result = dollars * euro ;
        String s=Double.toString(result);
        Toast.makeText(getActivity(),s, Toast.LENGTH_SHORT).show();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Button button;
        final View v1 = inflater.inflate(R.layout.fragment_age, container, false);
        super.onCreate(savedInstanceState);

        v1.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converToEuro(v1);
            }
        });




        return v1;
        //return inflater.inflate(R.layout.fragment_age,null);
    }
}
