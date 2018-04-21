package com.joe.qiao.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * @author Joe Qiao
 * @Date 20/04/2018.
 */
@MappedSuperclass
public abstract class EntityObject implements java.io.Serializable{
    @Column(name="last_modified_time")
    private long lastModified;

    @Column(name="creation_time")
    private long creationTime;
    
    public abstract long getId();
    public abstract void setId(long id);
    
    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    @PreUpdate
    @PrePersist
    protected void beforeUpdate() {
        long time = System.currentTimeMillis();
        if(getId() == 0) creationTime = 0;
        if(creationTime == 0) creationTime =time;
        lastModified = time;
    }
    
}
