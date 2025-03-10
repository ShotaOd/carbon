/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables;


import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.Carbondb;
import org.carbon.sample.ext.jooq.Keys;
import org.carbon.sample.ext.jooq.tables.records.RoleRecord;
import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Role extends TableImpl<RoleRecord> {

    private static final long serialVersionUID = 1395853386;

    /**
     * The reference instance of <code>carbondb.role</code>
     */
    public static final Role ROLE = new Role();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleRecord> getRecordType() {
        return RoleRecord.class;
    }

    /**
     * The column <code>carbondb.role.id</code>.
     */
    public final TableField<RoleRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>carbondb.role</code> table reference
     */
    public Role() {
        this("role", null);
    }

    /**
     * Create an aliased <code>carbondb.role</code> table reference
     */
    public Role(String alias) {
        this(alias, ROLE);
    }

    private Role(String alias, Table<RoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Role(String alias, Table<RoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Carbondb.CARBONDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RoleRecord> getPrimaryKey() {
        return Keys.KEY_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RoleRecord>> getKeys() {
        return Arrays.<UniqueKey<RoleRecord>>asList(Keys.KEY_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Role as(String alias) {
        return new Role(alias, this);
    }

    /**
     * Rename this table
     */
    public Role rename(String name) {
        return new Role(name, null);
    }
}
