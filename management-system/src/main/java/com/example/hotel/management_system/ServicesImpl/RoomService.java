package com.example.hotel.management_system.ServicesImpl;

import com.example.hotel.management_system.Model.Room;
import com.example.hotel.management_system.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
   private RoomRepository roomRepository;

    public Room addRoom(Room room){
        return roomRepository.save(room);
    }

    public List<Room> getAllRoom(){
        return roomRepository.findAll();
    }
    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }
}