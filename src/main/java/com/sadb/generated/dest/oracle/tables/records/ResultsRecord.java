/*
 * This file is generated by jOOQ.
 */
package com.sadb.generated.dest.oracle.tables.records;


import com.sadb.generated.dest.oracle.tables.Results;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class ResultsRecord extends UpdatableRecordImpl<ResultsRecord> implements Record11<String, String, Integer, Timestamp, String, Integer, Integer, Integer, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = 973176992;

    /**
     * Setter for <code>public.results.result</code>.
     */
    public void setResult(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.results.result</code>.
     */
    public String getResult() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.results.ex_type</code>.
     */
    public void setExType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.results.ex_type</code>.
     */
    public String getExType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.results.discipline_id</code>.
     */
    public void setDisciplineId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.results.discipline_id</code>.
     */
    public Integer getDisciplineId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.results.result_date</code>.
     */
    public void setResultDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.results.result_date</code>.
     */
    public Timestamp getResultDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>public.results.result_eu</code>.
     */
    public void setResultEu(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.results.result_eu</code>.
     */
    public String getResultEu() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.results.academ_year_id</code>.
     */
    public void setAcademYearId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.results.academ_year_id</code>.
     */
    public Integer getAcademYearId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.results.result_id</code>.
     */
    public void setResultId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.results.result_id</code>.
     */
    public Integer getResultId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.results.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.results.student_id</code>.
     */
    public Integer getStudentId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.results.creat_time</code>.
     */
    public void setCreatTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.results.creat_time</code>.
     */
    public Timestamp getCreatTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>public.results.update_time</code>.
     */
    public void setUpdateTime(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.results.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>public.results.teacher_id</code>.
     */
    public void setTeacherId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.results.teacher_id</code>.
     */
    public Integer getTeacherId() {
        return (Integer) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, Integer, Timestamp, String, Integer, Integer, Integer, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, Integer, Timestamp, String, Integer, Integer, Integer, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Results.RESULTS.RESULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Results.RESULTS.EX_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Results.RESULTS.DISCIPLINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Results.RESULTS.RESULT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Results.RESULTS.RESULT_EU;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Results.RESULTS.ACADEM_YEAR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Results.RESULTS.RESULT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Results.RESULTS.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Results.RESULTS.CREAT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Results.RESULTS.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Results.RESULTS.TEACHER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getExType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getDisciplineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getResultDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getResultEu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getAcademYearId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getResultId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getStudentId();
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
    public Integer component11() {
        return getTeacherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getResult();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getExType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDisciplineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getResultDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getResultEu();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getAcademYearId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getResultId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getStudentId();
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
    public Integer value11() {
        return getTeacherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value1(String value) {
        setResult(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value2(String value) {
        setExType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value3(Integer value) {
        setDisciplineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value4(Timestamp value) {
        setResultDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value5(String value) {
        setResultEu(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value6(Integer value) {
        setAcademYearId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value7(Integer value) {
        setResultId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value8(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value9(Timestamp value) {
        setCreatTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord value11(Integer value) {
        setTeacherId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResultsRecord values(String value1, String value2, Integer value3, Timestamp value4, String value5, Integer value6, Integer value7, Integer value8, Timestamp value9, Timestamp value10, Integer value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ResultsRecord
     */
    public ResultsRecord() {
        super(Results.RESULTS);
    }

    /**
     * Create a detached, initialised ResultsRecord
     */
    public ResultsRecord(String result, String exType, Integer disciplineId, Timestamp resultDate, String resultEu, Integer academYearId, Integer resultId, Integer studentId, Timestamp creatTime, Timestamp updateTime, Integer teacherId) {
        super(Results.RESULTS);

        set(0, result);
        set(1, exType);
        set(2, disciplineId);
        set(3, resultDate);
        set(4, resultEu);
        set(5, academYearId);
        set(6, resultId);
        set(7, studentId);
        set(8, creatTime);
        set(9, updateTime);
        set(10, teacherId);
    }
}