package model

class Student(
    val firstName:String,
    val lastName:String,
    val department: Department,
    val courseList:List<Course>
    ){
    override fun toString(): String {
        return "Student(firstName='$firstName', lastName='$lastName', department=$department, courseList=$courseList)"
    }
}

