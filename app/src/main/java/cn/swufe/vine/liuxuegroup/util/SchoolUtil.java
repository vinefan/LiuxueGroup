package cn.swufe.vine.liuxuegroup.util;

import java.util.ArrayList;
import java.util.List;

import cn.swufe.vine.liuxuegroup.R;
import cn.swufe.vine.liuxuegroup.entity.School;

public class SchoolUtil {
    public static List<School> getSchools(){
        List<School> schools = new ArrayList<School>();
        School school = new School("ICL", R.drawable.icl);
        schools.add(school);
        school = new School("LSE", R.drawable.lse);
        schools.add(school);
        school = new School("MIT", R.drawable.mit);
        schools.add(school);
        school = new School("NTU", R.drawable.ntu);
        schools.add(school);
        school = new School("PENN", R.drawable.penn);
        schools.add(school);

        school = new School("NYU", R.drawable.nyu);
        schools.add(school);
        school = new School("HKU", R.drawable.hku);
        schools.add(school);

        school = new School("HKUST", R.drawable.hkust);
        schools.add(school);

        school = new School("CUHK", R.drawable.cuhk);
        schools.add(school);
        school = new School("NUS", R.drawable.nus);

        schools.add(school);


        return schools;
    }
}
