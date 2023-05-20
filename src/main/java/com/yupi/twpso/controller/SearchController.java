package com.yupi.twpso.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.twpso.common.BaseResponse;
import com.yupi.twpso.common.ErrorCode;
import com.yupi.twpso.common.ResultUtils;
import com.yupi.twpso.exception.ThrowUtils;
import com.yupi.twpso.manager.SearchFacade;
import com.yupi.twpso.model.dto.post.PostQueryRequest;
import com.yupi.twpso.model.dto.user.UserQueryRequest;
import com.yupi.twpso.model.entity.Picture;
import com.yupi.twpso.model.enums.SearchTypeEnum;
import com.yupi.twpso.model.vo.PostVO;
import com.yupi.twpso.model.vo.SearchVO;
import com.yupi.twpso.model.vo.UserVO;
import com.yupi.twpso.service.PictureService;
import com.yupi.twpso.service.PostService;
import com.yupi.twpso.service.UserService;
import lombok.extern.slf4j.Slf4j;
import com.yupi.twpso.model.dto.search.Searchquest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 图片接口
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

    @Resource
    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody Searchquest searchquest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchquest, request));
    }
}


