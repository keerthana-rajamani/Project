// package com.examly.springapp.controller;

// import org.springframework.web.bind.annotation.*;
// @RestController
// @RequestMapping("/admin")
// public class AdminUserController {
//     @GetMapping("/admin")
//     public void getAdmin()
//     {
        
//     }
//     @GetMapping("/users/{userId}")
//     public String getUser(@PathVariable Long userId)
//     {
//         return "Admin User"+userId;
//     }
// }
package com.examly.springapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/admin")
public class AdminUserController {
    @GetMapping("/admin")
    public void getAdmin()
    {
        
    }
    @GetMapping("/users/{userId}")
    public String getUser(@PathVariable Long userId)
    {
        return "Admin User"+userId;
    }
    @PostMapping("/create")
    public ResponseEntity<?> addAdmin(@RequestBody Map<String, Object> admin) {
        return ResponseEntity.ok(admin);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAdminById(@PathVariable Long id) {
        Map<String, Object> admin = new HashMap<>();
        admin.put("id", id);
        admin.put("username", "admin1");
        return ResponseEntity.ok(admin);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAdmin(@PathVariable Long id, @RequestBody Map<String, Object> admin) {
        return ResponseEntity.ok(admin);
    }

    @GetMapping
    public ResponseEntity<List<?>> getAllAdmins() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}

