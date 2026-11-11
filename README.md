# Online Store

## Description of the Project

The Online Store is a Java console application that allows customers to browse products, add items to a shopping cart, and complete purchases through a checkout process. Product information is loaded from a pipe-delimited CSV file, providing a realistic inventory management experience

## Features

- Load products from a CSV inventory file
- Display all available products
- Search products by SKU
- Add products to a shopping cart
- View cart contents
- Calculate cart totals automatically
- Checkout and process payment
- Calculate and display change
- Generate a sales receipt
- Clear cart after successful purchase

## User Stories

- As a shopper, I want to view a home screen with options to display products, view my cart, or exit the application, so that I can easily navigate the store and choose the action I want to perform
- As a shopper, I want to view a list of products and have the option to add items to my cart or return to the home screen, so that I can browse products, build my purchase, and navigate the store efficiently.
- As a shopper, I want to view the items in my cart, see the total cost, and have the option to check out or return to the home screen, so that I can review my purchases, complete my order, or continue shopping as needed.
- As a shopper, I want identical products in my cart to be grouped together with a quantity displayed, so that I can easily see how many of each item I have selected without viewing duplicate entries.
- As a shopper, I want a sales receipt to be saved as a file after checkout, so that I can keep a record of my purchase and review the transaction details later.

## Setup

### Prerequisites

- Java 17 (Amazon Corretto), the version used in class.
- IntelliJ IDEA Community Edition: <https://www.jetbrains.com/idea/download/>

### Running the application

1. Clone this repository, or download it as a zip and unzip it.
2. In IntelliJ: File > Open, pick the project folder (the one that holds `pom.xml`), press Open.
3. Wait for IntelliJ to finish indexing (progress bar at the bottom).
4. Open `src/main/java/com/pluralsight/YourMainClassName.java`. <!-- replace YourMainClassName with the class that has main -->
5. Right-click inside the file and choose Run 'YourMainClassName.main()'.

### Data and configuration

<!-- OPTIONAL. Anything the program needs that is not code: data files and where they must sit, files the
     program creates, a database script to run first, a settings file to edit (connection, port).
     If there is nothing, delete this subsection, heading included.
     Example:
     - `inventory.csv` sits at the project root, next to `pom.xml`. The program reads it at start.
     - `logs.txt` is created by the program at the project root on the first run. -->

-

## Technologies Used

- Java 17
- IntelliJ IDEA
<!-- Add anything else you used: a library, Maven plugins, an external tool. For a console app this list is short. That is fine. -->

## Demo

<!-- Pictures of the app running: the console for a console app, Insomnia or Swagger for an API.
     Screenshots are enough; a GIF is a bonus.
     1. Create a folder named `images` at the project root, next to `pom.xml`.
     2. Take screenshots of the app in the IntelliJ console (the menu, one feature, one error message):
          Windows: Win + Shift + S, drag a rectangle, then paste into Paint and save as PNG, or open the
                   notification and save. Save into the `images` folder.
          Mac:     Shift + Cmd + 4, drag a rectangle. The file lands on the Desktop; move it into `images`.
     3. Name the files by what they show: `images/menu.png`, `images/search.png`.
     4. Reference each one below with a relative path. No spaces in file names.
     5. Commit the images with the rest of your work (Git > Commit shows them as unversioned files: tick them).
     Optional GIF: LICEcap (free, Windows and Mac, <https://www.cockos.com/licecap/>) records a region of the
     screen straight to a .gif. Keep it under 10 seconds and under 10 MB, save it into `images`. -->

![Main menu](images/menu.png)

![One feature in action](images/feature.png)

## A piece of code I am proud of

<!-- Paste one short block of your own code (5 to 15 lines) between the three backticks, then write two
     or three sentences: what it does and why you chose to write it that way. This is what you show on
     demo day and what you talk about in an interview. -->

```java

```

## Future Work

- Remove items from cart
- Category filtering
- Inventory tracking

## Resources
- Java YearUp Fall 2026 hub: <https://raymaroun.github.io/yearup-java-fall2026/>
- file:///C:/Users/jadakeels/Downloads/Workbook%203w%20-%20Workshop%20-%20Online%20Store%20v7.2Y.pdf

## Author

- Jada Keels
Software Student

## Thanks

- Thank you Raymond and peers for assistance and feedback throughout.