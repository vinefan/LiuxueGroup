package cn.swufe.vine.liuxuegroup.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.entity.School;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.SchoolViewHolder> {

    private List<School> schoolList;

    public SchoolAdapter(List<School> schoolList) {
        this.schoolList = schoolList;
    }


    public static class SchoolViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView schoolAbbr;

        public SchoolViewHolder(View view){
            super(view);
            logoImage = view.findViewById(R.id.school_logo);
            schoolAbbr = view.findViewById(R.id.school_abbr);
        }
    }

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
    public void onBindViewHolder(SchoolViewHolder holder, int position) {
        School school = schoolList.get(position);
        holder.logoImage.setImageResource(school.getLogoImgID());
        holder.schoolAbbr.setText(school.getSchoolAbbr());
    }


    @Override
    public int getItemCount() {
        return this.schoolList.size();
    }

}
