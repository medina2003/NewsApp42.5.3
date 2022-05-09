package kg.geektech.newsapp42.models;

import androidx.room.Dao;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.List;

@Entity

 public class Article implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String text;
    private long data;

    public Article(String text, long data) {
        this.text = text;
        this.data = data;
    }

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public void insert(Article article) {

    }

    public List<Article> getAll() {
        return null;
    }
}
