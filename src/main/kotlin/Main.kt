import model.Course
import model.Department
import model.Student
import tempdb.departmentList
import java.util.Scanner

fun main (){

    var scanner = Scanner(System.`in`)
    val studentList = mutableListOf<Student>()
    println("Student Registration Form")
    println("-----------------------------")
    print("How Many Students? ")
    val count = scanner.nextInt()

        for (i in 1..count){
            print("First Name: ")
            val fName = scanner.next()
            println("Last Name : ")
            val lName = scanner.next()
            println("Select Department : ")
            print("1.CSE\t 2.BBA\t 3.EEE\t 4.CIVIL")
            val chose = scanner.nextInt()
            val deptName:String
            when(chose){
                1 ->{
                    deptName = "CSE"
                }
                2 ->{
                    deptName = "BBA"
                }
                3 ->{
                    deptName = "EEE"
                }
                4 ->{
                    deptName = "CIVIL"
                }
            }
        }


}

