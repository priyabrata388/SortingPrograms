
// Write a program to implement insertion sort
fun insertion_sort(a:Array<Int>){
    var n = a.size
    var i: Int
    for (j in 1 until 1){
        var key= a[j]
        i=j-1
        while(i>=0 && a[i]>key){
            a[i+1]=a[i]
            i--
        }
        a[i+1]=key
    }
}
fun main(args: Array<String>) {
    print("enter the number of element :")
    var n= readLine()!!.toInt()
    println("enter the elements")
    var a=Array(n,{0})
    for(i in 0 until n){
       a[i]= readLine()!!.toInt()
        insertion_sort(a)
        println("sorted array is : ")
        for (i in 0 until n)
            print("${a[i]} ")
    }
}