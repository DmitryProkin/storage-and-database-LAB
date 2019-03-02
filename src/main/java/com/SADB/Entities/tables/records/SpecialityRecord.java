/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.tables.records;


import com.SADB.Entities.tables.Speciality;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class SpecialityRecord extends UpdatableRecordImpl<SpecialityRecord> implements Record10<Integer, String, String, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 903659529;

    /**
     * Setter for <code>public.speciality.spec_id</code>.
     */
    public void setSpecId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.speciality.spec_id</code>.
     */
    public Integer getSpecId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.speciality.spec_name</code>.
     */
    public void setSpecName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.speciality.spec_name</code>.
     */
    public String getSpecName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.speciality.spec_number</code>.
     */
    public void setSpecNumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.speciality.spec_number</code>.
     */
    public String getSpecNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.speciality.spec_degree</code>.
     */
    public void setSpecDegree(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.speciality.spec_degree</code>.
     */
    public String getSpecDegree() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.speciality.free_educ_count</code>.
     */
    public void setFreeEducCount(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.speciality.free_educ_count</code>.
     */
    public Integer getFreeEducCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.speciality.paid_educ_count</code>.
     */
    public void setPaidEducCount(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.speciality.paid_educ_count</code>.
     */
    public Integer getPaidEducCount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.speciality.sponsored_educ_count</code>.
     */
    public void setSponsoredEducCount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.speciality.sponsored_educ_count</code>.
     */
    public Integer getSponsoredEducCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.speciality.prog_id</code>.
     */
    public void setProgId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.speciality.prog_id</code>.
     */
    public Integer getProgId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.speciality.creat_time</code>.
     */
    public void setCreatTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.speciality.creat_time</code>.
     */
    public Timestamp getCreatTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>public.speciality.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.speciality.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Speciality.SPECIALITY.SPEC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Speciality.SPECIALITY.SPEC_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Speciality.SPECIALITY.SPEC_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Speciality.SPECIALITY.SPEC_DEGREE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Speciality.SPECIALITY.FREE_EDUC_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Speciality.SPECIALITY.PAID_EDUC_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Speciality.SPECIALITY.SPONSORED_EDUC_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Speciality.SPECIALITY.PROG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Speciality.SPECIALITY.CREAT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Speciality.SPECIALITY.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSpecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSpecName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSpecNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSpecDegree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getFreeEducCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPaidEducCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getSponsoredEducCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getProgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreatTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSpecId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSpecName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSpecNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSpecDegree();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getFreeEducCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPaidEducCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSponsoredEducCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getProgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreatTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value1(Integer value) {
        setSpecId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value2(String value) {
        setSpecName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value3(String value) {
        setSpecNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value4(String value) {
        setSpecDegree(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value5(Integer value) {
        setFreeEducCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value6(Integer value) {
        setPaidEducCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value7(Integer value) {
        setSponsoredEducCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value8(Integer value) {
        setProgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value9(Timestamp value) {
        setCreatTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialityRecord values(Integer value1, String value2, String value3, String value4, Integer value5, Integer value6, Integer value7, Integer value8, Timestamp value9, Timestamp value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpecialityRecord
     */
    public SpecialityRecord() {
        super(Speciality.SPECIALITY);
    }

    /**
     * Create a detached, initialised SpecialityRecord
     */
    public SpecialityRecord(Integer specId, String specName, String specNumber, String specDegree, Integer freeEducCount, Integer paidEducCount, Integer sponsoredEducCount, Integer progId, Timestamp creatTime, Timestamp updateTime) {
        super(Speciality.SPECIALITY);

        set(0, specId);
        set(1, specName);
        set(2, specNumber);
        set(3, specDegree);
        set(4, freeEducCount);
        set(5, paidEducCount);
        set(6, sponsoredEducCount);
        set(7, progId);
        set(8, creatTime);
        set(9, updateTime);
    }
}