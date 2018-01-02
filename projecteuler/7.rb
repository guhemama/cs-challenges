require 'prime'

def nth_prime(nth)
  counter = 2
  current_prime = 0;
  current_number = 4

  while (counter < nth)
    if Prime.prime?(current_number)
      current_prime = current_number
      counter += 1
    end

    current_number += 1
  end

  current_prime
end

puts nth_prime(10001)