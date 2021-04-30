package com.ovi.myshiro.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author yxfstart
 * @create 2021-04-20 14:55
 */
@Data
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = -6056125703075132981L;

    private Integer id;

    private String account;

    private String password;

    private String username;
}
