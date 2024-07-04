package com.sistemi.informativi.dao;

import com.sistemi.informativi.dto.CustomerDTO;
import com.sistemi.informativi.dto.CustomerProductDTO;
import com.sistemi.informativi.dto.ProductDTO;
import com.sistemi.informativi.vo.CustomerVO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FacadeDAO {

    public Connection getConnection() throws ClassNotFoundException, SQLException;

    public int addCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerVO> getCustomersNameByProduct(int productId) throws SQLException, ClassNotFoundException;

    public int addProduct(ProductDTO productDTO) throws SQLException, ClassNotFoundException;

    public void addCustomerProduct(CustomerProductDTO customerProductDTO) throws SQLException, ClassNotFoundException;

    public void closeConnection() throws ClassNotFoundException, SQLException;
}
