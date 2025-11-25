# Game of Life DSL - Readme

## 1. Language Design
This project implements a Domain Specific Language (DSL) for Conway's Game of Life using Xtext. The language was designed to be declarative and readable, allowing users to define the initial state of the grid separately from the evolution rules.

* **Grid Definition:** The `Grid` block defines the dimensions of the board and the initial population. I chose to use coordinate pairs `(x, y)` to define populated cells, which allows for precise placement of patterns like Gliders or Blinkers.
* **Rules Definition:** The `Rules` block uses a natural language syntax (e.g., `Each living cell...`) combined with mathematical operators (`<`, `>`, `==`, `&&`, `||`). This makes it easy to express complex conditions, such as standard Conway rules or custom variations where cells behave differently based on specific neighbor counts.

## 2. Code Generation
The DSL utilizes Xtend to generate a Java class named `RulesOfLife.java`.

* The generator maps the DSL `GridSize` and `PopulatedCells` to static variables in Java, allowing the runtime to initialize the board dynamically.
* The evolution rules are translated into a series of `if` statements inside the `computeSurvivors` method. This generated code is directly integrated into the provided Swing-based `short.life` application, replacing the hardcoded logic.

## 3. Validation
I implemented a robust validator (`GolValidator.xtend`) to ensure model correctness before code generation:

1.  **Bounds Check:** Validates that all initial cell coordinates fit within the defined `GridSize`.
2.  **Duplicate Check:** Flags an error if the same coordinate is defined twice in the initial grid.
3.  **Logic Check:** Prevents defining invalid neighbor counts (e.g., negative numbers or numbers greater than 8).
4.  **Semantic Check:** Warns users if they define rules that are logically redundant (e.g., a rule stating a "dead" cell "dies").

## 4. Extra Feature (Bonus)
I implemented a **Quick Fix** in the UI project (`org.gol.ui`).

* If a user inputs an invalid neighbor count (e.g., `> 8` or `< -1`), the editor flags it as an error.
* The user can press `Ctrl + 1` on the error to automatically correct the value to the nearest valid boundary (e.g., setting it to 8).

## 5. How to Run
1.  Import the provided `short.life` project into the runtime workspace.
2.  Open the `models` folder to find example files:
    * `glider.gol`: Demonstrates a moving Glider pattern.
    * `blinker.gol`: Demonstrates a stationary oscillating pattern.
    * `validation_errors.gol`: Demonstrates the validation rules and the Quick Fix functionality.
3.  Saving any `.gol` file will generate `RulesOfLife.java`.
4.  Run `GameOfLife.java` as a Java Application to view the simulation.