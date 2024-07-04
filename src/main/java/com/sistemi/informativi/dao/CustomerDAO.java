package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.CustomerDTO;
import com.sistemi.informativi.vo.CustomerVO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {

    public int addCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerVO> getCustomersNameByProduct(int productId) throws SQLException, ClassNotFoundException;
}
