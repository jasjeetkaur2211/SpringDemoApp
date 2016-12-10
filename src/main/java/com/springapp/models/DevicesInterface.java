package com.springapp.models;

import java.sql.Time;

/**
 * Created by kaushik on 06-Dec-16.
 */
 interface DevicesInterface {
     String getName();
}

interface GenericObject{
    String getId();
    String getDescription();

}
 interface ObjectStates extends GenericObject{
    String getObjectId();

}

interface UserActivities extends GenericObject{
     String getLatestActivity();
     Time getLatestActivityTime();

}

/*
TODO
enums for states?

 */