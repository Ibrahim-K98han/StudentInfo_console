package model

class Department(val deptName:String, val deptHead:String) {
    override fun toString(): String {
        return "Department(deptName='$deptName', deptHead='$deptHead')"
    }
}