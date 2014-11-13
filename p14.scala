object p14
{
    def duplicate[A](ls:List[A]):List[A] = ls match
    {
        case Nil => Nil
        case h :: tail => h :: h :: duplicate(tail)
    }
}
