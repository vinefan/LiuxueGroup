package cn.swufe.vine.liuxuegroup.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import cn.swufe.vine.liuxuegroup.entity.Exam;

@Dao
public interface ExamDao {

    @Query("SELECT * FROM exam")
    List<Exam> getall();

    @Insert
    void insert(Exam... Exams);

    @Query("DELETE FROM exam")
    void deleteAll();
}
