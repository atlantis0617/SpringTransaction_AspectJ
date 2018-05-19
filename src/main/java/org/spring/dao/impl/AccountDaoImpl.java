package org.spring.dao.impl;

import org.spring.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**   
 * @ClassName:  AccountDaoImpl   
 * @Description:转账操作DAO层实现类 
 * @author: 华洋科技 
 * @date:   2018年5月19日 下午2:03:09   
 *     
 * @Copyright: 2018 www.yhy.com Inc. All rights reserved. 
 * 
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	/**   
	 * <p>Title: outMoney</p>   
	 * <p>Description: </p>   
	 * @param out
	 * @param money   
	 * @see org.spring.dao.AccountDao#outMoney(java.lang.String, double)   
	 */
	@Override
	public void outMoney(String out, double money) {
		String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
	}

	/**   
	 * <p>Title: inMoney</p>   
	 * <p>Description: </p>   
	 * @param in
	 * @param money   
	 * @see org.spring.dao.AccountDao#inMoney(java.lang.String, double)   
	 */
	@Override
	public void inMoney(String in, double money) {
		 String sql = "update account set money = money + ? where name = ?";
		 this.getJdbcTemplate().update(sql, money, in);
	}

}
