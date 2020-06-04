package com.swufe.searchnotice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    public EditText EtInput;
    public Button Search;
    public ListView ListView;
    List<String> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

       String data[]={"one","two"};

        EtInput = findViewById(R.id.key);
        Search = findViewById(R.id.search);
        ListView = findViewById(R.id.list_view);

        ListAdapter adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        setListAdapter(adapter);
        Search.setOnClickListener((View.OnClickListener) this);

    }
    public void onClick(View v) {
        if (checkValidInput1()) {
            if (checkValidInput2()){
                
            }
        }
    }

    private void showResult() {
    }

    private boolean checkValidInput1() {
        if(EtInput.getText().length()==0){
            String errorMsg = getResources().getString(R.string.msg_error1_input);
            Toast.makeText(this,errorMsg,Toast.LENGTH_LONG).show();
            return false;
        }else{
            return true;
        }
    }
    private boolean checkValidInput2() {
        String s =EtInput.getText().toString();
        if(s.equals("滚蛋")){
            String errorMsg = getResources().getString(R.string.msg_error2_input);
            Toast.makeText(this,errorMsg,Toast.LENGTH_LONG).show();
            return false;
        }else{
            return true;
        }
    }

}
