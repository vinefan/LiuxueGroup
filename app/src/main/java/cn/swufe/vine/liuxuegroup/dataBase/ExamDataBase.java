package cn.swufe.vine.liuxuegroup.dataBase;

import androidx.room.RoomDatabase;

import cn.swufe.vine.liuxuegroup.dao.ExamDao;

public abstract class ExamDataBase extends RoomDatabase {
    public abstract ExamDao examDao();
}
