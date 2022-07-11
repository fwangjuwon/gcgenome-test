package site.metacoding.gcgenometest.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    @Query(value = "SELECT * FROM staff WHERE departmentCode = :departmentCode AND teamposition = :teamposition AND closingDate = :closingDate ", nativeQuery = true)
    List<Staff> mFind(String departmentCode, String teampoisition, Date closingDate);

}
