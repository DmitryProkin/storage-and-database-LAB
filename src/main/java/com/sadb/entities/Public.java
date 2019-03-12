/*
 * This file is generated by jOOQ.
 */
package com.sadb.entities;


import com.sadb.entities.tables.AcademicYear;
import com.sadb.entities.tables.Block;
import com.sadb.entities.tables.ClassRoom;
import com.sadb.entities.tables.Conference;
import com.sadb.entities.tables.Discipline;
import com.sadb.entities.tables.Dormitory;
import com.sadb.entities.tables.EventType;
import com.sadb.entities.tables.Events;
import com.sadb.entities.tables.Faculty;
import com.sadb.entities.tables.FacultyLecturer;
import com.sadb.entities.tables.FormEducation;
import com.sadb.entities.tables.Groups;
import com.sadb.entities.tables.Lecturer;
import com.sadb.entities.tables.ListParticipant;
import com.sadb.entities.tables.ListParticipantProject;
import com.sadb.entities.tables.Megafaculty;
import com.sadb.entities.tables.Occupation;
import com.sadb.entities.tables.OdevityWeek;
import com.sadb.entities.tables.ProgramTrack;
import com.sadb.entities.tables.Publications;
import com.sadb.entities.tables.ReaderSheet;
import com.sadb.entities.tables.Results;
import com.sadb.entities.tables.Room;
import com.sadb.entities.tables.ScientificProject;
import com.sadb.entities.tables.Speciality;
import com.sadb.entities.tables.Student;
import com.sadb.entities.tables.TimeTable;
import com.sadb.entities.tables.TypeEdition;
import com.sadb.entities.tables.TypePosition;
import com.sadb.entities.tables.TypePublication;
import com.sadb.entities.tables.VariantOccupation;
import com.sadb.entities.tables.WeekDay;

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
    public final AcademicYear ACADEMIC_YEAR = com.sadb.entities.tables.AcademicYear.ACADEMIC_YEAR;

    /**
     * The table <code>public.block</code>.
     */
    public final Block BLOCK = com.sadb.entities.tables.Block.BLOCK;

    /**
     * The table <code>public.class_room</code>.
     */
    public final ClassRoom CLASS_ROOM = com.sadb.entities.tables.ClassRoom.CLASS_ROOM;

    /**
     * The table <code>public.conference</code>.
     */
    public final Conference CONFERENCE = com.sadb.entities.tables.Conference.CONFERENCE;

    /**
     * The table <code>public.discipline</code>.
     */
    public final Discipline DISCIPLINE = com.sadb.entities.tables.Discipline.DISCIPLINE;

    /**
     * The table <code>public.dormitory</code>.
     */
    public final Dormitory DORMITORY = com.sadb.entities.tables.Dormitory.DORMITORY;

    /**
     * The table <code>public.event_type</code>.
     */
    public final EventType EVENT_TYPE = com.sadb.entities.tables.EventType.EVENT_TYPE;

    /**
     * The table <code>public.events</code>.
     */
    public final Events EVENTS = com.sadb.entities.tables.Events.EVENTS;

    /**
     * The table <code>public.faculty</code>.
     */
    public final Faculty FACULTY = com.sadb.entities.tables.Faculty.FACULTY;

    /**
     * The table <code>public.faculty_lecturer</code>.
     */
    public final FacultyLecturer FACULTY_LECTURER = com.sadb.entities.tables.FacultyLecturer.FACULTY_LECTURER;

    /**
     * The table <code>public.form_education</code>.
     */
    public final FormEducation FORM_EDUCATION = com.sadb.entities.tables.FormEducation.FORM_EDUCATION;

    /**
     * The table <code>public.groups</code>.
     */
    public final Groups GROUPS = com.sadb.entities.tables.Groups.GROUPS;

    /**
     * The table <code>public.lecturer</code>.
     */
    public final Lecturer LECTURER = com.sadb.entities.tables.Lecturer.LECTURER;

    /**
     * The table <code>public.list_participant</code>.
     */
    public final ListParticipant LIST_PARTICIPANT = com.sadb.entities.tables.ListParticipant.LIST_PARTICIPANT;

    /**
     * The table <code>public.list_participant_project</code>.
     */
    public final ListParticipantProject LIST_PARTICIPANT_PROJECT = com.sadb.entities.tables.ListParticipantProject.LIST_PARTICIPANT_PROJECT;

    /**
     * The table <code>public.megafaculty</code>.
     */
    public final Megafaculty MEGAFACULTY = com.sadb.entities.tables.Megafaculty.MEGAFACULTY;

    /**
     * The table <code>public.occupation</code>.
     */
    public final Occupation OCCUPATION = com.sadb.entities.tables.Occupation.OCCUPATION;

    /**
     * The table <code>public.odevity_week</code>.
     */
    public final OdevityWeek ODEVITY_WEEK = com.sadb.entities.tables.OdevityWeek.ODEVITY_WEEK;

    /**
     * The table <code>public.program_track</code>.
     */
    public final ProgramTrack PROGRAM_TRACK = com.sadb.entities.tables.ProgramTrack.PROGRAM_TRACK;

    /**
     * The table <code>public.publications</code>.
     */
    public final Publications PUBLICATIONS = com.sadb.entities.tables.Publications.PUBLICATIONS;

    /**
     * The table <code>public.reader_sheet</code>.
     */
    public final ReaderSheet READER_SHEET = com.sadb.entities.tables.ReaderSheet.READER_SHEET;

    /**
     * The table <code>public.results</code>.
     */
    public final Results RESULTS = com.sadb.entities.tables.Results.RESULTS;

    /**
     * The table <code>public.room</code>.
     */
    public final Room ROOM = com.sadb.entities.tables.Room.ROOM;

    /**
     * The table <code>public.scientific_project</code>.
     */
    public final ScientificProject SCIENTIFIC_PROJECT = com.sadb.entities.tables.ScientificProject.SCIENTIFIC_PROJECT;

    /**
     * The table <code>public.speciality</code>.
     */
    public final Speciality SPECIALITY = com.sadb.entities.tables.Speciality.SPECIALITY;

    /**
     * The table <code>public.student</code>.
     */
    public final Student STUDENT = com.sadb.entities.tables.Student.STUDENT;

    /**
     * The table <code>public.time_table</code>.
     */
    public final TimeTable TIME_TABLE = com.sadb.entities.tables.TimeTable.TIME_TABLE;

    /**
     * The table <code>public.type_edition</code>.
     */
    public final TypeEdition TYPE_EDITION = com.sadb.entities.tables.TypeEdition.TYPE_EDITION;

    /**
     * The table <code>public.type_position</code>.
     */
    public final TypePosition TYPE_POSITION = com.sadb.entities.tables.TypePosition.TYPE_POSITION;

    /**
     * The table <code>public.type_publication</code>.
     */
    public final TypePublication TYPE_PUBLICATION = com.sadb.entities.tables.TypePublication.TYPE_PUBLICATION;

    /**
     * The table <code>public.variant_occupation</code>.
     */
    public final VariantOccupation VARIANT_OCCUPATION = com.sadb.entities.tables.VariantOccupation.VARIANT_OCCUPATION;

    /**
     * The table <code>public.week_day</code>.
     */
    public final WeekDay WEEK_DAY = com.sadb.entities.tables.WeekDay.WEEK_DAY;

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