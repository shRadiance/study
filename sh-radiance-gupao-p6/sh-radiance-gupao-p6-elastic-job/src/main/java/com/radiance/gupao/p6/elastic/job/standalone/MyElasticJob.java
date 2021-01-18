package com.radiance.gupao.p6.elastic.job.standalone;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunhao
 * @date 2020/12/23 14:28
 * @Description:
 */
public class MyElasticJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        System.out.println(String.format("Item: %s | Time: %s | Thread: %s "
                ,shardingContext.getShardingItem(), new SimpleDateFormat("HH:mm:ss").format(new Date())
                ,Thread.currentThread().getId()));
    }
}
