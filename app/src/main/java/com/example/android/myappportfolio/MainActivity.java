package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mPopularMoviesButton;
    private Button mStockHawkButton;
    private Button mBuildItBiggerButton;
    private Button mMakeYourAppMaterialButton;
    private Button mGoUbiquitousButton;
    private Button mCapStoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPopularMoviesButton=(Button) findViewById(R.id.popular_movies_button);
        mPopularMoviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastOnClick(view);
            }
        });

        mStockHawkButton=(Button) findViewById(R.id.stock_hawk_button);
        mStockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastOnClick(view);
            }
        });

        mBuildItBiggerButton=(Button) findViewById(R.id.build_it_bigger_button);
        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastOnClick(view);
            }
        });

        mMakeYourAppMaterialButton=(Button) findViewById(R.id.make_your_app_material_button);
        mMakeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastOnClick(view);
            }
        });

        mGoUbiquitousButton=(Button) findViewById(R.id.go_ubiquitous_button);
        mGoUbiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastOnClick(view);
            }
        });

        mCapStoneButton=(Button) findViewById(R.id.capstone_button);
        mCapStoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToastOnClick(view);
            }
        });

    }

    private String generateButtonToastMessage(Button button){
        String buttonText=button.getText().toString().toLowerCase();
        return "This button will launch my '" + buttonText + "' app!";

    }
    private void showToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    private void showToastOnClick(View view){
        showToast(generateButtonToastMessage((Button) view));
    }
}
