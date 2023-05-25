package com.lhg.overseabusiness.warehouse.service;

import com.lhg.overseabusiness.warehouse.domain.Warehouse;
import com.lhg.overseabusiness.warehouse.mapper.WarehouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements IWarehouseService{

    @Autowired
    private WarehouseMapper warehouseMapper;

    /**
     * 条件查询仓库信息
     */
    @Override
    public List<Warehouse> selectWarehouseList(Warehouse warehouse){
        return warehouseMapper.selectWarehouseList(warehouse);
    }

    /**
     * 根据warehouseId查询仓库信息
     */
    @Override
    public Warehouse selectWarehouseByWarehouseId(String warehouseId){
        return warehouseMapper.selectWarehouseByWarehouseId(warehouseId);
    }

    /**
     * 新增仓库信息
     */
    @Override
    public int insertWarehouse(Warehouse warehouse){
        return  warehouseMapper.insertWarehouse(warehouse);
    }

    /**
     * 更改仓库信息
     */
    @Override
    public int updateWarehouse(Warehouse warehouse){
        return  warehouseMapper.updateWarehouse(warehouse);
    }

    /**
     * 根据warehouseId删除仓库信息
     */
    @Override
    public int deleteWarehouseByWarehouseId(String warehouseId){
        return warehouseMapper.deleteWarehouseByWarehouseId(warehouseId);
    }
}
