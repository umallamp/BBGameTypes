package edu.asu.wpcarey.bloodtypes;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * This class represents the Red Blood units used in the game.
 */
public class WholeBloodUnit implements BloodUnit {

    private final int quantity;
    private final int lifeInDays;

    public WholeBloodUnit(int quantity, int lifeInDays) {
        this.quantity = quantity;
        this.lifeInDays = lifeInDays;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public int getLifeInDays() {
        return lifeInDays;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(quantity)
                .append(lifeInDays)
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof WholeBloodUnit)) {
            return false;
        }

        WholeBloodUnit other = (WholeBloodUnit) obj;
        return new EqualsBuilder()
                .append(quantity, other.quantity)
                .append(lifeInDays, other.lifeInDays)
                .isEquals();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("quantity", quantity)
                .append("lifeInDays", lifeInDays)
                .toString();
    }
}
