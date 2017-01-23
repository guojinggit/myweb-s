package host.guojing.web.service;

import host.guojing.web.dao.IBlogDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/23.
 */
@Service
public class BlogService {

    @Resource
    IBlogDao blogDao;

    public String getBlog(String table_name, int id){
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("table_name", table_name);
        params.put("id", id);
        return blogDao.getBlog(params);
    }
}
