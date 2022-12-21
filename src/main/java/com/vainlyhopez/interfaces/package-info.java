/**
 * <p>user interface layer</p>
 *
 * 相当于springmvc中web层（controller/websocket/restapi）：处理用户显示和用户请求
 * <p>
 *  - 可充当边缘服务<br/>
 *  - 对用户的输入进行验证<br/>
 *  - 不应该包含领域或业务逻辑<br/>
 *  - 转换输入输出参数<br/>
 *  - 直接调用应用层方法或调用facade方法<br/>
 *  </p>
 */
package com.vainlyhopez.interfaces;