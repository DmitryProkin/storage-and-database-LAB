/*
 * This file is generated by jOOQ.
 */
package com.SADB.Entities.Exampe;


import com.SADB.Entities.Exampe.tables.Car;
import com.SADB.Entities.Exampe.tables.records.CarRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CarRecord, Long> IDENTITY_CAR = Identities0.IDENTITY_CAR;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CarRecord> CAR_PKEY = UniqueKeys0.CAR_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<CarRecord, Long> IDENTITY_CAR = Internal.createIdentity(Car.CAR, Car.CAR.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<CarRecord> CAR_PKEY = Internal.createUniqueKey(Car.CAR, "car_pkey", Car.CAR.ID);
    }
}