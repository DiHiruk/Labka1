package ua.kpi.its.lab.data.repo

import org.springframework.data.jpa.repository.JpaRepository
import ua.kpi.its.lab.data.entity.Hospital
import ua.kpi.its.lab.data.entity.Medicine

interface HospitalRepository : JpaRepository<Hospital, Long> {
    // додаткові методи, якщо потрібно
}

interface MedicineRepository : JpaRepository<Medicine, Long> {
    // додаткові методи, якщо потрібно
}
