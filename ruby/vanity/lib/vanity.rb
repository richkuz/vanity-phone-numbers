require_relative "vanity/constants.rb"
module Vanity
  def self.find_nber(word)
    n = ""
    word.split("").each do |c|
      n = n + "2" if c == "a" || c == "b" || c == "c"
      n = n + "3" if c == "d" || c == "e" || c == "f"
      n = n + "4" if c == "g" || c == "h" || c == "i"
      n = n + "5" if c == "j" || c == "k" || c == "l"
      n = n + "6" if c == "m" || c == "n"  || c == "o"
      n = n + "7" if c == "p" || c == "q" || c == "r" || c == "s"
      n = n + "8" if c == "t" || c == "u" || c == "v"
      n = n + "9" if c == "w" || c == "x" || c == "y" || c == "z"
    end
  end
end
puts Vanity::find_nber("example")
