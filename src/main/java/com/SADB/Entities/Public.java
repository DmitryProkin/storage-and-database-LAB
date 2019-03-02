/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities;


import com.SADB.Entities.tables.AcademicYear;
import com.SADB.Entities.tables.Block;
import com.SADB.Entities.tables.ClassRoom;
import com.SADB.Entities.tables.Conference;
import com.SADB.Entities.tables.Discipline;
import com.SADB.Entities.tables.Dormitory;
import com.SADB.Entities.tables.EventType;
import com.SADB.Entities.tables.Events;
import com.SADB.Entities.tables.Faculty;
import com.SADB.Entities.tables.FacultyLecturer;
import com.SADB.Entities.tables.FormEducation;
import com.SADB.Entities.tables.Groups;
import com.SADB.Entities.tables.Lecturer;
import com.SADB.Entities.tables.ListParticipant;
import com.SADB.Entities.tables.ListParticipantProject;
import com.SADB.Entities.tables.Megafaculty;
import com.SADB.Entities.tables.Occupation;
import com.SADB.Entities.tables.OdevityWeek;
import com.SADB.Entities.tables.ProgramTrack;
import com.SADB.Entities.tables.Publications;
import com.SADB.Entities.tables.ReaderSheet;
import com.SADB.Entities.tables.Results;
import com.SADB.Entities.tables.Room;
import com.SADB.Entities.tables.ScientificProject;
import com.SADB.Entities.tables.Speciality;
import com.SADB.Entities.tables.Student;
import com.SADB.Entities.tables.TimeTable;
import com.SADB.Entities.tables.TypeEdition;
import com.SADB.Entities.tables.TypePosition;
import com.SADB.Entities.tables.TypePublication;
import com.SADB.Entities.tables.VariantOccupation;
import com.SADB.Entities.tables.WeekDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1139662930;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.academic_year</code>.
     */
    public final AcademicYear ACADEMIC_YEAR = com.SADB.Entities.tables.AcademicYear.ACADEMIC_YEAR;

    /**
     * The table <code>public.block</code>.
     */
    public final Block BLOCK = com.SADB.Entities.tables.Block.BLOCK;

    /**
     * The table <code>public.class_room</code>.
     */
    public final ClassRoom CLASS_ROOM = com.SADB.Entities.tables.ClassRoom.CLASS_ROOM;

    /**
     * The table <code>public.conference</code>.
     */
    public final Conference CONFERENCE = com.SADB.Entities.tables.Conference.CONFERENCE;

    /**
     * The table <code>public.discipline</code>.
     */
    public final Discipline DISCIPLINE = com.SADB.Entities.tables.Discipline.DISCIPLINE;

    /**
     * The table <code>public.dormitory</code>.
     */
    public final Dormitory DORMITORY = com.SADB.Entities.tables.Dormitory.DORMITORY;

    /**
     * The table <code>public.event_type</code>.
     */
    public final EventType EVENT_TYPE = com.SADB.Entities.tables.EventType.EVENT_TYPE;

    /**
     * The table <code>public.events</code>.
     */
    public final Events EVENTS = com.SADB.Entities.tables.Events.EVENTS;

    /**
     * The table <code>public.faculty</code>.
     */
    public final Faculty FACULTY = com.SADB.Entities.tables.Faculty.FACULTY;

    /**
     * The table <code>public.faculty_lecturer</code>.
     */
    public final FacultyLecturer FACULTY_LECTURER = com.SADB.Entities.tables.FacultyLecturer.FACULTY_LECTURER;

    /**
     * The table <code>public.form_education</code>.
     */
    public final FormEducation FORM_EDUCATION = com.SADB.Entities.tables.FormEducation.FORM_EDUCATION;

    /**
     * The table <code>public.groups</code>.
     */
    public final Groups GROUPS = com.SADB.Entities.tables.Groups.GROUPS;

    /**
     * The table <code>public.lecturer</code>.
     */
    public final Lecturer LECTURER = com.SADB.Entities.tables.Lecturer.LECTURER;

    /**
     * The table <code>public.list_participant</code>.
     */
    public final ListParticipant LIST_PARTICIPANT = com.SADB.Entities.tables.ListParticipant.LIST_PARTICIPANT;

    /**
     * The table <code>public.list_participant_project</code>.
     */
    public final ListParticipantProject LIST_PARTICIPANT_PROJECT = com.SADB.Entities.tables.ListParticipantProject.LIST_PARTICIPANT_PROJECT;

    /**
     * The table <code>public.megafaculty</code>.
     */
    public final Megafaculty MEGAFACULTY = com.SADB.Entities.tables.Megafaculty.MEGAFACULTY;

    /**
     * The table <code>public.occupation</code>.
     */
    public final Occupation OCCUPATION = com.SADB.Entities.tables.Occupation.OCCUPATION;

    /**
     * The table <code>public.odevity_week</code>.
     */
    public final OdevityWeek ODEVITY_WEEK = com.SADB.Entities.tables.OdevityWeek.ODEVITY_WEEK;

    /**
     * The table <code>public.program_track</code>.
     */
    public final ProgramTrack PROGRAM_TRACK = com.SADB.Entities.tables.ProgramTrack.PROGRAM_TRACK;

    /**
     * The table <code>public.publications</code>.
     */
    public final Publications PUBLICATIONS = com.SADB.Entities.tables.Publications.PUBLICATIONS;

    /**
     * The table <code>public.reader_sheet</code>.
     */
    public final ReaderSheet READER_SHEET = com.SADB.Entities.tables.ReaderSheet.READER_SHEET;

    /**
     * The table <code>public.results</code>.
     */
    public final Results RESULTS = com.SADB.Entities.tables.Results.RESULTS;

    /**
     * The table <code>public.room</code>.
     */
    public final Room ROOM = com.SADB.Entities.tables.Room.ROOM;

    /**
     * The table <code>public.scientific_project</code>.
     */
    public final ScientificProject SCIENTIFIC_PROJECT = com.SADB.Entities.tables.ScientificProject.SCIENTIFIC_PROJECT;

    /**
     * The table <code>public.speciality</code>.
     */
    public final Speciality SPECIALITY = com.SADB.Entities.tables.Speciality.SPECIALITY;

    /**
     * The table <code>public.student</code>.
     */
    public final Student STUDENT = com.SADB.Entities.tables.Student.STUDENT;

    /**
     * The table <code>public.time_table</code>.
     */
    public final TimeTable TIME_TABLE = com.SADB.Entities.tables.TimeTable.TIME_TABLE;

    /**
     * The table <code>public.type_edition</code>.
     */
    public final TypeEdition TYPE_EDITION = com.SADB.Entities.tables.TypeEdition.TYPE_EDITION;

    /**
     * The table <code>public.type_position</code>.
     */
    public final TypePosition TYPE_POSITION = com.SADB.Entities.tables.TypePosition.TYPE_POSITION;

    /**
     * The table <code>public.type_publication</code>.
     */
    public final TypePublication TYPE_PUBLICATION = com.SADB.Entities.tables.TypePublication.TYPE_PUBLICATION;

    /**
     * The table <code>public.variant_occupation</code>.
     */
    public final VariantOccupation VARIANT_OCCUPATION = com.SADB.Entities.tables.VariantOccupation.VARIANT_OCCUPATION;

    /**
     * The table <code>public.week_day</code>.
     */
    public final WeekDay WEEK_DAY = com.SADB.Entities.tables.WeekDay.WEEK_DAY;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.BLOCK_ID_SEQ,
            Sequences.CONFERENCE_SEQ,
            Sequences.DORMITORY_ID_SEQ,
            Sequences.EVENT_TYPE_ID_SEQ,
            Sequences.EVENTS_ID_SEQ,
            Sequences.FORM_EDUCATION_ID_SEQ,
            Sequences.PUBLICATIONS_SEQ,
            Sequences.READER_SHEET_SEQ,
            Sequences.ROOM_ID_SEQ,
            Sequences.SCIENTIFIC_PROJECT_SEQ,
            Sequences.TYPE_EDITION_SEQ,
            Sequences.TYPE_POSITION_SEQ,
            Sequences.TYPE_PUBLICATION_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AcademicYear.ACADEMIC_YEAR,
            Block.BLOCK,
            ClassRoom.CLASS_ROOM,
            Conference.CONFERENCE,
            Discipline.DISCIPLINE,
            Dormitory.DORMITORY,
            EventType.EVENT_TYPE,
            Events.EVENTS,
            Faculty.FACULTY,
            FacultyLecturer.FACULTY_LECTURER,
            FormEducation.FORM_EDUCATION,
            Groups.GROUPS,
            Lecturer.LECTURER,
            ListParticipant.LIST_PARTICIPANT,
            ListParticipantProject.LIST_PARTICIPANT_PROJECT,
            Megafaculty.MEGAFACULTY,
            Occupation.OCCUPATION,
            OdevityWeek.ODEVITY_WEEK,
            ProgramTrack.PROGRAM_TRACK,
            Publications.PUBLICATIONS,
            ReaderSheet.READER_SHEET,
            Results.RESULTS,
            Room.ROOM,
            ScientificProject.SCIENTIFIC_PROJECT,
            Speciality.SPECIALITY,
            Student.STUDENT,
            TimeTable.TIME_TABLE,
            TypeEdition.TYPE_EDITION,
            TypePosition.TYPE_POSITION,
            TypePublication.TYPE_PUBLICATION,
            VariantOccupation.VARIANT_OCCUPATION,
            WeekDay.WEEK_DAY);
    }
}
