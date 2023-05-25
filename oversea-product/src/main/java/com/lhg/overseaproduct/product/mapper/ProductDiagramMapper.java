package com.lhg.overseaproduct.product.mapper;

import com.lhg.overseaproduct.product.domain.ProductDiagram;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDiagramMapper {

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
