package host.guojing.web.dao;

import host.guojing.web.entity.BlogTitle;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/1/21.
 */
@Repository
public interface IBlogListDao {

    List<BlogTitle> getBlogList();
}
