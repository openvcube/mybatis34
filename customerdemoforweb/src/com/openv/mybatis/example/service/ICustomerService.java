/**
 * Copyright(c) http://www.open-v.com
 */
package com.openv.mybatis.example.service;

import com.openv.mybatis.example.bean.Customer;
import com.openv.mybatis.example.paged.PageResult;

/**
 * <pre>
 * 程序的中文名称。
 * </pre>
 * @author http://www.open-v.com
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期:     修改内容: 
 * </pre>
 */
public interface ICustomerService {
	
	/**
	 * 分页查询客户。
	 * @param customer Customer
	 * @param pageIndex int
	 * @param pageSize int
	 * @return PageResult
	 */
	public PageResult<Customer> queryCustomer(Customer customer,int pageIndex,int pageSize);
	
}
