package com.lhg.overseacommon.core.page;


import com.lhg.overseacommon.core.text.Convert;
import com.lhg.overseacommon.domain.BaseEntity;
import com.lhg.overseacommon.utils.ServletUtils;

/**
 * 表格数据处理
 * 
 * @author lhg
 */
public class TableSupport
{
    /**
     * 当前记录起始索引
     */
    public static final String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    public static final String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static final String IS_ASC = "isAsc";

    /**
     * 分页参数合理化
     */
    public static final String REASONABLE = "reasonable";

    /**
     * 封装分页对象
     */
    public static PageDomain getPageDomain()
    {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(ORDER_BY_COLUMN));
        pageDomain.setIsAsc(ServletUtils.getParameter(IS_ASC));
        return pageDomain;
    }

    /**
     * 封装分页对象:application/json格式参数
     */
    public static PageDomain getPageDomainFromJsonParams(BaseEntity baseEntity) {
        PageDomain pageDomain = new PageDomain();
        pageDomain.setPageNum((Integer) baseEntity.getParams().get(PAGE_NUM));
        pageDomain.setPageSize((Integer) baseEntity.getParams().get(PAGE_SIZE));
        pageDomain.setOrderByColumn((String)baseEntity.getParams().get(ORDER_BY_COLUMN));
        pageDomain.setIsAsc((String)baseEntity.getParams().get(IS_ASC));
        return pageDomain;
    }

    public static PageDomain buildPageRequest() {
        return getPageDomain();
    }

    public static PageDomain buildPageRequest(BaseEntity baseEntity) {
        return getPageDomainFromJsonParams(baseEntity);
    }

}
