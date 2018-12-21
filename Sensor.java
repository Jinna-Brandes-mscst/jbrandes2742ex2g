package edu.southeastmn.jbrandes2742ex2g;

import java.util.ArrayList;
import java.util.Objects;
@SuppressWarnings("Duplicates")

public class Sensor {
    private int sensorId;
    private int roomId;
    private int sensorTypeId;
    private String description;
//    private Room room;
//    private SensorType sensorType;
    private ArrayList<SensorReading> sensorReadings;

    public Sensor(int sensorId, int roomId, int sensorTypeId, String description) {
        this.sensorId = sensorId;
        this.roomId = roomId;
        this.sensorTypeId = sensorTypeId;
        this.description = description;
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getSensorTypeId() {
        return sensorTypeId;
    }

    public void setSensorTypeId(int sensorTypeId) {
        this.sensorTypeId = sensorTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public domain.Room getRoom() {
//        return room;
//    }
//
//    public void setRoom(domain.Room room) {
//        this.room = room;
//    }
//
//    public domain.SensorType getSensorType() {
//        return sensorType;
//    }

//    public void setSensorType(domain.SensorType sensorType) {
//        this.sensorType = sensorType;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sensor)) return false;
        Sensor sensor = (Sensor) o;
        return sensorId == sensor.sensorId &&
                roomId == sensor.roomId &&
                sensorTypeId == sensor.sensorTypeId &&
                Objects.equals(description, sensor.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensorId, roomId, sensorTypeId, description);
    }

    @Override
    public String toString() {
        return Integer.toString(sensorId) +
                ", roomId=" + roomId +
                ", sensorTypeId=" + sensorTypeId +
                ", " + description;
    }

    public ArrayList<SensorReading> getSensorReadings() {
        return sensorReadings;
    }

    public void setSensorReadings(ArrayList<SensorReading> sensorReadings) {
        this.sensorReadings = sensorReadings;
    }

    public int findMinReadingIndex() {
        if (sensorReadings.get(0) != null) ;
        sensorReadings.get(0);
        int minIndex = 0;
        for (int i = 1; i < sensorReadings.size(); i++) {
            if (this.sensorReadings.get(minIndex).getValue() > this.sensorReadings.get(i).getValue())
                minIndex = i;
        }

        return minIndex;
    }

    public int findMinReadingIndex1(int startIndex, int endIndex) {
        if (sensorReadings.get(startIndex) != null || sensorReadings.get(endIndex) != null)
            sensorReadings.get(startIndex);
//            sensorReadings.get(endIndex);
        int minIndex = startIndex;
        sensorReadings.get(startIndex);
        sensorReadings.get(endIndex);

        for (int i = minIndex; i < sensorReadings.size(); i++) {
            if (i >= startIndex && i <= endIndex) {
                if (this.sensorReadings.get(minIndex).getValue() > this.sensorReadings.get(i).getValue())
                    minIndex = i;
            }
        }
        return minIndex;
    }

    public int findMaxReadingIndex2() {
        if (sensorReadings.get(0) != null) ;
        sensorReadings.get(0);
        int maxIndex = 0;
        for (int i = 1; i < sensorReadings.size(); i++) {
            if (this.sensorReadings.get(maxIndex).getValue() < this.sensorReadings.get(i).getValue())
                maxIndex = i;
        }
        return maxIndex;
    }

    public int findMaxReadingIndex3(int startIndex, int endIndex) {
        if (sensorReadings.get(startIndex) != null || sensorReadings.get(endIndex) != null)
            sensorReadings.get(startIndex);
        int maxIndex = startIndex;
//        sensorReadings.get(startIndex);
        sensorReadings.get(endIndex);
        for (int i = maxIndex; i < endIndex; i++) {
            if (i >= startIndex && i <= endIndex) {
                if (this.sensorReadings.get(maxIndex).getValue() < this.sensorReadings.get(i).getValue())
                    maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int findMinReadingIndex4(int startIndex, int endIndex) {
        int minIndex = 0;
        sensorReadings.get(6);
        sensorReadings.get(1000);
        if (startIndex < 0 || endIndex < 0 || endIndex >= this.sensorReadings.size()-1)
            throw new IndexOutOfBoundsException("Index out of bounds: 0 - " + (this.sensorReadings.size() - 1));

        else
            for (int i = minIndex; i < sensorReadings.size(); i++) {
                if (i >= startIndex && i <= endIndex) {
                    if (this.sensorReadings.get(minIndex).getValue() < this.sensorReadings.get(i).getValue())
                        minIndex = i;
                }
            }
        return minIndex;
    }

    public int findMaxReadingIndex5 (int startIndex, int endIndex)throws IndexOutOfBoundsException {
        int maxIndex = 0;
        sensorReadings.get(-1);
        sensorReadings.get(18);
        if (startIndex < 0 || endIndex < 0 || endIndex >= this.sensorReadings.size()-1)
            throw new IndexOutOfBoundsException ("Index out of bounds: 0 - " + (this.sensorReadings.size() - 1));

        else
            for (int i = maxIndex; i < sensorReadings.size(); i++) {
                if (i >= startIndex || i <= endIndex) {
                    if (this.sensorReadings.get(maxIndex).getValue() > this.sensorReadings.get(i).getValue())
                        maxIndex = i;
                }
            }
        return maxIndex;
    }

    public int findNextCycleMaxIndex (int startIndex) {
        SensorReading rMax = this.sensorReadings.get(startIndex);
        int i = startIndex + 1;

        for ( ; i < this.sensorReadings.size(); i++)  {
            if (rMax.getValue() < this.sensorReadings.get(i).getValue())
                rMax = this.sensorReadings.get(i);
            else
                break;
        }
        return i - 1;
    }

    public int findNextCycleMinIndex (int startIndex) {
        SensorReading rMin = this.sensorReadings.get(startIndex);
        int i = startIndex + 1;

        for ( ; i < this.sensorReadings.size(); i++)  {
            if (rMin.getValue() > this.sensorReadings.get(i).getValue())
                rMin = this.sensorReadings.get(i);
            else
                break;
        }
        return i - 1;
    }
}