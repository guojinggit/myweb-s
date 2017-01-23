package host.guojing.web.entity;

/**
 * Created by Administrator on 2017/1/21.
 */
public class BlogTitle {
    private int id;
    private String inserttime;
    private String blogdate;
    private String title;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    private String extend;

    public String getBlogdate() {
        return blogdate;
    }

    public void setBlogdate(String date) {
        this.blogdate = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
