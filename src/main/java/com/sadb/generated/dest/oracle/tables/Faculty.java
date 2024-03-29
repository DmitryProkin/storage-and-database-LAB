/*
 * This file is generated by jOOQ.
 */
package com.sadb.generated.dest.oracle.tables;


import com.sadb.generated.dest.oracle.Indexes;
import com.sadb.generated.dest.oracle.Keys;
import com.sadb.generated.dest.oracle.Sanddb;
import com.sadb.generated.dest.oracle.tables.records.FacultyRecord;

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

    private static final long serialVersionUID = 1444993673;

    /**
     * The reference instance of <code>SANDDB.FACULTY</code>
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
     * The column <code>SANDDB.FACULTY.FAC_ID</code>.
     */
    public final TableField<FacultyRecord, Long> FAC_ID = createField("FAC_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>SANDDB.FACULTY.FAC_NAME</code>.
     */
    public final TableField<FacultyRecord, String> FAC_NAME = createField("FAC_NAME", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>SANDDB.FACULTY.MEGAFAC_ID</code>.
     */
    public final TableField<FacultyRecord, Long> MEGAFAC_ID = createField("MEGAFAC_ID", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>SANDDB.FACULTY.CREAT_TIME</code>.
     */
    public final TableField<FacultyRecord, Timestamp> CREAT_TIME = createField("CREAT_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.precision(38), this, "");

    /**
     * The column <code>SANDDB.FACULTY.UPDATE_TIME</code>.
     */
    public final TableField<FacultyRecord, Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.precision(38), this, "");

    /**
     * Create a <code>SANDDB.FACULTY</code> table reference
     */
    public Faculty() {
        this(DSL.name("FACULTY"), null);
    }

    /**
     * Create an aliased <code>SANDDB.FACULTY</code> table reference
     */
    public Faculty(String alias) {
        this(DSL.name(alias), FACULTY);
    }

    /**
     * Create an aliased <code>SANDDB.FACULTY</code> table reference
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
        return Sanddb.SANDDB;
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
        return Arrays.<ForeignKey<FacultyRecord, ?>>asList(Keys.R_33);
    }

    public Megafaculty megafaculty() {
        return new Megafaculty(this, Keys.R_33);
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
