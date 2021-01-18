package com.radiance.algorithm.test;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author sunhao
 * @date 2021/1/11 13:32
 * @Description:
 */
@Service
public class TestService {

    @Transactional
    public String testTransactional() {
        String a = "a";
        Integer b = new Integer(1);
        String c = new String("c");
        // 手动触发回滚事务
//        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        String aa = "aa";
        return a;

    }

    public static void main(String[] args) throws Exception {
        System.out.println("exection start");
        throw new Exception();
//        System.out.println("exection end");
    }

}
