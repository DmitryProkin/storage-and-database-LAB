/*
 * This file is generated by jOOQ.
 */
package com.sadb.generated.dest.oracle;


import com.sadb.generated.dest.oracle.tables.AcademicYear;
import com.sadb.generated.dest.oracle.tables.Block;
import com.sadb.generated.dest.oracle.tables.ClassRoom;
import com.sadb.generated.dest.oracle.tables.Conference;
import com.sadb.generated.dest.oracle.tables.Db;
import com.sadb.generated.dest.oracle.tables.Discipline;
import com.sadb.generated.dest.oracle.tables.Dormitory;
import com.sadb.generated.dest.oracle.tables.EventType;
import com.sadb.generated.dest.oracle.tables.Events;
import com.sadb.generated.dest.oracle.tables.Faculty;
import com.sadb.generated.dest.oracle.tables.FacultyLecturer;
import com.sadb.generated.dest.oracle.tables.FormEducation;
import com.sadb.generated.dest.oracle.tables.Groups;
import com.sadb.generated.dest.oracle.tables.Lecturer;
import com.sadb.generated.dest.oracle.tables.Megafaculty;
import com.sadb.generated.dest.oracle.tables.Occupation;
import com.sadb.generated.dest.oracle.tables.OdevityWeek;
import com.sadb.generated.dest.oracle.tables.ProgramTrack;
import com.sadb.generated.dest.oracle.tables.Publications;
import com.sadb.generated.dest.oracle.tables.ReaderSheet;
import com.sadb.generated.dest.oracle.tables.Results;
import com.sadb.generated.dest.oracle.tables.Room;
import com.sadb.generated.dest.oracle.tables.ScientificProject;
import com.sadb.generated.dest.oracle.tables.Speciality;
import com.sadb.generated.dest.oracle.tables.Student;
import com.sadb.generated.dest.oracle.tables.SyncLog;
import com.sadb.generated.dest.oracle.tables.TimeTable;
import com.sadb.generated.dest.oracle.tables.TypeEdition;
import com.sadb.generated.dest.oracle.tables.TypePosition;
import com.sadb.generated.dest.oracle.tables.TypePublication;
import com.sadb.generated.dest.oracle.tables.VariantOccupation;
import com.sadb.generated.dest.oracle.tables.WeekDay;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>SANDDB</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index XPK_ACADEMIC_YEAR = Indexes0.XPK_ACADEMIC_YEAR;
    public static final Index BLOCK_PK = Indexes0.BLOCK_PK;
    public static final Index XPK_CLASS_ROOM = Indexes0.XPK_CLASS_ROOM;
    public static final Index SYS_C005172 = Indexes0.SYS_C005172;
    public static final Index SYS_C005372 = Indexes0.SYS_C005372;
    public static final Index XPK_DISCIPLINE = Indexes0.XPK_DISCIPLINE;
    public static final Index DORMITORY_PK = Indexes0.DORMITORY_PK;
    public static final Index EVENTS_PK = Indexes0.EVENTS_PK;
    public static final Index EVENT_TYPE_PK = Indexes0.EVENT_TYPE_PK;
    public static final Index XPK_FAC = Indexes0.XPK_FAC;
    public static final Index XPK_FAC_LECTUR = Indexes0.XPK_FAC_LECTUR;
    public static final Index FORM_EDUCATION_PK = Indexes0.FORM_EDUCATION_PK;
    public static final Index XPK_GROUP = Indexes0.XPK_GROUP;
    public static final Index XPK_LECTURER = Indexes0.XPK_LECTURER;
    public static final Index XPK_MFAC = Indexes0.XPK_MFAC;
    public static final Index XPK_OCCUPATION = Indexes0.XPK_OCCUPATION;
    public static final Index XPK_ODEVITY_WEEK = Indexes0.XPK_ODEVITY_WEEK;
    public static final Index XPK_PROGRAM_TRACK = Indexes0.XPK_PROGRAM_TRACK;
    public static final Index SYS_C005186 = Indexes0.SYS_C005186;
    public static final Index SYS_C005210 = Indexes0.SYS_C005210;
    public static final Index XPK_RESULTS = Indexes0.XPK_RESULTS;
    public static final Index ROOM_PK = Indexes0.ROOM_PK;
    public static final Index SYS_C005202 = Indexes0.SYS_C005202;
    public static final Index XPK_PROGR_SPECIALITY = Indexes0.XPK_PROGR_SPECIALITY;
    public static final Index SYS_C005109 = Indexes0.SYS_C005109;
    public static final Index SYS_C005369 = Indexes0.SYS_C005369;
    public static final Index XPK_TIME_TABLE = Indexes0.XPK_TIME_TABLE;
    public static final Index SYS_C005191 = Indexes0.SYS_C005191;
    public static final Index SYS_C005165 = Indexes0.SYS_C005165;
    public static final Index SYS_C005196 = Indexes0.SYS_C005196;
    public static final Index XPK_ARIANT_OCC = Indexes0.XPK_ARIANT_OCC;
    public static final Index XPK_WEEK_DAY = Indexes0.XPK_WEEK_DAY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index XPK_ACADEMIC_YEAR = Internal.createIndex("XPK_ACADEMIC_YEAR", AcademicYear.ACADEMIC_YEAR, new OrderField[] { AcademicYear.ACADEMIC_YEAR.ACADEM_YEAR_ID }, true);
        public static Index BLOCK_PK = Internal.createIndex("BLOCK_PK", Block.BLOCK, new OrderField[] { Block.BLOCK.ID }, true);
        public static Index XPK_CLASS_ROOM = Internal.createIndex("XPK_CLASS_ROOM", ClassRoom.CLASS_ROOM, new OrderField[] { ClassRoom.CLASS_ROOM.CLASS_ID }, true);
        public static Index SYS_C005172 = Internal.createIndex("SYS_C005172", Conference.CONFERENCE, new OrderField[] { Conference.CONFERENCE.ID }, true);
        public static Index SYS_C005372 = Internal.createIndex("SYS_C005372", Db.DB, new OrderField[] { Db.DB.ID }, true);
        public static Index XPK_DISCIPLINE = Internal.createIndex("XPK_DISCIPLINE", Discipline.DISCIPLINE, new OrderField[] { Discipline.DISCIPLINE.DISCIPLINE_ID }, true);
        public static Index DORMITORY_PK = Internal.createIndex("DORMITORY_PK", Dormitory.DORMITORY, new OrderField[] { Dormitory.DORMITORY.ID }, true);
        public static Index EVENTS_PK = Internal.createIndex("EVENTS_PK", Events.EVENTS, new OrderField[] { Events.EVENTS.ID }, true);
        public static Index EVENT_TYPE_PK = Internal.createIndex("EVENT_TYPE_PK", EventType.EVENT_TYPE, new OrderField[] { EventType.EVENT_TYPE.ID }, true);
        public static Index XPK_FAC = Internal.createIndex("XPK_FAC", Faculty.FACULTY, new OrderField[] { Faculty.FACULTY.FAC_ID }, true);
        public static Index XPK_FAC_LECTUR = Internal.createIndex("XPK_FAC_LECTUR", FacultyLecturer.FACULTY_LECTURER, new OrderField[] { FacultyLecturer.FACULTY_LECTURER.FAC_LECT_ID }, true);
        public static Index FORM_EDUCATION_PK = Internal.createIndex("FORM_EDUCATION_PK", FormEducation.FORM_EDUCATION, new OrderField[] { FormEducation.FORM_EDUCATION.ID }, true);
        public static Index XPK_GROUP = Internal.createIndex("XPK_GROUP", Groups.GROUPS, new OrderField[] { Groups.GROUPS.GROUP_ID }, true);
        public static Index XPK_LECTURER = Internal.createIndex("XPK_LECTURER", Lecturer.LECTURER, new OrderField[] { Lecturer.LECTURER.LEC_ID }, true);
        public static Index XPK_MFAC = Internal.createIndex("XPK_MFAC", Megafaculty.MEGAFACULTY, new OrderField[] { Megafaculty.MEGAFACULTY.MEGAFAC_ID }, true);
        public static Index XPK_OCCUPATION = Internal.createIndex("XPK_OCCUPATION", Occupation.OCCUPATION, new OrderField[] { Occupation.OCCUPATION.OCCUPATION_ID }, true);
        public static Index XPK_ODEVITY_WEEK = Internal.createIndex("XPK_ODEVITY_WEEK", OdevityWeek.ODEVITY_WEEK, new OrderField[] { OdevityWeek.ODEVITY_WEEK.ODEVITY_ID }, true);
        public static Index XPK_PROGRAM_TRACK = Internal.createIndex("XPK_PROGRAM_TRACK", ProgramTrack.PROGRAM_TRACK, new OrderField[] { ProgramTrack.PROGRAM_TRACK.PROG_ID }, true);
        public static Index SYS_C005186 = Internal.createIndex("SYS_C005186", Publications.PUBLICATIONS, new OrderField[] { Publications.PUBLICATIONS.ID }, true);
        public static Index SYS_C005210 = Internal.createIndex("SYS_C005210", ReaderSheet.READER_SHEET, new OrderField[] { ReaderSheet.READER_SHEET.ID }, true);
        public static Index XPK_RESULTS = Internal.createIndex("XPK_RESULTS", Results.RESULTS, new OrderField[] { Results.RESULTS.RESULT_ID }, true);
        public static Index ROOM_PK = Internal.createIndex("ROOM_PK", Room.ROOM, new OrderField[] { Room.ROOM.ID }, true);
        public static Index SYS_C005202 = Internal.createIndex("SYS_C005202", ScientificProject.SCIENTIFIC_PROJECT, new OrderField[] { ScientificProject.SCIENTIFIC_PROJECT.ID }, true);
        public static Index XPK_PROGR_SPECIALITY = Internal.createIndex("XPK_PROGR_SPECIALITY", Speciality.SPECIALITY, new OrderField[] { Speciality.SPECIALITY.SPEC_ID }, true);
        public static Index SYS_C005109 = Internal.createIndex("SYS_C005109", Student.STUDENT, new OrderField[] { Student.STUDENT.ID }, true);
        public static Index SYS_C005369 = Internal.createIndex("SYS_C005369", SyncLog.SYNC_LOG, new OrderField[] { SyncLog.SYNC_LOG.ID }, true);
        public static Index XPK_TIME_TABLE = Internal.createIndex("XPK_TIME_TABLE", TimeTable.TIME_TABLE, new OrderField[] { TimeTable.TIME_TABLE.OCCUPATION_ID, TimeTable.TIME_TABLE.WEEK_DAY_ID, TimeTable.TIME_TABLE.ODEVITY_ID, TimeTable.TIME_TABLE.VARIANT_OCCUPATION_ID, TimeTable.TIME_TABLE.CLASS_ID, TimeTable.TIME_TABLE.GROUP_ID, TimeTable.TIME_TABLE.DISCIPLINE_ID }, true);
        public static Index SYS_C005191 = Internal.createIndex("SYS_C005191", TypeEdition.TYPE_EDITION, new OrderField[] { TypeEdition.TYPE_EDITION.ID }, true);
        public static Index SYS_C005165 = Internal.createIndex("SYS_C005165", TypePosition.TYPE_POSITION, new OrderField[] { TypePosition.TYPE_POSITION.ID }, true);
        public static Index SYS_C005196 = Internal.createIndex("SYS_C005196", TypePublication.TYPE_PUBLICATION, new OrderField[] { TypePublication.TYPE_PUBLICATION.ID }, true);
        public static Index XPK_ARIANT_OCC = Internal.createIndex("XPK_ARIANT_OCC", VariantOccupation.VARIANT_OCCUPATION, new OrderField[] { VariantOccupation.VARIANT_OCCUPATION.VARIANT_OCCUPATION_ID }, true);
        public static Index XPK_WEEK_DAY = Internal.createIndex("XPK_WEEK_DAY", WeekDay.WEEK_DAY, new OrderField[] { WeekDay.WEEK_DAY.WEEK_DAY_ID }, true);
    }
}
