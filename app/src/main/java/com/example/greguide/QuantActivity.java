package com.example.greguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class QuantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quant);
    }

    public void q1(View view) {
        Intent q1_1= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.manhattanprep.com/gre/store/gre-strategy-guides/5-pound-book-gre-practice-problems/"));
        startActivity(q1_1);
    }

    public void q2(View view) {
        Intent q2_2= new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnxoYXNpYnNncmV8Z3g6NTYzMDQyNjA5N2JiZDJiYQ"));
        startActivity(q2_2);
    }

    public void q3(View view) {
        Intent q3_3= new Intent(Intent.ACTION_VIEW, Uri.parse("https://examplanet.com/ebooks/CRACKING%20THE%20GRE.pdf"));
        startActivity(q3_3);
    }

    public void q4(View view) {
        Intent q4_4= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ets.org/s/gre/accessible/quant/gre_chapter_7_practice_set_2_questions_18_point.pdf"));
        startActivity(q4_4);
    }
}
