package host.guojing.web.service;

import host.guojing.web.dao.IBlogListDao;
import host.guojing.web.entity.BlogTitle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/1/15.
 */

@Service
public class BlogListService {

    @Resource
    IBlogListDao blogListDao;

    public List<BlogTitle> getBlogList(String table_name) {
        return blogListDao.getBlogList(table_name);
    }
}
