package site.metacoding.gcgenometest.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.gcgenometest.domain.Staff;
import site.metacoding.gcgenometest.service.StaffService;

@RequiredArgsConstructor
@RestController
public class StaffController {

    private final StaffService staffService;

    @GetMapping("/find-all")
    public List<Staff> findAll() {
        List<Staff> staffs = staffService.전체직원조회();
        return staffs;
    }

    @GetMapping("/find-staff")
    public List<Staff> findStaff() {
        List<Staff> findstaff = staffService.특정직원조회();
        return findstaff;
    }

    @PostMapping("/update-staff")
    public String update(Staff staff) {
        staffService.직원추가(staff);
        return null;
    }
}
