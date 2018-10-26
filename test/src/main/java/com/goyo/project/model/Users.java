package com.goyo.project.model;

import javax.persistence.*;

import com.goyo.project.core.Comment;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
/**
 * @author: JinYue
 * @ClassName: UserInfo
 * @Description: 用户类
 */
@Table(name = "USERS")
@Entity
public class Users implements Serializable {

    private static final long serialVersionUID = 8091782167628405410L;

    @Comment("主键")
    @Column(name = "ID")
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;


    @Column(name = "username",columnDefinition="varchar(100) COMMENT '字典名'")
    private String username;//帐号

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}