package com.example.zoran.discount_vjezbe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button mainButton;

    ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button)
    public  void mainButtonClick(View view)
    {
        Intent intent =new Intent(this,DetailsActivity.class);
        startActivity(intent);
    }
    View.OnClickListener imageButtonClicked= new View.OnClickListener(){
        @Override
        public void OnClick(View v){
            Toast.makeText(getApplicationContext(),"HelloAndroid!!", Toast.LENGTH_SHORT).show();
        }
    };
}
