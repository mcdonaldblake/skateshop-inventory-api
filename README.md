<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

### C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
#### Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.
I changed h1 title to Blake Skates on line 20, change parts to Skateboard parts on line 23, and products to complete decks on line 55.


### D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
I added an about.html in the template folder with an About description of the store. Added an AboutController in the controllers folder.
I also added a link to the about page on line 22 on the mainscreen.html template.

### E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
#### Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.
I added Inhouse and OutSourced parts and products in bootstrap file in the BootStrapData Class starting on line 44 and going to 91. 

### F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

I added the "Buy now" button to mainscreen.html on line 87. In AddProductController on line 37/38 I injected the productRepository dependency.
In AddProductController from lines 181-197 the buyProduct method that is responsible for sending you to productNotPurchased.html page if inventory
is empty and to productPurchased.html if inventory is greater than zero. The Method will also decrement the product purchased inventory by 1.
I also created the productPurchased.html and productNotPurchased.html in templates folder that will tell the user if product was purchased or not.


### G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


In mainscreen.html on lines 40-41 and 50-51 I added A min and max inventory for parts table. In Parts class on lines 33-36 I added error message if min or max inv
is less than 0. Also in parts class lines 93-108 I added getters and setters for min and max inv. In bootstrapdata starting on line 53
I added setters for min and max inventory of all sample parts. In inhousedpartform.hmtl on lines 24-37 I added min and max lines
to the form and also text lines to add if min or max has error and did same thing in outsourcedpart.html on lines 25-37.
In validators folder I added InventoryValidator class and validInventory annotation type that validates that inventory is between
min and max and will give error message if it is not. In application.properties I updated datasource.url on line 6 to update database.



### H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

In validators folder I added InventoryValidator class and validInventory annotation type that validates that inventory is between
min and max and will give error message if it is not. In EnufPartsValidator from lines 37-51 I added if statement that will
give error message if either updating or adding a product causes the associated parts to drop below minimum inventory.


### I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

In the PartsTest file from lines 94-113 I added 2 unit tests that verify correctness of getters and setters for getMinInv
and getMaxInv in Parts class.


### J.  Remove the class files for any unused validators in order to clean your code.


### K.  Demonstrate professional communication in the content and presentation of your submission.