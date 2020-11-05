package cn.swufe.vine.liuxuegroup;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import cn.swufe.vine.liuxuegroup.MainActivity;

public class ExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // 跳转
//                Intent intent = new Intent(view.getContext(), MainActivity.class);
////                String str_back_frag_id = String.valueOf();
////                intent.putExtra("BACK_FRAG", str_back_frag_id);
//                view.getContext().startActivity(intent);
//            }
//        });
    }
}