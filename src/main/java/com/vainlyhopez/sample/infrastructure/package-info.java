/**
 * <p>infrastructure layer</p>
 *
 * 使用依赖倒置原则，此层作为最底层，依赖于用户接口层，应用层，领域层，提供各层的接口并提供实现<br/>
 * 六边形架构实现中，此层提供适配器（输入/输出）<br/>
 * 贯穿所有层，提供通用的技术和基础服务<br/>
 *
 * <p>
 * - 端口/适配器
 * - 第三方工具<br/>
 * - MQ实现<br/>
 * - 拦截器<br/>
 * - 缓存<br/>
 * - 持久化<br/>
 * - 定时任务<br/>
 * - 消息监听
 * </p>
 */
package com.vainlyhopez.sample.infrastructure;