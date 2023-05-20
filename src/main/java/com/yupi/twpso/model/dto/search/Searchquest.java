package com.yupi.twpso.model.dto.search;

import com.yupi.twpso.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Searchquest extends PageRequest implements Serializable {

    /**
     * 搜索词
     */
    private String searchText;
    private String type;
    private static final long serialVersionUID = 1L;
}
