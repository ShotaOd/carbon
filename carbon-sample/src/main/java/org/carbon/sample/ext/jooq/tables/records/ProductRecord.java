/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.records;


import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.Product;
import org.carbon.sample.ext.jooq.tables.interfaces.IProduct;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class ProductRecord extends UpdatableRecordImpl<ProductRecord> implements Record1<Long>, IProduct {

    private static final long serialVersionUID = -541736774;

    /**
     * Setter for <code>carbondb.product.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>carbondb.product.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Long> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Product.PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProductRecord values(Long value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IProduct from) {
        setId(from.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IProduct> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductRecord
     */
    public ProductRecord() {
        super(Product.PRODUCT);
    }

    /**
     * Create a detached, initialised ProductRecord
     */
    public ProductRecord(Long id) {
        super(Product.PRODUCT);

        set(0, id);
    }
}
