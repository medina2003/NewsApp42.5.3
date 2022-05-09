package room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import kg.geektech.newsapp42.models.Article;

@Dao
public interface ArticleDao {
    @Query("SELECT * FROM article ORDER BY data DESC")
    List<Article> getAll();

    @Insert
    void insert(Article article);

    @Query("SELECT * FROM article ORDER BY  text ASC")
    List<Article> sort();

    @Query("SELECT * FROM article WHERE text LIKE '%' || :search || '%'")
    List<Article> setupSearch(String search);

    @Delete
    void Delete ( Article  article) ;
}
