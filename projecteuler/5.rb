def divisible?(n)
  div = true

  1.upto(20) do |d|
    if n % d > 0
      div = false
      break
    end
  end

  div
end

number = 1

while (divisible?(number) == false)
  number += 1
end

puts number