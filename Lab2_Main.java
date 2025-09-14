public class Lab2_Main {
    public static void main(String[] args) {
        // ==========================
        // OPTION 1: Modern Java (15+)
        // Use text blocks """ ... """
        // Uncomment this section if your Java version supports it
        // ==========================
        /*
        String input = """
            Circle 0.5 blue
            Circle 0.2 red
            Square 1 blue
            Square 1.5 green
            Circle 1 green
            Square 1 green
            Square 2 blue
            Circle 1 blue
            Square 0.5 red
            Circle 2 red
            Square 3 green
            Circle 0.8 blue
            Square 2.5 red
            Circle 1.2 green
            Square 0.7 blue
            Circle 3 red
            Square 4 blue
            Circle 2.2 green
            Square 1.3 red
            Circle 0.4 blue
            Square 2.8 green
            Circle 1.7 red
            end
            """;
        */

        // ==========================
        // OPTION 2: Older Java (8/11)
        // Use a normal string with \n
        // Uncomment this section if """ does not compile
        // ==========================
		
       /*
        String input =
            "Circle 0.5 blue\n" +
            "Circle 0.2 red\n" +
            "Square 1 blue\n" +
            "Square 1.5 green\n" +
            "Circle 1 green\n" +
            "Square 1 green\n" +
            "Square 2 blue\n" +
            "Circle 1 blue\n" +
            "Square 0.5 red\n" +
            "Circle 2 red\n" +
            "Square 3 green\n" +
            "Circle 0.8 blue\n" +
            "Square 2.5 red\n" +
            "Circle 1.2 green\n" +
            "Square 0.7 blue\n" +
            "Circle 3 red\n" +
            "Square 4 blue\n" +
            "Circle 2.2 green\n" +
            "Square 1.3 red\n" +
            "Circle 0.4 blue\n" +
            "Square 2.8 green\n" +
            "Circle 1.7 red\n" +
            "end";
            */

        // Step 1: Split the big string into separate lines
        String[] lines = input.split("\n");

        // Example: After the split, the array 'lines' looks like this:
        // lines[0]  = "Circle 0.5 blue"
        // lines[1]  = "Circle 0.2 red"
        // lines[2]  = "Square 1 blue"
        // ...
        // lines[21] = "end"

        // Step 2: Create an array of shapes (max 100 for safety)
        Shape[] shapes = new Shape[100];
        int count = 0;  // how many shapes we actually store

        // Step 3: Loop through each line of input
        for (String line : lines) {
            if (line.equals("end")) {
                break; // stop reading at "end"
            }

            // Split one line into 3 parts: shape type, size, color
            // Example: "Circle 0.5 blue" → ["Circle", "0.5", "blue"]
            String[] parts = line.split(" ");

            // TODO 1: Extract the information
            // String shapeType = parts[0];
            // double size = ...
            // String color = ...

            // TODO 2: Create the correct object
            // If shapeType is "Circle", then create a Circle
            // If shapeType is "Square", then create a Square
            // Store it in the array at index [count]

            // TODO 3: Increment count so the next shape goes to the next slot
        }

        // Step 4: Now calculate the total area per color
        // Hint:
        // double redTotal = 0, greenTotal = 0, blueTotal = 0;
        //
        // Loop through the shapes array (from 0 to count-1):
        //    - Get the color: shapes[i].getColor()
        //    - Get the area: shapes[i].getArea()
        //    - Add it to the correct total
        //
        // Finally, print out the totals for each color
    }
}
