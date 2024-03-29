/*
 * This file is generated by jOOQ.
 */
package com.sadb.generated.dest.oracle.tables;


import com.sadb.generated.dest.oracle.Indexes;
import com.sadb.generated.dest.oracle.Keys;
import com.sadb.generated.dest.oracle.Sanddb;
import com.sadb.generated.dest.oracle.tables.records.StudentRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
public class Student extends TableImpl<StudentRecord> {

    private static final long serialVersionUID = -648044333;

    /**
     * The reference instance of <code>SANDDB.STUDENT</code>
     */
    public static final Student STUDENT = new Student();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StudentRecord> getRecordType() {
        return StudentRecord.class;
    }

    /**
     * The column <code>SANDDB.STUDENT.ID</code>.
     */
    public final TableField<StudentRecord, BigDecimal> ID = createField("ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>SANDDB.STUDENT.NAME</code>.
     */
    public final TableField<StudentRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.SURNAME</code>.
     */
    public final TableField<StudentRecord, String> SURNAME = createField("SURNAME", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.SECOND_NAME</code>.
     */
    public final TableField<StudentRecord, String> SECOND_NAME = createField("SECOND_NAME", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.UNIVERSITY</code>.
     */
    public final TableField<StudentRecord, String> UNIVERSITY = createField("UNIVERSITY", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.EDUCATION_PLACE</code>.
     */
    public final TableField<StudentRecord, String> EDUCATION_PLACE = createField("EDUCATION_PLACE", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.SPECIALITY</code>.
     */
    public final TableField<StudentRecord, String> SPECIALITY = createField("SPECIALITY", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("null", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.SEMESTER</code>.
     */
    public final TableField<StudentRecord, BigDecimal> SEMESTER = createField("SEMESTER", org.jooq.impl.SQLDataType.NUMERIC.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.NUMERIC)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.CREATION_DATE</code>.
     */
    public final TableField<StudentRecord, Timestamp> CREATION_DATE = createField("CREATION_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>SANDDB.STUDENT.UPDATION_DATE</code>.
     */
    public final TableField<StudentRecord, Timestamp> UPDATION_DATE = createField("UPDATION_DATE", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>SANDDB.STUDENT.CONCESSION</code>.
     */
    public final TableField<StudentRecord, String> CONCESSION = createField("CONCESSION", org.jooq.impl.SQLDataType.CHAR(1).defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.CHAR)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.ROOM_ID</code>.
     */
    public final TableField<StudentRecord, Long> ROOM_ID = createField("ROOM_ID", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.DATE_CHECKIN</code>.
     */
    public final TableField<StudentRecord, Date> DATE_CHECKIN = createField("DATE_CHECKIN", org.jooq.impl.SQLDataType.DATE.defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.DATE)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.DATE_CHECKOUT</code>.
     */
    public final TableField<StudentRecord, Date> DATE_CHECKOUT = createField("DATE_CHECKOUT", org.jooq.impl.SQLDataType.DATE.defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.DATE)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.FORM_EDUCATION</code>.
     */
    public final TableField<StudentRecord, Long> FORM_EDUCATION = createField("FORM_EDUCATION", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.POSITION_ID</code>.
     */
    public final TableField<StudentRecord, Long> POSITION_ID = createField("POSITION_ID", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.GROUP_ID</code>.
     */
    public final TableField<StudentRecord, Long> GROUP_ID = createField("GROUP_ID", org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("NULL ", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.BIRTH_DATE</code>.
     */
    public final TableField<StudentRecord, Timestamp> BIRTH_DATE = createField("BIRTH_DATE", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>SANDDB.STUDENT.BIRTH_PLACE</code>.
     */
    public final TableField<StudentRecord, String> BIRTH_PLACE = createField("BIRTH_PLACE", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>SANDDB.STUDENT</code> table reference
     */
    public Student() {
        this(DSL.name("STUDENT"), null);
    }

    /**
     * Create an aliased <code>SANDDB.STUDENT</code> table reference
     */
    public Student(String alias) {
        this(DSL.name(alias), STUDENT);
    }

    /**
     * Create an aliased <code>SANDDB.STUDENT</code> table reference
     */
    public Student(Name alias) {
        this(alias, STUDENT);
    }

    private Student(Name alias, Table<StudentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Student(Name alias, Table<StudentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Student(Table<O> child, ForeignKey<O, StudentRecord> key) {
        super(child, key, STUDENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sanddb.SANDDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYS_C005109);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StudentRecord> getPrimaryKey() {
        return Keys.SYS_C005109;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StudentRecord>> getKeys() {
        return Arrays.<UniqueKey<StudentRecord>>asList(Keys.SYS_C005109);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StudentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StudentRecord, ?>>asList(Keys.STUDENT_FK0, Keys.STUDENT_FK1, Keys.PARTICIPANT_FK0);
    }

    public Room room() {
        return new Room(this, Keys.STUDENT_FK0);
    }

    public FormEducation formEducation() {
        return new FormEducation(this, Keys.STUDENT_FK1);
    }

    public TypePosition typePosition() {
        return new TypePosition(this, Keys.PARTICIPANT_FK0);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student as(String alias) {
        return new Student(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student as(Name alias) {
        return new Student(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(String name) {
        return new Student(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Student rename(Name name) {
        return new Student(name, null);
    }
}
