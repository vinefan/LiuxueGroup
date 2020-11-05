package cn.swufe.vine.liuxuegroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import cn.swufe.vine.liuxuegroup.adapter.SchoolTipAdapter;
import cn.swufe.vine.liuxuegroup.entity.SchoolTip;
import cn.swufe.vine.liuxuegroup.util.SchoolTipUtil;

public class SchoolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 跳转
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                view.getContext().startActivity(intent);
            }
        });
//
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.tips_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        SchoolTipUtil schoolTipUtil = new SchoolTipUtil();
        List<SchoolTip> schoolTips = schoolTipUtil.getSchoolTips();
        SchoolTipAdapter adapter = new SchoolTipAdapter(schoolTips, this, this);
        recyclerView.setAdapter(adapter);
    }
}