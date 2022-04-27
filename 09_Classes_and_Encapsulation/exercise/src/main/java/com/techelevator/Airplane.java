package com.techelevator;

public class Airplane {

    private String planeNumber;
    private int bookedFirstClassSeats = 0;
    private int totalFirstClassSeats;
    private int availableFirstClassSeats;
    private int bookedCoachSeats = 0;
    private int availableCoachSeats;
    private int totalCoachSeats;


    //constructors
// people need to see first class seat calculated
    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalCoachSeats= totalCoachSeats;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.availableFirstClassSeats = totalFirstClassSeats;
        this.availableCoachSeats = totalCoachSeats;


    }
    public String getPlaneNumber() {
        return planeNumber;
    }
    public int getAvailableFirstClassSeats() {
        return  availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
    }
    public int getAvailableCoachSeats() {
        return  totalCoachSeats -  bookedCoachSeats;
    }
    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }
    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }
    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }
    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }
    public int getAvailableCoachSets() {
        availableCoachSeats = totalCoachSeats - bookedCoachSeats ;
        return availableCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {

        if (forFirstClass == true) {
            if (availableFirstClassSeats - totalNumberOfSeats >= 0) {
                bookedFirstClassSeats += totalNumberOfSeats;
                availableFirstClassSeats -= totalNumberOfSeats;
                return true;
            } else {
                return false;
            }
        } else {


            if (availableCoachSeats - totalNumberOfSeats >= 0) {
                bookedCoachSeats =+ totalNumberOfSeats;
                availableCoachSeats -= totalNumberOfSeats;
                return true;
            } else {
                return false;
            }
        }
    }
}