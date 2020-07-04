package com.example.greguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class VerbalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal);
    }
    public void v1(View view){

        Intent v1_1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ets.org/gre/revised_general/prepare/verbal_reasoning/reading_comprehension/sample_questions"));
        startActivity(v1_1);
    }

    public void v2(View view) {
        Intent v2_2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.test-guide.com/gre/free-gre-practice-tests/gre-text-completion-practice-test-1.html"));
        startActivity(v2_2);
    }

    public void v3(View view) {
        Intent v3_3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.test-guide.com/gre/free-gre-practice-tests/gre-sentence-equivalence-practice-test-2.html"));
        startActivity(v3_3);
    }

    public void v4(View view) {
        Intent v4_4=new Intent(Intent.ACTION_VIEW, Uri.parse("https://ferdouswahid.weebly.com/uploads/4/6/2/2/46225547/manhattan_prep_1000_gre_words_.pdf"));
        startActivity(v4_4);
    }
}
