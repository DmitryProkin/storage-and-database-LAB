/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.tables;


import com.SADB.Entities.Indexes;
import com.SADB.Entities.Keys;
import com.SADB.Entities.Public;
import com.SADB.Entities.tables.records.MegafacultyRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Megafaculty extends TableImpl<MegafacultyRecord> {

    private static final long serialVersionUID = 921937978;

    /**
     * The reference instance of <code>public.megafaculty</code>
     */
    public static final Megafaculty MEGAFACULTY = new Megafaculty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MegafacultyRecord> getRecordType() {
        return MegafacultyRecord.class;
    }

    /**
     * The column <code>public.megafaculty.megafac_id</code>.
     */
    public final TableField<MegafacultyRecord, Integer> MEGAFAC_ID = createField("megafac_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.megafaculty.mfaculty_name</code>.
     */
    public final TableField<MegafacultyRecord, String> MFACULTY_NAME = createField("mfaculty_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.megafaculty.creat_time</code>.
     */
    public final TableField<MegafacultyRecord, Timestamp> CREAT_TIME = createField("creat_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.megafaculty.update_time</code>.
     */
    public final TableField<MegafacultyRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>public.megafaculty</code> table reference
     */
    public Megafaculty() {
        this(DSL.name("megafaculty"), null);
    }

    /**
     * Create an aliased <code>public.megafaculty</code> table reference
     */
    public Megafaculty(String alias) {
        this(DSL.name(alias), MEGAFACULTY);
    }

    /**
     * Create an aliased <code>public.megafaculty</code> table reference
     */
    public Megafaculty(Name alias) {
        this(alias, MEGAFACULTY);
    }

    private Megafaculty(Name alias, Table<MegafacultyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Megafaculty(Name alias, Table<MegafacultyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Megafaculty(Table<O> child, ForeignKey<O, MegafacultyRecord> key) {
        super(child, key, MEGAFACULTY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.XPK_MFAC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MegafacultyRecord> getPrimaryKey() {
        return Keys.XPK_MFAC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MegafacultyRecord>> getKeys() {
        return Arrays.<UniqueKey<MegafacultyRecord>>asList(Keys.XPK_MFAC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Megafaculty as(String alias) {
        return new Megafaculty(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Megafaculty as(Name alias) {
        return new Megafaculty(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Megafaculty rename(String name) {
        return new Megafaculty(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Megafaculty rename(Name name) {
        return new Megafaculty(name, null);
    }
}
