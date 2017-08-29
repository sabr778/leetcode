Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                ret.add("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                ret.add("Fizz");
            } else if (i % 5 ==0) {
                ret.add("Buzz");
            } else {
                ret.add(Integer.toString(i));
            }
        }
        return ret;
    }
}