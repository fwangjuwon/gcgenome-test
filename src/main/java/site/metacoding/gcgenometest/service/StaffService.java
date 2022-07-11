package site.metacoding.gcgenometest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.gcgenometest.domain.Staff;
import site.metacoding.gcgenometest.domain.StaffRepository;

@RequiredArgsConstructor
@Service
public class StaffService {

    private final StaffRepository staffRepository;

    // 3. JPA를 사용하여 전체 직원목록을 조회하는 코드를 작성해주세요.
    public List<Staff> 전체직원조회() {
        return staffRepository.findAll();
    }

    // 4. JPA를 사용하여 "해외사업개발팀"에 속한 "퇴사하지 않은" "팀장"의 정보를 얻는 코드를 작성해주세요.
    public List<Staff> 특정직원조회() {
        return staffRepository.mFind("OBD", "팀장", null);
    }

    // 5. JPA를 사용하여 신규 직원을 생성하고 특정 부서에 추가하는 함수를 코드로 작성해주세요.
    @Transactional
    public void 직원추가(Staff staff) {
        staffRepository.save(staff);
    }

}
