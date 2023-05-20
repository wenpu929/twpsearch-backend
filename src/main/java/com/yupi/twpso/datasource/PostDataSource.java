package com.yupi.twpso.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.twpso.model.dto.post.PostQueryRequest;
import com.yupi.twpso.model.vo.PostVO;
import com.yupi.twpso.service.PostService;
import com.yupi.twpso.datasource.DataSource;
import com.yupi.twpso.model.dto.post.PostQueryRequest;
import com.yupi.twpso.model.vo.PostVO;
import com.yupi.twpso.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 帖子服务实现
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Service
@Slf4j
public class PostDataSource implements DataSource<PostVO> {

    @Resource
    private PostService postService;

    @Override
    public Page<PostVO> doSearch(String searchText, long pageNum, long pageSize) {
        PostQueryRequest postQueryRequest = new PostQueryRequest();
        postQueryRequest.setSearchText(searchText);
        postQueryRequest.setCurrent(pageNum);
        postQueryRequest.setPageSize(pageSize);
        ServletRequestAttributes servletRequestAttributes =  (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        Page<PostVO> postVOPage = postService.listPostVoByPage(postQueryRequest, request);
        return postVOPage;
    }
}
