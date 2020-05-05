int findMissing(int A[], int n)
{
    Create a hash table H
    for(i = 0 to n-1)
        H[A[i]] = true
    for(i = 1 to n+1)
    {
        if(i not in H)
            return i
    }
}

Input: I (an input to the given problem) 
Output: J (a solution to problem for input I) 
Algorithm Divide-and-Conquer(I, J) 
    if I ∈ Known-Answers then 
        return J (a solution to I) 
    else 
        Divide I into m >= 2 disjoint sub-problems (I1, · · · , Im)
        for k = 1...m do 
            Divide-and-Conquer(Ik , Jk ) 
        Combine solutions (J1, · · · , Jm) into solution J 
        return J 
end