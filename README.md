# Election Vote Counter

This program reads a file containing election vote data, processes it, and displays the total votes for each candidate.

## How It Works

1. The program prompts the user to enter the full path of a file.
2. The file should contain data in the format: `CandidateName,NumberOfVotes` (one entry per line).
3. The program reads the file, processes the data, and calculates the total votes for each candidate.
4. The results are displayed in alphabetical order of candidate names.

## Input File Format

- Each line in the file should follow this format:
    ```
    CandidateName,NumberOfVotes
    ```
- Example:
    ```
    Alice,5
    Bob,3
    Alice,2
    ```

## Example Output

If the input file contains the above example data, the program will output:
```
Enter file full path: <path_to_file>

Total votes by name:
Alice: 7
Bob: 3
```

## Error Handling

- If the file path is invalid or the file cannot be read, an error message will be displayed.
- Lines with invalid formats or non-numeric vote counts will be ignored.

## Requirements

- Java Development Kit (JDK) 8 or higher.

## How to Run

1. Compile the program:
     ```
     javac application/Program.java
     ```
2. Run the program:
     ```
     java application.Program
     ```
3. Enter the full path to the input file when prompted.

## Notes

- Ensure the input file is properly formatted to avoid skipped lines.
- The program uses a `HashMap` to store and aggregate votes efficiently.

## File exemple

Alex Blue,15
Maria Green,22
Bob Brown,21
Alex Blue,30
Bob Brown,15
Maria Green,27
Maria Green,22
Bob Brown,25
Alex Blue,31
