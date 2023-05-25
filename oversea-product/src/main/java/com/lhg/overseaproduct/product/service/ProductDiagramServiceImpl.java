package com.lhg.overseaproduct.product.service;

import com.lhg.overseaproduct.product.domain.ProductDiagram;
import com.lhg.overseaproduct.product.mapper.ProductDiagramMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductDiagramServiceImpl implements IProductDiagramService{

    @Autowired
    private ProductDiagramMapper productDiagramMapper;


    /**
     * 条件查询商品图信息
     */
    @Override
    public List<ProductDiagram> selectDiagramList(ProductDiagram productDigram){
        return productDiagramMapper.selectDiagramList(productDigram);
    }

    /**
     * 根据diagramId查询商品图信息
     */
    @Override
    public ProductDiagram selectDiagramByDiagramId(String diagramId){
        return productDiagramMapper.selectDiagramByDiagramId(diagramId);
    }

    /**
     * 新增商品图信息
     */
    @Override
    public int insertDiagram(ProductDiagram productDigram){
        productDigram.setDiagramId(UUID.randomUUID().toString());
        return productDiagramMapper.insertDiagram(productDigram);
    }

    /**
     * 更改商品图信息
     */
    @Override
    public int updateDiagram(ProductDiagram productDigram){
        return productDiagramMapper.updateDiagram(productDigram);
    }

    /**
     *  根据diagramId删除商品图信息
     */
    @Override
    public int deleteDiagramByDiagramId(String diagramId){
        return productDiagramMapper.deleteDiagramByDiagramId(diagramId);
    }

    /**
     * 根据productId删除商品图信息
     */
    @Override
    public int deleteDiagramByProductId(String productId){
        return productDiagramMapper.deleteDiagramByProductId(productId);
    }
}
