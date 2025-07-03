var count = 0; 
var num = 200; 

for (var i = 2; i <= Math.sqrt(num); i++) {     
    if (num % i == 0) { // Check if divisible by i
        count++; 
        break; // If we find a divisor, no need to continue checking
    }
} 

if (count == 0 && num > 1) {
    console.log("prime");
} else {
    console.log("not prime");
}
