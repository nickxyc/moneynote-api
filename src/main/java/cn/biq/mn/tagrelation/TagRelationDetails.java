package cn.biq.mn.tagrelation;

import cn.biq.mn.base.BaseDetails;
import cn.biq.mn.tag.TagDetails;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TagRelationDetails extends BaseDetails {

    private TagDetails tag;
    private BigDecimal amount;
    private BigDecimal convertedAmount;

    public Integer getTagId() {
        return tag.getId();
    }

    public String getTagName() {
        return tag.getName();
    }

}
