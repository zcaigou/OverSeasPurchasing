package com.lhg.web.controller.sys;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lhg.overseacommon.core.domain.AjaxResult;
import com.lhg.overseacommon.core.page.PageDomain;
import com.lhg.overseacommon.core.page.TableDataInfo;
import com.lhg.overseacommon.core.page.TableSupport;
import com.lhg.overseacommon.utils.SqlUtil;
import com.lhg.overseacommon.utils.StringUtils;

import java.util.List;

/**
 * web层通用数据处理Controller
 *
 * @author lhg
 *
 */
public class BaseController {

    /**
     * 封装ajax响应结果
     *
     * @param rows 影响行数
     * @return ajax响应结果
     */
    protected AjaxResult toAjax(int rows) {
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    /**
     * 封装ajax响应结果
     *
     * @param result 执行结果
     * @return ajax响应结果
     */
    protected AjaxResult toAjax(boolean result) {
        return result ? AjaxResult.success() : AjaxResult.error();
    }

    /**
     * 设置请求分页数据
     */
    protected void startPage() {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        if (StringUtils.isNotNull(pageNum) && StringUtils.isNotNull(pageSize)) {
            String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
            PageHelper.startPage(pageNum, pageSize, orderBy);
        }
    }

    /**
     * 响应请求分页数据
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected TableDataInfo getDataTable(List<?> list) {
        TableDataInfo rspData = new TableDataInfo();
        rspData.setCode(0);
        rspData.setRows(list);
        rspData.setTotal(new PageInfo(list).getTotal());
        return rspData;
    }

//    /**
//     * 获取当前登录用户
//     */
//    public User getSysUser() {
//        return ShiroUtils.getSysUser();
//    }
//
//    /**
//     * 获取当前登录用户id
//     */
//    public Long getUserId() {
//        return getSysUser().getUserId();
//    }
//
//    /**
//     * 获取当前登录用户名
//     * @return
//     */
//    public String getLoginName() {
//        return getSysUser().getLoginName();
//    }
//
//    /**
//     * 更新当前登录用户信息
//     */
//    public void setSysUser(User user) {
//        ShiroUtils.setSysUser(user);
//    }
}
