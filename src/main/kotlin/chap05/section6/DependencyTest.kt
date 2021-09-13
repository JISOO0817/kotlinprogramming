package chap05.section6

import javax.print.Doc

class Patient1(val name: String, var id: Int) {
    fun doctorList(d: Doctor) {
        println("Patient: ${name}, Doctor: ${d.name}")
    }
}

class Doctor1(val name: String, val p : Patient1) {
    val customerId : Int = p.id

    fun patientList() {
        println("Doctor: ${name}, Patient: ${p.name}")
        println("Patient Id: ${customerId}")
    }
}

fun main() {
    val patient11 = Patient1("kildong",1234)
    val doc1 = Doctor1("kimsabu",patient11)
    doc1.patientList()
}