package com.lkq.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author liukaiqiang
 * @Date 2019/12/26 3:18
 * @Version 1.0
 */

@Data                       //创建getter,setter,equal,tostring,hashcode等方法
@NoArgsConstructor          //无参构造
@Accessors(chain = true)    //链式调用，每次setter方法返回为对象的引用，可链式设置
//对于实现了序列化的类自动设置uuid;
public class Supplier implements Serializable {

    private Integer sid;
    //供应商编码
    private String supplierCode;
    //供应商名称
    private String supplierName;
    //联系人
    private String contact;
    //联系电话
    private String phone;
    //联系地址
    private String address;
    //传真
    private String fax;
    //描述
    private String description;
    // 创建时间
    private Date createDate;
    //属于哪个数据库
    private Integer dbSource;

}
