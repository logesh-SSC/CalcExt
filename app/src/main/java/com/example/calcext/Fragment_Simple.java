package com.example.calcext;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Fragment_Simple extends Fragment {



    DatabaseHelper myDB;

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, buttonhistory,buttondb;
    EditText crunchifyEditText;

    Double mValueOne, mValueTwo, res;

    FirebaseDatabase database;

/*
    DatabaseReference ref;
    String root;
*/


    List<String> history1= new ArrayList<>();
    List<String> history2= new ArrayList<>();
    List<String> history3= new ArrayList<>();

    public void showMessage(String title,String Message)
    {



        AlertDialog.Builder builder=new AlertDialog.Builder(this.getContext());
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }



    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;


//    public  void AddData()
//    {
//                        boolean isInserted = myDB.insertData(mValueOne.toString(),mValueTwo.toString(),res.toString());
//                        if(isInserted == true)
//                        {
//                            Toast.makeText(this,"Data Inserted",Toast.LENGTH_LONG).show();
//                           // Toast.makeText(Fragment_Simple.this,"Data Inserted",Toast.LENGTH_LONG).show();
//                        }
//                        else
//                            Toast.makeText(Fragment_Simple.this,"Data not Inserted",Toast.LENGTH_LONG).show();
//                    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_simple, container, false);
        super.onCreate(savedInstanceState);



        myDB = new DatabaseHelper(getActivity());



        //setContentView(R.layout.fragment_simple);

        button0 = (Button) v.findViewById(R.id.button0);
        button1 = (Button) v.findViewById(R.id.button1);
        button2 = (Button) v.findViewById(R.id.button2);
        button3 = (Button) v.findViewById(R.id.button3);
        button4 = (Button) v.findViewById(R.id.button4);
        button5 = (Button) v.findViewById(R.id.button5);
        button6 = (Button) v.findViewById(R.id.button6);
        button7 = (Button) v.findViewById(R.id.button7);
        button8 = (Button) v.findViewById(R.id.button8);
        button9 = (Button) v.findViewById(R.id.button9);
        button10 = (Button) v.findViewById(R.id.button10);
        buttonAdd = (Button) v.findViewById(R.id.buttonadd);
        buttonSub = (Button) v.findViewById(R.id.buttonsub);
        buttonMul = (Button) v.findViewById(R.id.buttonmul);
        buttonDivision = (Button) v.findViewById(R.id.buttondiv);
        buttonC = (Button) v.findViewById(R.id.buttonC);
        buttonEqual = (Button) v.findViewById(R.id.buttoneql);
        buttondb=(Button) v.findViewById(R.id.buttondb);

        buttonhistory = (Button) v.findViewById(R.id.buttonhis);

        crunchifyEditText = (EditText) v.findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    mValueOne = Double.parseDouble(crunchifyEditText.getText() + "");
                    history1.add(String.valueOf(mValueOne));
                    crunchifyAddition = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(crunchifyEditText.getText() + "");
                history1.add(String.valueOf(mValueOne));
                mSubtract = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(crunchifyEditText.getText() + "");
                history1.add(String.valueOf(mValueOne));
                crunchifyMultiplication = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.parseDouble(crunchifyEditText.getText() + "");
                history1.add(String.valueOf(mValueOne));
                crunchifyDivision = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Double.parseDouble(crunchifyEditText.getText() + "");
                history2.add(String.valueOf(mValueTwo));
                if (crunchifyAddition == true) {

                    res = mValueOne + mValueTwo;
                    history3.add(String.valueOf(res));
                    crunchifyEditText.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {

                    res = mValueOne - mValueTwo;
                    history3.add(String.valueOf(res));
                    crunchifyEditText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {

                    res = mValueOne * mValueTwo;
                    history3.add(String.valueOf(res));
                    crunchifyEditText.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {

                    res = mValueOne / mValueTwo;
                    history3.add(String.valueOf(res));
                    crunchifyEditText.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
            }
        });
        /*buttonhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //crunchifyEditText.setText(crunchifyEditText.getText() + "");
               /* root="USER/";
                database=FirebaseDatabase.getInstance();
                ref=database.getReference(root+"val1");
                ref=database.getReference(root+"val2");
                ref=database.getReference(root+"res");
                ref.setValue(history1.toString());
                ref.setValue(history2.toString());
                ref.setValue(history3.toString());
*/
              /* DatabaseReference rootRef =FirebaseDatabase.getInstance().getReference();
                for(String history : history1)
                {
                    rootRef.child("history1").child(history).setValue(true);
                }
/*
                for(String history : history2)
                {
                    rootRef.child("history2").child(history).setValue(true);
                }
                for(String history : history3)
                {
                    rootRef.child("history3").child(history).setValue(true);
                }
*/
               /* crunchifyEditText.setText("First number"+history1.toString()+"\nSecond number"+history2+"\nResult"+history3);
            }
        });*/

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + ".");
            }
        });

        buttonhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                crunchifyEditText.setText("First number"+history1.toString()+"\nSecond number"+history2.toString()+"\nResult"+history3.toString());

                //boolean isInserted = myDB.insertData(mValueOne.toString(), mValueTwo.toString(), res.toString());

                /*Cursor res = myDb.getAllData();
                if(res.getCount() == 0) {
                    // show message
                    showMessage("Error","Nothing found");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) {
                    buffer.append("Id :"+ res.getString(0)+"\n");
                    buffer.append("Name :"+ res.getString(1)+"\n");
                    buffer.append("Surname :"+ res.getString(2)+"\n");
                    buffer.append("Marks :"+ res.getString(3)+"\n\n");
                }

                // Show all data
                showMessage("Data",buffer.toString());
*/

                buttondb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       boolean isinsert=myDB.insertData(history1.toString(),history2.toString(),history3.toString());
//                       if(isinsert==true)
//                           Toast.makeText(Fragment_Simple.this,"INSERTED",Toast.LENGTH_LONG).show();
//                       else
//                           Toast.makeText(Fragment_Simple.this,"NOT INSERTED",Toast.LENGTH_LONG).show();

                        Cursor res=myDB.getAllData();
                        if(res.getCount()==0)
                        {
                            showMessage("ERROR","Nothing Found");
                            return;
                        }
                        StringBuffer buffer=new StringBuffer();
                        while(res.moveToNext())
                        {
                            buffer.append("Id:"+res.getString(0)+"\n");
                            buffer.append("Value 1:"+res.getString(1)+"\n");
                            buffer.append("Value 2:"+res.getString(2)+"\n");
                            buffer.append("Result :"+res.getString(3)+"\n");
                        }
                        showMessage("Data",buffer.toString());
                    }
                });




            }
        });
        return v;
    }
}
