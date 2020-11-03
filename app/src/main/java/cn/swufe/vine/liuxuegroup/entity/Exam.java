package cn.swufe.vine.liuxuegroup.entity;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Exam {

    @PrimaryKey
    public int id;

    @ColumnInfo(name = "exam_name")
    public String name;

    @ColumnInfo(name = "tip")
    public int tip;

    @ColumnInfo(name = "hot")
    public int hot;

    @ColumnInfo(name = "people")
    public int people;

}
