/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.Exampe.tables.records;


import com.SADB.Entities.Exampe.tables.Car;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class CarRecord extends UpdatableRecordImpl<CarRecord> implements Record8<Long, String, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = -430828759;

    /**
     * Setter for <code>public.car.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.car.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.car.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.car.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.car.length</code>.
     */
    public void setLength(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.car.length</code>.
     */
    public Integer getLength() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.car.width</code>.
     */
    public void setWidth(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.car.width</code>.
     */
    public Integer getWidth() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.car.height</code>.
     */
    public void setHeight(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.car.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.car.wheelbase</code>.
     */
    public void setWheelbase(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.car.wheelbase</code>.
     */
    public Integer getWheelbase() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.car.volume</code>.
     */
    public void setVolume(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.car.volume</code>.
     */
    public Integer getVolume() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.car.power</code>.
     */
    public void setPower(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.car.power</code>.
     */
    public Integer getPower() {
        return (Integer) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Car.CAR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Car.CAR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Car.CAR.LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Car.CAR.WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Car.CAR.HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Car.CAR.WHEELBASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Car.CAR.VOLUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Car.CAR.POWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
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
    public Integer component3() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getWheelbase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getVolume();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getPower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
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
    public Integer value3() {
        return getLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getWheelbase();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getVolume();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getPower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value3(Integer value) {
        setLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value4(Integer value) {
        setWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value5(Integer value) {
        setHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value6(Integer value) {
        setWheelbase(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value7(Integer value) {
        setVolume(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord value8(Integer value) {
        setPower(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CarRecord values(Long value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CarRecord
     */
    public CarRecord() {
        super(Car.CAR);
    }

    /**
     * Create a detached, initialised CarRecord
     */
    public CarRecord(Long id, String name, Integer length, Integer width, Integer height, Integer wheelbase, Integer volume, Integer power) {
        super(Car.CAR);

        set(0, id);
        set(1, name);
        set(2, length);
        set(3, width);
        set(4, height);
        set(5, wheelbase);
        set(6, volume);
        set(7, power);
    }
}
