/**
 * Copyright 2017 Craig Andrews
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.spring.cache;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.cache.CacheAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Craig Andrews
 *
 * {@link EnableAutoConfiguration Auto-configuration} for {@link RedissonCacheStatisticsProvider}
 *
 */
@Configuration
@AutoConfigureAfter(CacheAutoConfiguration.class)
@ConditionalOnBean(CacheManager.class)
public class RedissonCacheStatisticsAutoConfiguration {
    @Bean
    public RedissonCacheStatisticsProvider redissonCacheStatisticsProvider(){
        return new RedissonCacheStatisticsProvider();
    }
}
