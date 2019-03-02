/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.tables;


import com.SADB.Entities.Keys;
import com.SADB.Entities.Public;
import com.SADB.Entities.tables.records.ListParticipantRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class ListParticipant extends TableImpl<ListParticipantRecord> {

    private static final long serialVersionUID = 1625060316;

    /**
     * The reference instance of <code>public.list_participant</code>
     */
    public static final ListParticipant LIST_PARTICIPANT = new ListParticipant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ListParticipantRecord> getRecordType() {
        return ListParticipantRecord.class;
    }

    /**
     * The column <code>public.list_participant.participant_id</code>.
     */
    public final TableField<ListParticipantRecord, Integer> PARTICIPANT_ID = createField("participant_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.list_participant.conference_id</code>.
     */
    public final TableField<ListParticipantRecord, Integer> CONFERENCE_ID = createField("conference_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.list_participant.data_update</code>.
     */
    public final TableField<ListParticipantRecord, Timestamp> DATA_UPDATE = createField("data_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.list_participant.data_create</code>.
     */
    public final TableField<ListParticipantRecord, Timestamp> DATA_CREATE = createField("data_create", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.list_participant</code> table reference
     */
    public ListParticipant() {
        this(DSL.name("list_participant"), null);
    }

    /**
     * Create an aliased <code>public.list_participant</code> table reference
     */
    public ListParticipant(String alias) {
        this(DSL.name(alias), LIST_PARTICIPANT);
    }

    /**
     * Create an aliased <code>public.list_participant</code> table reference
     */
    public ListParticipant(Name alias) {
        this(alias, LIST_PARTICIPANT);
    }

    private ListParticipant(Name alias, Table<ListParticipantRecord> aliased) {
        this(alias, aliased, null);
    }

    private ListParticipant(Name alias, Table<ListParticipantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ListParticipant(Table<O> child, ForeignKey<O, ListParticipantRecord> key) {
        super(child, key, LIST_PARTICIPANT);
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
    public List<ForeignKey<ListParticipantRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ListParticipantRecord, ?>>asList(Keys.LIST_PARTICIPANT__LIST_PARTICIPANT_FK0, Keys.LIST_PARTICIPANT__LIST_PARTICIPANT_FK1);
    }

    public Student student() {
        return new Student(this, Keys.LIST_PARTICIPANT__LIST_PARTICIPANT_FK0);
    }

    public Conference conference() {
        return new Conference(this, Keys.LIST_PARTICIPANT__LIST_PARTICIPANT_FK1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListParticipant as(String alias) {
        return new ListParticipant(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ListParticipant as(Name alias) {
        return new ListParticipant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ListParticipant rename(String name) {
        return new ListParticipant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ListParticipant rename(Name name) {
        return new ListParticipant(name, null);
    }
}
