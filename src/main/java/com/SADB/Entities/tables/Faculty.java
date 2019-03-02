/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.tables;


import com.SADB.Entities.Indexes;
import com.SADB.Entities.Keys;
import com.SADB.Entities.Public;
import com.SADB.Entities.tables.records.FacultyRecord;

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
public class Faculty extends TableImpl<FacultyRecord> {

    private static final long serialVersionUID = 2120496761;

    /**
     * The reference instance of <code>public.faculty</code>
     */
    public static final Faculty FACULTY = new Faculty();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FacultyRecord> getRecordType() {
        return FacultyRecord.class;
    }

    /**
     * The column <code>public.faculty.fac_id</code>.
     */
    public final TableField<FacultyRecord, Integer> FAC_ID = createField("fac_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.faculty.fac_name</code>.
     */
    public final TableField<FacultyRecord, String> FAC_NAME = createField("fac_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.faculty.megafac_id</code>.
     */
    public final TableField<FacultyRecord, Integer> MEGAFAC_ID = createField("megafac_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.faculty.creat_time</code>.
     */
    public final TableField<FacultyRecord, Timestamp> CREAT_TIME = createField("creat_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.faculty.update_time</code>.
     */
    public final TableField<FacultyRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>public.faculty</code> table reference
     */
    public Faculty() {
        this(DSL.name("faculty"), null);
    }

    /**
     * Create an aliased <code>public.faculty</code> table reference
     */
    public Faculty(String alias) {
        this(DSL.name(alias), FACULTY);
    }

    /**
     * Create an aliased <code>public.faculty</code> table reference
     */
    public Faculty(Name alias) {
        this(alias, FACULTY);
    }

    private Faculty(Name alias, Table<FacultyRecord> aliased) {
        this(alias, aliased, null);
    }

    private Faculty(Name alias, Table<FacultyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Faculty(Table<O> child, ForeignKey<O, FacultyRecord> key) {
        super(child, key, FACULTY);
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
        return Arrays.<Index>asList(Indexes.XPK_FAC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FacultyRecord> getPrimaryKey() {
        return Keys.XPK_FAC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FacultyRecord>> getKeys() {
        return Arrays.<UniqueKey<FacultyRecord>>asList(Keys.XPK_FAC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FacultyRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FacultyRecord, ?>>asList(Keys.FACULTY__R_33);
    }

    public Megafaculty megafaculty() {
        return new Megafaculty(this, Keys.FACULTY__R_33);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Faculty as(String alias) {
        return new Faculty(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Faculty as(Name alias) {
        return new Faculty(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Faculty rename(String name) {
        return new Faculty(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Faculty rename(Name name) {
        return new Faculty(name, null);
    }
}
