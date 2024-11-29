package com.example.hotel.management_system.Repository;

import com.example.hotel.management_system.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
