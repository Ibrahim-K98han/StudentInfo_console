package model

class Course(val courseName:String, val credit:Double) {
    override fun toString(): String {
        return "Course(courseName='$courseName', credit=$credit)"
    }
}