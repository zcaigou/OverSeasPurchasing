package com.lhg.overseaproduct.product.domain;

import java.util.Arrays;

public class ProductDiagram {

    private String productId;

    private String diagramId;

    private String diagramType;

    private String type;

    private byte[] diagramInfo;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDiagramId() {
        return diagramId;
    }

    public void setDiagramId(String diagramId) {
        this.diagramId = diagramId;
    }

    public String getDiagramType() {
        return diagramType;
    }

    public void setDiagramType(String diagramType) {
        this.diagramType = diagramType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getDiagramInfo() {
        return diagramInfo;
    }

    public void setDiagramInfo(byte[] diagramInfo) {
        this.diagramInfo = diagramInfo;
    }

    @Override
    public String toString() {
        return "ProductDiagram{" +
                "productId='" + productId + '\'' +
                ", diagramId='" + diagramId + '\'' +
                ", diagramType='" + diagramType + '\'' +
                ", type='" + type + '\'' +
                ", diagramInfo=" + Arrays.toString(diagramInfo) +
                '}';
    }
}
