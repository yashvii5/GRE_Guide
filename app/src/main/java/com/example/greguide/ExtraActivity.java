package com.example.greguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ExtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
    }

    public void e1(View view) {
        Intent e1_1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=list+of+gre+mock+test+papers&oq=List+of+gre+mock+test+&aqs=chrome.6.69i57j33l7.10043j0j7&sourceid=chrome&ie=UTF-8"));
        startActivity(e1_1);
    }

    public void e2(View view) {
        Intent e2_2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://magoosh.com/gre/2013/gre-verbal-reasoning-five-tips-for-doing-well/"));
        startActivity(e2_2);
    }

    public void e3(View view) {
        Intent e3_3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://crunchprep.com/gre/essential-gre-math-tips"));
        startActivity(e3_3);
    }

    public void e4(View view) {
        Intent e4_4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.expertsglobal.com/blog/preparing-for-gre-dos-and-donts/#:~:text=Quantitative%20Section-,Stick%20to%20the%20study%20plan%20provided%20by%20the%20online%20GRE,you%20are%20unable%20to%20solve."));
        startActivity(e4_4);
    }
}
