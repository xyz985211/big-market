package com.kou.domain.strategy.service;

/**
 * @author KouJY
 * Date: 2024/6/15 21:46
 * Package: com.kou.domain.strategy.service
 *
 * 策略装配库(兵工厂)，负责初始化策略计算
 */
public interface IStrategyArmory {

    /**
     * 装配抽奖策略配置「触发的时机可以为活动审核通过后进行调用」
     *
     * @param strategyId 策略ID
     * @return 装配结果
     */
    boolean assembleLotteryStrategy(Long strategyId);

}
