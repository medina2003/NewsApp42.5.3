package room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import kg.geektech.newsapp42.models.Article;

@Database(entities = {Article.class},version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract  Article articleDao();
}
