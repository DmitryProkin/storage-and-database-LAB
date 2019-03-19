/*
 * This file is generated by jOOQ.
 */
package com.sadb.generated.dest.oracle.tables;


import com.sadb.generated.dest.oracle.Indexes;
import com.sadb.generated.dest.oracle.Keys;
import com.sadb.generated.dest.oracle.Public;
import com.sadb.generated.dest.oracle.tables.records.LecturerRecord;

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
public class Lecturer extends TableImpl<LecturerRecord> {

    private static final long serialVersionUID = 1761503771;

    /**
     * The reference instance of <code>public.lecturer</code>
     */
    public static final Lecturer LECTURER = new Lecturer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LecturerRecord> getRecordType() {
        return LecturerRecord.class;
    }

    /**
     * The column <code>public.lecturer.lec_id</code>.
     */
    public final TableField<LecturerRecord, Integer> LEC_ID = createField("LEC_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.lecturer.second_name</code>.
     */
    public final TableField<LecturerRecord, String> SECOND_NAME = createField("SECOND_NAME", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.lecturer.first_name</code>.
     */
    public final TableField<LecturerRecord, String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.lecturer.patronymic_name</code>.
     */
    public final TableField<LecturerRecord, String> PATRONYMIC_NAME = createField("PATRONYMIC_NAME", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.lecturer.birth_date</code>.
     */
    public final TableField<LecturerRecord, Timestamp> BIRTH_DATE = createField("BIRTH_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.lecturer.birth_place</code>.
     */
    public final TableField<LecturerRecord, String> BIRTH_PLACE = createField("BIRTH_PLACE", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.lecturer.post</code>.
     */
    public final TableField<LecturerRecord, String> POST = createField("POST", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>public.lecturer.work_period_from</code>.
     */
    public final TableField<LecturerRecord, Timestamp> WORK_PERIOD_FROM = createField("WORK_PERIOD_FROM", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.lecturer.work_period_to</code>.
     */
    public final TableField<LecturerRecord, Timestamp> WORK_PERIOD_TO = createField("WORK_PERIOD_TO", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.lecturer.creat_time</code>.
     */
    public final TableField<LecturerRecord, Timestamp> CREAT_TIME = createField("CREAT_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>public.lecturer.update_time</code>.
     */
    public final TableField<LecturerRecord, Timestamp> UPDATE_TIME = createField("UPDATE_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>public.lecturer</code> table reference
     */
    public Lecturer() {
        this(DSL.name("LECTURER"), null);
    }

    /**
     * Create an aliased <code>public.lecturer</code> table reference
     */
    public Lecturer(String alias) {
        this(DSL.name(alias), LECTURER);
    }

    /**
     * Create an aliased <code>public.lecturer</code> table reference
     */
    public Lecturer(Name alias) {
        this(alias, LECTURER);
    }

    private Lecturer(Name alias, Table<LecturerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Lecturer(Name alias, Table<LecturerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Lecturer(Table<O> child, ForeignKey<O, LecturerRecord> key) {
        super(child, key, LECTURER);
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
        return Arrays.<Index>asList(Indexes.XPK_LECTURER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LecturerRecord> getPrimaryKey() {
        return Keys.XPK_LECTURER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LecturerRecord>> getKeys() {
        return Arrays.<UniqueKey<LecturerRecord>>asList(Keys.XPK_LECTURER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lecturer as(String alias) {
        return new Lecturer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Lecturer as(Name alias) {
        return new Lecturer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Lecturer rename(String name) {
        return new Lecturer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Lecturer rename(Name name) {
        return new Lecturer(name, null);
    }
}
