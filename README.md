# InterestCalculator

- Interest Rate calculator allows user to calculator the interest based on provided loan amount and interest rate percent. This calculator takes user's input data as a string and creates BigDecimal object from that string (to better represent exact decimal numbers). This application then uses NumberFormat with its static methods getPercentInstance() and getCurrencyInstance() to format the results to enhance user's experience.

- Without BigDecimal arithmetic, these values:
- loan = 4944.5
- interestRate = .01
- would result in a rounding error of $49.445
- With BigDecimal arithmetic, these values
- will be rounded correctly to $49.45

# USEFUL INFORMATION FOR BEGINNER/NEWBY/JUNIOR PROGRAMMER

- Note: BigDecimal class represents exact decimal numbers. Conversely, the double and float types represents approximate decimal numbers.
- BigDecimal class works with numbers that have more than 16 significant digits. Coversely, the double type has a maximum of 16 significant digits, and the float type has a maximum of 7 significant digits. So, if you need to round numbers, the BigDecimal class lets you specify several types of rounding.

- PS: the round() method of Math class only provides for one type of rounding

- Constructors of BigDecimal class: BigDecimal(String), BigDecimal(int), BigDecimal(double)
-- These constructors accept an int, double, long, or string argment and create BigDecimal object from it. Because floating-point numbers are limited to 16 significant digits and because these numbers don't always represent decimal numbers exactly, it's often best to create BigDecimal objects from strings rather than double values.

- Methods of BigDecimal class: add(value), subtract(value), multiply(value), divide(value, scale, roundingMode), setScale(scale, roundingMode) -- set number of decimal places (scale) for BigDecimal object's value as well as rounding mode, doubleValue() -- this method lets you convert BigDecimal object's value to double value, toString() -- convert BigDecimal object's value to a string.
- example for setScale() -- salesTax = salesTax.setScale(2, RoundingMode.HALF_UP);
- https://www.tutorialspoint.com/java/math/bigdecimal_divideandremainder.htm

- RoundingMode enumeration: 2 values are HALF_UP & HALF_EVEN. There are more. Look on BigDecimal's Java API Doc.
