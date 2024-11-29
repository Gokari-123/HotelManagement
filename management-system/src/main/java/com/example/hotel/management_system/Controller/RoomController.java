package com.example.hotel.management_system.Controller;

import com.example.hotel.management_system.Model.Room;
import com.example.hotel.management_system.ServicesImpl.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    RoomService roomService;

    @PostMapping
    public Room addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRoom();
    }

    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable Long id){
        return roomService.getRoomById(id);
    }
}
