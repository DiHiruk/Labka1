package ua.kpi.its.lab.data

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import ua.kpi.its.lab.data.entity.Hospital
import ua.kpi.its.lab.data.entity.Medicine
import ua.kpi.its.lab.data.svc.impl.HospitalServiceImpl
import ua.kpi.its.lab.data.svc.impl.MedicineServiceImpl
import java.util.*

fun main() {
    val context = AnnotationConfigApplicationContext("ua.kpi.its.lab.data.config")
    val hospitalService = context.getBean(HospitalServiceImpl::class.java)
    val medicineService = context.getBean(MedicineServiceImpl::class.java)

    val h1 = Hospital(
        name = "Floral Freshness",
        address = "22 Orchard Rd",
        profile = "Alex",
        OpenDate = Date(),
        NumDepart = "1",
        NumPlace = "27",
        Child = true
    )
    val h2 = Hospital(
        name = "Elixir of Glow",
        address = "17 Queen St",
        profile = "Daphnie",
        OpenDate = Date(),
        NumDepart = "2",
        NumPlace = "22",
        Child = true
    )
    val h3 = Hospital(
        name = "Secret of Nature",
        address = "5 Fifth Ave",
        profile = "Damon",
        OpenDate = Date(),
        NumDepart = "3",
        NumPlace = "23",
        Child = true
    )
    val h4 = Hospital(
        name = "Magic of Care",
        address = "101 Collins St",
        profile = "Stefan",
        OpenDate = Date(),
        NumDepart = "4",
        NumPlace = "25",
        Child = true
    )
    val h5 = Hospital(
        name = "Eternal Youth",
        address = "23 Broadway",
        profile = "Melody",
        OpenDate = Date(),
        NumDepart = "5",
        NumPlace = "26",
        Child = true
    )

    val p1 = Medicine(
        name = "VitaCure",
        medform = "HealthTrack",
        manufacturer = "EcoCraft Creations",
        dateManufacture = Date(),
        shelfLife = "365",
        price = "187",
        presciptionrequired = true,
        hospital = h1
    )

    hospitalService.create(h1)
    hospitalService.create(h2)
    hospitalService.create(h3)
    hospitalService.create(h4)
    hospitalService.create(h5)
    medicineService.create(p1)

    println("Retrieved hospital: $h3")

    hospitalService.delete(4)
}
