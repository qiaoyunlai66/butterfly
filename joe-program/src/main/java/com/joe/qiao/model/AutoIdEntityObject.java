package com.joe.qiao.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@MappedSuperclass
public abstract class AutoIdEntityObject{
    /**
     * TABLE：使用一个特定的数据库表格来保存主键。
     * SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
     * IDENTITY：主键由数据库自动生成（主要是自动增长型）
     * AUTO：主键由程序控制。
     */
    @Id
    @GeneratedValue(generator = "globalSeq",strategy= GenerationType.SEQUENCE)
    @SequenceGenerator(name="globalSeq", sequenceName="joe_global_gen")
    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
