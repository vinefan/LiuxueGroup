package cn.swufe.vine.liuxuegroup.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import java.util.List;

import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.adapter.ExamAdaptor;
import cn.swufe.vine.liuxuegroup.entity.ShowedExam;
import cn.swufe.vine.liuxuegroup.util.ExamUtil;

public class DashboardFragment extends Fragment{

    private DashboardViewModel dashboardViewModel;
    private ListView listView;
    private List<ShowedExam> examList;
    private ExamAdaptor adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);

//        将fragment填充进activity
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

//        取出文本框视图
//        final TextView textView = root.findViewById(R.id.text_dashboard);

//        执行dashboardViewModel的getText方法，
//        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//
//               textView.setText(s);
//            }
//        });

        listView = root.findViewById(R.id.listview);
        examList = ExamUtil.getExamList();
        adapter = new ExamAdaptor(examList, getActivity());
        listView.setAdapter(adapter);
        return root;
    }
//
//    public void ExamItemClick(View view){
//        // 获取itemView的位置
//        int position = mRecyclerView.getChildAdapterPosition(view);
//        Toast.makeText(MainActivity.this, "点击了 " + mDatas.get(position),
//                Toast.LENGTH_SHORT).show();
//    }
}