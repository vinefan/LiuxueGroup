package cn.swufe.vine.liuxuegroup.util;

import java.util.ArrayList;
import java.util.List;

import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.entity.School;
import cn.swufe.vine.liuxuegroup.entity.SchoolTip;

public class SchoolTipUtil {
    public static List<SchoolTip> getSchoolTips(){
        List<SchoolTip> schoolTips = new ArrayList<SchoolTip>();
        SchoolTip schoolTip = new SchoolTip(
                1,
                "在ICL就读是一种怎样的体验",
                12,
                112,
                false,
                false
                );

        schoolTips.add(schoolTip);

        schoolTip = new SchoolTip(
                2,
                "把ICL的offer拒掉是一种怎样的体验",
                8,
                56,
                true,
                false
        );

        schoolTips.add(schoolTip);
        return schoolTips;
    }
}
