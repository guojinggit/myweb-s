package host.guojing.web.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Administrator on 2017/1/23.
 */
@Repository
public interface IBlogDao {
    String getBlog(Map<String, Object> map);
}
