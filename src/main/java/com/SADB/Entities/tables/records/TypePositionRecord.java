/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.tables.records;


import com.SADB.Entities.tables.TypePosition;

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
public class TypePositionRecord extends UpdatableRecordImpl<TypePositionRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1860374433;

    /**
     * Setter for <code>public.type_position.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.type_position.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.type_position.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.type_position.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.type_position.data_update</code>.
     */
    public void setDataUpdate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.type_position.data_update</code>.
     */
    public Timestamp getDataUpdate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>public.type_position.data_create</code>.
     */
    public void setDataCreate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.type_position.data_create</code>.
     */
    public Timestamp getDataCreate() {
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
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TypePosition.TYPE_POSITION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TypePosition.TYPE_POSITION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TypePosition.TYPE_POSITION.DATA_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TypePosition.TYPE_POSITION.DATA_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getDataUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getDataCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDataUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getDataCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypePositionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypePositionRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypePositionRecord value3(Timestamp value) {
        setDataUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypePositionRecord value4(Timestamp value) {
        setDataCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypePositionRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached TypePositionRecord
     */
    public TypePositionRecord() {
        super(TypePosition.TYPE_POSITION);
    }

    /**
     * Create a detached, initialised TypePositionRecord
     */
    public TypePositionRecord(Integer id, String name, Timestamp dataUpdate, Timestamp dataCreate) {
        super(TypePosition.TYPE_POSITION);

        set(0, id);
        set(1, name);
        set(2, dataUpdate);
        set(3, dataCreate);
    }
}
