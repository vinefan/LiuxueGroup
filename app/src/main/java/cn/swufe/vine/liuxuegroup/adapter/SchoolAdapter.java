package cn.swufe.vine.liuxuegroup.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cn.swufe.vine.liuxuegroup.ExamActivity;
import cn.swufe.vine.liuxuegroup.MainActivity;
import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.SchoolActivity;
import cn.swufe.vine.liuxuegroup.entity.School;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.SchoolViewHolder> {

    private List<School> schoolList;
    private AdapterView.OnItemClickListener   onItemClickListener;
    private Context context;
    private Activity activity;



// 构造器
    public SchoolAdapter(List<School> schoolList, Context context, Activity activity) {
        this.schoolList = schoolList;
        this.context = context;
        this.activity = activity;
    }

// holder
    public static class SchoolViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView schoolAbbr;

        public SchoolViewHolder(View view){
            super(view);
            logoImage = view.findViewById(R.id.school_logo);
            schoolAbbr = view.findViewById(R.id.school_abbr);
        }
    }



//// 监听接口
//    public interface MyItemClickListener{
//        void onItemClick(View view, int position);
//    }
//
//    public void setOnItemClickListener(MyItemClickListener onItemClickLitsener){
//        this.onItemClickListener = onItemClickListener;
//    }


    @NonNull
    @Override
    public SchoolViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        获取视图
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.school_item,parent,false);
        SchoolViewHolder holder = new SchoolViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(final SchoolViewHolder holder, int position) {
        final School school = schoolList.get(position);
        holder.logoImage.setImageResource(school.getLogoImgID());
        holder.schoolAbbr.setText(school.getSchoolAbbr());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "我被点击了", Toast.LENGTH_SHORT).show();

                // 跳转
                Intent intent = new Intent(activity, ExamActivity.class);
                // 添加携带数据
                intent.putExtra("SCHOOL_ABBR", school.getSchoolAbbr());
                String str_logo_id = String.valueOf(school.getLogoImgID());
                intent.putExtra("SCHOOL_IMG", str_logo_id);
                activity.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return this.schoolList.size();
    }

}
