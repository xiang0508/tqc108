package com.tqc.gdd01;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class GDD01 extends Activity
{
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    final EditText password =(EditText)findViewById(R.id.mPassword);
    CheckBox c = (CheckBox)findViewById(R.id.mCheck);

    c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
          password.setInputType(InputType.TYPE_CLASS_TEXT);
        }
        else{
          password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
      }
    });



  }
}
