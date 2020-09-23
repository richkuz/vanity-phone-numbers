require_relative 'vanity/constants.rb'

module Vanity
  def self.find_number(word)
    num = ''
    word.split('').each do |c|
      num += '2' if c == 'a' || c == 'b' || c == 'c'
      num += '3' if c == 'd' || c == 'e' || c == 'f'
      num += '4' if c == 'g' || c == 'h' || c == 'i'
      num += '5' if c == 'j' || c == 'k' || c == 'l'
      num += '6' if c == 'm' || c == 'n' || c == 'o'
      num += '7' if c == 'p' || c == 'q' || c == 'r' || c == 's'
      num += '8' if c == 't' || c == 'u' || c == 'v'
      num += '9' if c == 'w' || c == 'x' || c == 'y' || c == 'z'
    end
  end
end
puts Vanity::find_number("example")
