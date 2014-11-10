object p8
{
    // compress repeated sequences in a list
    def compress[A](ls:List[A]):List[A] = ls match
    {
        case Nil => Nil
        case h :: tail => h :: compress(tail.dropWhile(_ == h))
    }
}