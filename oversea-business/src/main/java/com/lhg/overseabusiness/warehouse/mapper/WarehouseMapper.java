package com.lhg.overseabusiness.warehouse.mapper;

import com.lhg.overseabusiness.warehouse.domain.Warehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehouseMapper {
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
