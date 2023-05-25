package com.lhg.overseabusiness.warehouse.service;

import com.lhg.overseabusiness.warehouse.domain.Warehouse;

import java.util.List;

public interface IWarehouseService {
    /**
     * 条件查询仓库信息
     */
    public List<Warehouse> selectWarehouseList(Warehouse warehouse);

    /**
     * 根据warehouseId查询仓库信息
     */
    public Warehouse selectWarehouseByWarehouseId(String warehouseId);

    /**
     * 新增仓库信息
     */
    public int insertWarehouse(Warehouse warehouse);

    /**
     * 更改仓库信息
     */
    public int updateWarehouse(Warehouse warehouse);

    /**
     * 根据warehouseId删除仓库信息
     */
    public int deleteWarehouseByWarehouseId(String warehouseId);
}
