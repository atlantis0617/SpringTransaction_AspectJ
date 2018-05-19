package org.spring.service;

/**   
 * @ClassName:  AccountService   
 * @Description:转账操作业务层接口  
 * @author: 华洋科技 
 * @date:   2018年5月19日 下午2:04:43   
 *     
 * @Copyright: 2018 www.yhy.com Inc. All rights reserved. 
 * 
 */
public interface AccountService {
	/**
     * 转账
     *
     * @param out
     *              转出账户
     * @param in
     *              转入账户
     * @param money
     *              转账金额
     */
    void transfer(String out, String in, double money);
}
