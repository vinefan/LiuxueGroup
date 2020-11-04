package cn.swufe.vine.liuxuegroup.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.entity.SchoolTip;

public class SchoolTipAdapter extends RecyclerView.Adapter<SchoolTipAdapter.ViewHolder> {

    private List<SchoolTip> schoolTips ;

    public SchoolTipAdapter(List<SchoolTip> schoolTips) {
        this.schoolTips = schoolTips;
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
        holder.rankNum.setText(schoolTip.getRank());
        holder.loveNum.setText(schoolTip.getLoveNum());
        holder.remarkNum.setText(schoolTip.getRemarkNum());
    }

    @Override
    public int getItemCount() {
        return schoolTips.size();
    }
}
