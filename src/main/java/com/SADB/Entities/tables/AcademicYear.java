/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.tables;


import com.SADB.Entities.Indexes;
import com.SADB.Entities.Keys;
import com.SADB.Entities.Public;
import com.SADB.Entities.tables.records.AcademicYearRecord;

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
public class AcademicYear extends TableImpl<AcademicYearRecord> {

    private static final long serialVersionUID = 710614862;

    /**
     * The reference instance of <code>public.academic_year</code>
     */
    public static final AcademicYear ACADEMIC_YEAR = new AcademicYear();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AcademicYearRecord> getRecordType() {
        return AcademicYearRecord.class;
    }

    /**
     * The column <code>public.academic_year.academ_year</code>.
     */
    public final TableField<AcademicYearRecord, String> ACADEM_YEAR = createField("academ_year", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.academic_year.academ_year_id</code>.
     */
    public final TableField<AcademicYearRecord, Integer> ACADEM_YEAR_ID = createField("academ_year_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.academic_year.creat_time</code>.
     */
    public final TableField<AcademicYearRecord, Timestamp> CREAT_TIME = createField("creat_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.academic_year.update_time</code>.
     */
    public final TableField<AcademicYearRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>public.academic_year</code> table reference
     */
    public AcademicYear() {
        this(DSL.name("academic_year"), null);
    }

    /**
     * Create an aliased <code>public.academic_year</code> table reference
     */
    public AcademicYear(String alias) {
        this(DSL.name(alias), ACADEMIC_YEAR);
    }

    /**
     * Create an aliased <code>public.academic_year</code> table reference
     */
    public AcademicYear(Name alias) {
        this(alias, ACADEMIC_YEAR);
    }

    private AcademicYear(Name alias, Table<AcademicYearRecord> aliased) {
        this(alias, aliased, null);
    }

    private AcademicYear(Name alias, Table<AcademicYearRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AcademicYear(Table<O> child, ForeignKey<O, AcademicYearRecord> key) {
        super(child, key, ACADEMIC_YEAR);
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
        return Arrays.<Index>asList(Indexes.XPK_ACADEMIC_YEAR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AcademicYearRecord> getPrimaryKey() {
        return Keys.XPK_ACADEMIC_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AcademicYearRecord>> getKeys() {
        return Arrays.<UniqueKey<AcademicYearRecord>>asList(Keys.XPK_ACADEMIC_YEAR);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYear as(String alias) {
        return new AcademicYear(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYear as(Name alias) {
        return new AcademicYear(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AcademicYear rename(String name) {
        return new AcademicYear(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AcademicYear rename(Name name) {
        return new AcademicYear(name, null);
    }
}
