package cn.biq.mn.tree;

import cn.biq.mn.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class TreeEntity<T extends TreeEntity<T>> extends BaseEntity {

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private T parent;

    @Column(nullable = false)
    private Integer level;

}
