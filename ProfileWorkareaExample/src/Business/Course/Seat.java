/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

/**
 *
 * @author maxwellsowell
 */
public class Seat {
    
    Boolean occupied;
    CourseOffer courseoffer;
    SeatAssignment seatassignment;

    public Seat(CourseOffer co, SeatAssignment sa) {
        this.courseoffer = co;
        this.seatassignment = sa;
    }

    public CourseOffer getCourseOffer() {
        return courseoffer;
    }

    public void setCourseOffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }

    
    public SeatAssignment getSeatAssignment() {
        return seatassignment;
    }

    public void setSeatAssignment(SeatAssignment seatassignment) {
        this.seatassignment = seatassignment;
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    
    public int getCourseCredits(){
        return courseoffer.getCreditHours();
    }
    
    @Override
    public String toString() {
        return courseoffer.toString();
    }

    SeatAssignment newSeatAssignment(CourseLoad aThis) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
