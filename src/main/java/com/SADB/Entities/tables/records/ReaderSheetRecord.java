/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.tables.records;


import com.SADB.Entities.tables.ReaderSheet;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class ReaderSheetRecord extends UpdatableRecordImpl<ReaderSheetRecord> implements Record7<Integer, Integer, String, Date, Date, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1704186441;

    /**
     * Setter for <code>public.reader_sheet.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.reader_sheet.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.reader_sheet.participant_id</code>.
     */
    public void setParticipantId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.reader_sheet.participant_id</code>.
     */
    public Integer getParticipantId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.reader_sheet.title_book</code>.
     */
    public void setTitleBook(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.reader_sheet.title_book</code>.
     */
    public String getTitleBook() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.reader_sheet.date_take</code>.
     */
    public void setDateTake(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.reader_sheet.date_take</code>.
     */
    public Date getDateTake() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>public.reader_sheet.date_put</code>.
     */
    public void setDatePut(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.reader_sheet.date_put</code>.
     */
    public Date getDatePut() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>public.reader_sheet.data_update</code>.
     */
    public void setDataUpdate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.reader_sheet.data_update</code>.
     */
    public Timestamp getDataUpdate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>public.reader_sheet.data_create</code>.
     */
    public void setDataCreate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.reader_sheet.data_create</code>.
     */
    public Timestamp getDataCreate() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Date, Date, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Date, Date, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReaderSheet.READER_SHEET.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReaderSheet.READER_SHEET.PARTICIPANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReaderSheet.READER_SHEET.TITLE_BOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return ReaderSheet.READER_SHEET.DATE_TAKE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return ReaderSheet.READER_SHEET.DATE_PUT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ReaderSheet.READER_SHEET.DATA_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ReaderSheet.READER_SHEET.DATA_CREATE;
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
    public Integer component2() {
        return getParticipantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTitleBook();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getDateTake();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component5() {
        return getDatePut();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getDataUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
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
    public Integer value2() {
        return getParticipantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitleBook();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getDateTake();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getDatePut();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getDataUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getDataCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReaderSheetRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReaderSheetRecord value2(Integer value) {
        setParticipantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReaderSheetRecord value3(String value) {
        setTitleBook(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReaderSheetRecord value4(Date value) {
        setDateTake(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReaderSheetRecord value5(Date value) {
        setDatePut(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReaderSheetRecord value6(Timestamp value) {
        setDataUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReaderSheetRecord value7(Timestamp value) {
        setDataCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReaderSheetRecord values(Integer value1, Integer value2, String value3, Date value4, Date value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReaderSheetRecord
     */
    public ReaderSheetRecord() {
        super(ReaderSheet.READER_SHEET);
    }

    /**
     * Create a detached, initialised ReaderSheetRecord
     */
    public ReaderSheetRecord(Integer id, Integer participantId, String titleBook, Date dateTake, Date datePut, Timestamp dataUpdate, Timestamp dataCreate) {
        super(ReaderSheet.READER_SHEET);

        set(0, id);
        set(1, participantId);
        set(2, titleBook);
        set(3, dateTake);
        set(4, datePut);
        set(5, dataUpdate);
        set(6, dataCreate);
    }
}