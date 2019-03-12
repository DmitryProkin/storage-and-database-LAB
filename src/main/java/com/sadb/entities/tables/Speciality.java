/*
 * This file is generated by jOOQ.
 */
package com.sadb.entities.tables;


import com.sadb.entities.Indexes;
import com.sadb.entities.Keys;
import com.sadb.entities.Public;
import com.sadb.entities.tables.records.SpecialityRecord;

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
public class Speciality extends TableImpl<SpecialityRecord> {

    private static final long serialVersionUID = 1033252719;

    /**
     * The reference instance of <code>public.speciality</code>
     */
    public static final Speciality SPECIALITY = new Speciality();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpecialityRecord> getRecordType() {
        return SpecialityRecord.class;
    }

    /**
     * The column <code>public.speciality.spec_id</code>.
     */
    public final TableField<SpecialityRecord, Integer> SPEC_ID = createField("spec_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.speciality.spec_name</code>.
     */
    public final TableField<SpecialityRecord, String> SPEC_NAME = createField("spec_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.speciality.spec_number</code>.
     */
    public final TableField<SpecialityRecord, String> SPEC_NUMBER = createField("spec_number", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.speciality.spec_degree</code>.
     */
    public final TableField<SpecialityRecord, String> SPEC_DEGREE = createField("spec_degree", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>public.speciality.free_educ_count</code>.
     */
    public final TableField<SpecialityRecord, Integer> FREE_EDUC_COUNT = createField("free_educ_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.speciality.paid_educ_count</code>.
     */
    public final TableField<SpecialityRecord, Integer> PAID_EDUC_COUNT = createField("paid_educ_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.speciality.sponsored_educ_count</code>.
     */
    public final TableField<SpecialityRecord, Integer> SPONSORED_EDUC_COUNT = createField("sponsored_educ_count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.speciality.prog_id</code>.
     */
    public final TableField<SpecialityRecord, Integer> PROG_ID = createField("prog_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.speciality.creat_time</code>.
     */
    public final TableField<SpecialityRecord, Timestamp> CREAT_TIME = createField("creat_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.speciality.update_time</code>.
     */
    public final TableField<SpecialityRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>public.speciality</code> table reference
     */
    public Speciality() {
        this(DSL.name("speciality"), null);
    }

    /**
     * Create an aliased <code>public.speciality</code> table reference
     */
    public Speciality(String alias) {
        this(DSL.name(alias), SPECIALITY);
    }

    /**
     * Create an aliased <code>public.speciality</code> table reference
     */
    public Speciality(Name alias) {
        this(alias, SPECIALITY);
    }

    private Speciality(Name alias, Table<SpecialityRecord> aliased) {
        this(alias, aliased, null);
    }

    private Speciality(Name alias, Table<SpecialityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Speciality(Table<O> child, ForeignKey<O, SpecialityRecord> key) {
        super(child, key, SPECIALITY);
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
        return Arrays.<Index>asList(Indexes.XPK_PROGR_SPECIALITY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SpecialityRecord> getPrimaryKey() {
        return Keys.XPK_PROGR_SPECIALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SpecialityRecord>> getKeys() {
        return Arrays.<UniqueKey<SpecialityRecord>>asList(Keys.XPK_PROGR_SPECIALITY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SpecialityRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SpecialityRecord, ?>>asList(Keys.SPECIALITY__R_26);
    }

    public ProgramTrack programTrack() {
        return new ProgramTrack(this, Keys.SPECIALITY__R_26);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Speciality as(String alias) {
        return new Speciality(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Speciality as(Name alias) {
        return new Speciality(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Speciality rename(String name) {
        return new Speciality(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Speciality rename(Name name) {
        return new Speciality(name, null);
    }
}