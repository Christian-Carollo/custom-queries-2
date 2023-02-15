package co.develhope.customqueries2.repositories;

import co.develhope.customqueries2.entities.Flight;
import co.develhope.customqueries2.entities.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight,Long> {


    @Query(value = "SELECT u FROM Flight u WHERE u.status = ?1 OR u.status = ?2")
    public List<Flight> getCustomFlight(FlightStatus p1, FlightStatus p2);


    public List<Flight> findAllByStatus(FlightStatus status);
}
