/*
 * This file is generated by jOOQ.
 */
package com.sadb.generated.dest.oracle.tables.records;


import com.sadb.generated.dest.oracle.tables.Occupation;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class OccupationRecord extends UpdatableRecordImpl<OccupationRecord> implements Record6<Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp> {

    private static final long serialVersionUID = -228113953;

    /**
     * Setter for <code>public.occupation.occupation_id</code>.
     */
    public void setOccupationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.occupation.occupation_id</code>.
     */
    public Integer getOccupationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.occupation.occupaton_num</code>.
     */
    public void setOccupatonNum(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.occupation.occupaton_num</code>.
     */
    public Integer getOccupatonNum() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.occupation.occupation_time_from</code>.
     */
    public void setOccupationTimeFrom(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.occupation.occupation_time_from</code>.
     */
    public Timestamp getOccupationTimeFrom() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.occupation.occupation_time_to</code>.
     */
    public void setOccupationTimeTo(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.occupation.occupation_time_to</code>.
     */
    public Timestamp getOccupationTimeTo() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.occupation.creat_time</code>.
     */
    public void setCreatTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.occupation.creat_time</code>.
     */
    public Timestamp getCreatTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>public.occupation.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.occupation.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Occupation.OCCUPATION.OCCUPATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Occupation.OCCUPATION.OCCUPATON_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Occupation.OCCUPATION.OCCUPATION_TIME_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Occupation.OCCUPATION.OCCUPATION_TIME_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Occupation.OCCUPATION.CREAT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Occupation.OCCUPATION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getOccupationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getOccupatonNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getOccupationTimeFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getOccupationTimeTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOccupationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getOccupatonNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getOccupationTimeFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getOccupationTimeTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationRecord value1(Integer value) {
        setOccupationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationRecord value2(Integer value) {
        setOccupatonNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationRecord value3(Timestamp value) {
        setOccupationTimeFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationRecord value4(Timestamp value) {
        setOccupationTimeTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationRecord value5(Timestamp value) {
        setCreatTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationRecord value6(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OccupationRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OccupationRecord
     */
    public OccupationRecord() {
        super(Occupation.OCCUPATION);
    }

    /**
     * Create a detached, initialised OccupationRecord
     */
    public OccupationRecord(Integer occupationId, Integer occupatonNum, Timestamp occupationTimeFrom, Timestamp occupationTimeTo, Timestamp creatTime, Timestamp updateTime) {
        super(Occupation.OCCUPATION);

        set(0, occupationId);
        set(1, occupatonNum);
        set(2, occupationTimeFrom);
        set(3, occupationTimeTo);
        set(4, creatTime);
        set(5, updateTime);
    }
}