
// Reverse a List
object p5
{
    // Naive recursive
    def reverse[A](ls:List[A]):List[A] = ls match
    {
        case Nil => Nil
        case h :: t => reverse(t) ++ List(h)
    }

    // Tail Recursive
    def tailRecursiveR[A](ls:List[A]):List[A] =
    {
        // append the current head of the list to the built up results List
        def recurseList(res: List[A], currentList: List[A]):List[A] = currentList match
        {
            case Nil => res
            case h :: tail => recurseList(h :: res, tail)
        }

        recurseList(Nil, ls)
    }
}
