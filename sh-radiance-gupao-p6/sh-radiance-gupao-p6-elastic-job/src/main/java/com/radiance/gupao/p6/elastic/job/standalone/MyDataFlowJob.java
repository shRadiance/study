package com.radiance.gupao.p6.elastic.job.standalone;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;

import java.util.Arrays;
import java.util.List;

/**
 * @author sunhao
 * @date 2020/12/23 14:31
 * @Description:
 */
public class MyDataFlowJob implements DataflowJob<String> {
    @Override
    public List<String> fetchData(ShardingContext shardingContext) {
        // 获取到了数据
        return Arrays.asList("aa", "bb", "cc");
    }

    @Override
    public void processData(ShardingContext shardingContext, List<String> list) {
        list.forEach(e -> System.out.println("开始处理数据：" + e));
    }
}
