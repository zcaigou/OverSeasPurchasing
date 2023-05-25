package com.lhg.overseaproduct.product.service;

import com.lhg.overseaproduct.product.domain.ProductDiagram;

import java.util.List;

public interface IProductDiagramService {

    /**
     * 条件查询商品图信息
     */
    public List<ProductDiagram> selectDiagramList(ProductDiagram productDigram);

    /**
     * 根据diagramId查询商品图信息
     */
    public ProductDiagram selectDiagramByDiagramId(String diagramId);

    /**
     * 新增商品图信息
     */
    public int insertDiagram(ProductDiagram productDigram);

    /**
     * 更改商品图信息
     */
    public int updateDiagram(ProductDiagram productDigram);

    /**
     *  根据diagramId删除商品图信息
     */
    public int deleteDiagramByDiagramId(String diagramId);

    /**
     * 根据productId删除商品图信息
     */
    public int deleteDiagramByProductId(String productId);
}
