package cn.swufe.vine.liuxuegroup.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.entity.ShowedExam;

public class ExamAdaptor extends BaseAdapter {

    private List<ShowedExam> examList;
    private LayoutInflater layoutInflater;
    private Context context;

    public ExamAdaptor(List<ShowedExam> examList, Context context) {
        this.examList = examList;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return examList.size();
    }

    @Override
    public Object getItem(int position) {
        return examList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;

        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.exam_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.imageview);
            viewHolder.titleTV = convertView.findViewById(R.id.title_tv);
            viewHolder.contentTV = convertView.findViewById(R.id.content_tv);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ShowedExam exam = examList.get(position);
        viewHolder.imageView.setImageResource(exam.getImageResourceID());
        viewHolder.titleTV.setText(exam.getName());
        viewHolder.contentTV.setText(exam.getInfo());

        return convertView;
    }


    private static class ViewHolder{
        ImageView imageView;
        TextView titleTV;
        TextView contentTV;
    }
}
