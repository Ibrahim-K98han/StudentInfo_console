package tempdb

import model.Course
import model.Department

val departmentList = listOf<Department>(
    Department("CSE","ABC"),
    Department("BBA","DEF"),
    Department("EEE","GHI"),
    Department("CIVIL","JKL")
)
val detCourseList = mapOf(
    "CSE" to listOf(
        Course("OOP",3.0),
        Course("Android",4.0),
        Course("English",3.0),
    ),
    "BBA" to listOf(
        Course("Acounting",3.0),
        Course("Finance",4.0),
        Course("Math",3.0),
    ),
    "EEE" to listOf(
        Course("Circute",3.0),
        Course("Analog Single",4.0),
        Course("English",3.0),
    ),
    "CIVIL" to listOf(
        Course("ABC",3.0),
        Course("DEF",4.0),
        Course("English",3.0),
    ),
)