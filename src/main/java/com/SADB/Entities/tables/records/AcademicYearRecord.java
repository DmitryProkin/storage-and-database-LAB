/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.tables.records;


import com.SADB.Entities.tables.AcademicYear;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AcademicYearRecord extends UpdatableRecordImpl<AcademicYearRecord> implements Record4<String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -583907022;

    /**
     * Setter for <code>public.academic_year.academ_year</code>.
     */
    public void setAcademYear(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.academic_year.academ_year</code>.
     */
    public String getAcademYear() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.academic_year.academ_year_id</code>.
     */
    public void setAcademYearId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.academic_year.academ_year_id</code>.
     */
    public Integer getAcademYearId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.academic_year.creat_time</code>.
     */
    public void setCreatTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.academic_year.creat_time</code>.
     */
    public Timestamp getCreatTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.academic_year.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.academic_year.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return AcademicYear.ACADEMIC_YEAR.ACADEM_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return AcademicYear.ACADEMIC_YEAR.ACADEM_YEAR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return AcademicYear.ACADEMIC_YEAR.CREAT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return AcademicYear.ACADEMIC_YEAR.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAcademYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAcademYearId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreatTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAcademYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAcademYearId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreatTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value1(String value) {
        setAcademYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value2(Integer value) {
        setAcademYearId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value3(Timestamp value) {
        setCreatTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord value4(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicYearRecord values(String value1, Integer value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AcademicYearRecord
     */
    public AcademicYearRecord() {
        super(AcademicYear.ACADEMIC_YEAR);
    }

    /**
     * Create a detached, initialised AcademicYearRecord
     */
    public AcademicYearRecord(String academYear, Integer academYearId, Timestamp creatTime, Timestamp updateTime) {
        super(AcademicYear.ACADEMIC_YEAR);

        set(0, academYear);
        set(1, academYearId);
        set(2, creatTime);
        set(3, updateTime);
    }
}