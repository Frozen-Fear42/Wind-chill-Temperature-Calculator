# Wind Chill Calculator

## Author
Humphrey Boahen

## Description
This Java program calculates the wind chill index based on user-provided temperature and wind speed inputs. The wind chill index is a measure of how cold it feels when the effects of temperature and wind speed are combined.

## Instructions
1. Run the program.
2. Enter the temperature in Fahrenheit between -58°F and 41°F when prompted.
3. Enter the wind speed (must be greater than or equal to 2) in miles per hour when prompted.
4. The program will validate the input, ensuring it falls within the specified ranges.
5. After valid input, the wind chill index will be calculated and displayed.

## Formula Used
The wind chill temperature is calculated using the following formula:
$\[ WCI = 35.74 + 0.6215 \times T - 35.75 \times (V^{0.16}) + 0.4275 \times T \times (V^{0.16}) \]$

Where:
- \( WCI \) is the wind chill index
- \( T \) is the temperature in Fahrenheit
- \( V \) is the wind speed in miles per hour

## Input Validation
The program validates user input for both temperature and wind speed, ensuring they meet the specified criteria.

## Example Usage
```
Enter the temperature in Fahrenheit between -58°F and 41°F: 5.3
Enter the wind speed (>= 2) in miles per hour: 6
The wind chill index is -5.56707
```

## Notes
- Ensure that you provide valid input as per the specified ranges to obtain accurate results.
- This program utilizes the DecimalFormat class to display the wind chill temperature with precision.

Feel free to use and modify the code as needed for your understanding or academic requirements. If you encounter any issues or have questions, please contact the me.
