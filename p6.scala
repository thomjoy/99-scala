// Find out if List is a palindrome
// i.e. palindrome(List(1,2,3,2,1)) = true
object p6
{
    def palindrome[A](ls:List[A]):Boolean =
    {
        // only palindromic if odd number of elements?
        if (ls.size % 2 == 0) false
        else
        {
            val midpoint: Int = (ls.size / 2) + 1
            val leftList = ls.take(midpoint - 1)
            val rightList = ls.takeRight(midpoint - 1)

            leftList == rightList.reverse
        }
    }

    def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse
}