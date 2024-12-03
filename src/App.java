public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    function sumArray(numbers) {
        let total = 0;
        for (let i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }
    
    // Function to find the average of an array of numbers
    function averageArray(numbers) {
        let sum = sumArray(numbers);
        let avg = sum / numbers.length;
        return avg;
    }
    
    // Test data
    const numbers = [1, 2, 3, 4, 5];
    
    // Call the function and log the result
    console.log('Sum of numbers:', sumArray(numbers));
    console.log('Average of numbers:', averageArray(numbers));
    
    // Introduce a mistake: dividing by zero if the array is empty
    function averageArrayWithCheck(numbers) {
        if (numbers.length === 0) {
            return 'Array is empty, cannot calculate average';
        }
        let sum = sumArray(numbers);
        let avg = sum / numbers.length;
        return avg;
    }
    
    // Test the function with an empty array
    const emptyArray = [];
    console.log('Average of empty array:', averageArrayWithCheck(emptyArray));
}


