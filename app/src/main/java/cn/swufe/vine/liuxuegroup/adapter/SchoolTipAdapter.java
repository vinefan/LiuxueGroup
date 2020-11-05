package cn.swufe.vine.liuxuegroup.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.SchoolActivity;
import cn.swufe.vine.liuxuegroup.entity.SchoolTip;
import cn.swufe.vine.liuxuegroup.ui.login.LoginActivity;

public class SchoolTipAdapter extends RecyclerView.Adapter<SchoolTipAdapter.ViewHolder> {

    private List<SchoolTip> schoolTips ;
    private AdapterView.OnItemClickListener   onItemClickListener;
    private Context context;
    private Activity activity;

    public SchoolTipAdapter(List<SchoolTip> schoolTips, Context context, Activity activity) {
        this.schoolTips = schoolTips;
        this.context = context;
        this.activity = activity;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView remarkNum;
        TextView loveNum;
        TextView rankNum;

        public ViewHolder (View view)
        {
            super(view);
            title = (TextView) view.findViewById(R.id.tip_title);
            remarkNum = (TextView) view.findViewById(R.id.remark_num);
            loveNum = (TextView) view.findViewById(R.id.love_num);
            rankNum = (TextView) view.findViewById(R.id.rank_num);
        }

    }



    @NonNull
    @Override
    public SchoolTipAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tip_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolTipAdapter.ViewHolder holder, int position) {
        SchoolTip schoolTip = schoolTips.get(position);
        holder.title.setText(schoolTip.getTitle());
        holder.rankNum.setText(String.valueOf(schoolTip.getRank()));
        holder.loveNum.setText(String.valueOf(schoolTip.getLoveNum()));
        holder.remarkNum.setText(String.valueOf(schoolTip.getRemarkNum()));
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "我被点击了", Toast.LENGTH_SHORT).show();
//
//                // 跳转
//                Intent intent = new Intent(activity, LoginActivity.class);
//                activity.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return schoolTips.size();
    }
}
