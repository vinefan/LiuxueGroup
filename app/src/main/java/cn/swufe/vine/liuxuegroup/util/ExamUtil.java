package cn.swufe.vine.liuxuegroup.util;

import java.util.ArrayList;
import java.util.List;

import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.entity.ShowedExam;

public class ExamUtil {
    public static List<ShowedExam> getExamList(){
        List<ShowedExam> examList = new ArrayList<ShowedExam>();
        ShowedExam ielts = new ShowedExam(1,
                "IELTS",
                "雅思考试，全称为国际英语测试系统（International English Language Testing System）\\" +
                        "简称雅思（IELTS），是著名的国际性英语标准化水平测试之一。",
                R.mipmap.ielts_img);
        examList.add(ielts);

        ShowedExam toefl = new ShowedExam(2,
                "TOEFL",
                "托福®考试是由美国教育考试服务中心（ETS）测评研发的一个学术英语语言测试,\\" +
                        "可用于本科及研究生阶段的院校申请",
                R.mipmap.toefl_img);
        examList.add(toefl);

        ShowedExam gmat = new ShowedExam(3,
                "GMAT",
                "GMAT是Graduate Management Admission Test的缩写，中文名称为经企管理研究生入学考试",
                R.mipmap.gmat_img);
        examList.add(gmat);

        ShowedExam gre = new ShowedExam(4,
                "GRE",
                "GRE，全称Graduate Record Examination，中文名称为美国研究生入学考试，\\" +
                        "适用于申请世界范围内的理工科、人文社科、商科、法学等多个专业的硕士、博士以及MBA等教育项目",
                R.mipmap.gre_img);
        examList.add(gre);

        return examList;
    }
}
