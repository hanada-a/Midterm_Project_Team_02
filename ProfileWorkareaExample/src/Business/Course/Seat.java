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
    
    @Override
    public String toString() {
        return courseoffer.toString();
    }
    
}
