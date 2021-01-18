package com.radiance.gupao.p6.elastic.job.standalone;

import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.reg.base.CoordinatorRegistryCenter;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;

/**
 * @author sunhao
 * @date 2020/12/23 14:37
 * @Description:
 */
public class SimpleJobTest {
    public static void main(String[] args) {
        // ZK 注册中心
        CoordinatorRegistryCenter regCenter = new ZookeeperRegistryCenter(new
                ZookeeperConfiguration("localhost:2181", "elastic-job-demo"));
        regCenter.init();
        // 定义作业核心配置
        JobCoreConfiguration simpleCoreConfig = JobCoreConfiguration.newBuilder("MyElasticJob", "0/2 * * * * ?", 1).build();
        // 定义 SIMPLE 类型配置
        SimpleJobConfiguration simpleJobConfig = new SimpleJobConfiguration(simpleCoreConfig, MyElasticJob.class.getCanonicalName());
        // 定义 Lite 作业根配置
        LiteJobConfiguration simpleJobRootConfig = LiteJobConfiguration.newBuilder(simpleJobConfig).build();
        // 构建 Job
        new JobScheduler(regCenter, simpleJobRootConfig).init();
    }



}
