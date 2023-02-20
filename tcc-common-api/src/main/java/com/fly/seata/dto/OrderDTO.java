package com.fly.seata.dto;

import java.math.BigDecimal;

/**
 * @author: peijiepang
 * @date 2019-11-13
 * @Description:
 */
public class OrderDTO {

  /**
   * 主键id
   */
  private Long id;

  /**
   * 订单号
   */
  private String orderNo;

  /**
   * 用户id
   */
  private Long userId;

  /**
   * 商品id
   */
  private Long productId;

  /**
   * 商品数量
   */
  private Integer count;

  /**
   * 金额
   */
  private BigDecimal money;

  /**
   * 订单状态
   * 0:创建中
   * 1：已完成
   */
  private Integer status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BigDecimal getMoney() {
    return money;
  }

  public void setMoney(BigDecimal money) {
    this.money = money;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }
}
