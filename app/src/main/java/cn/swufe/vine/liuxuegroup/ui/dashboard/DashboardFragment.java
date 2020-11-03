package cn.swufe.vine.liuxuegroup.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import cn.swufe.vine.liuxuegroup.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = ViewModelProviders.of(this).get(DashboardViewModel.class);

//        将fragment填充进activity
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

//        取出文本框视图
//        final TextView textView = root.findViewById(R.id.text_dashboard);

//        执行dashboardViewModel的getText方法，
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
//
//                textView.setText(s);
            }
        });

        return root;
    }
}