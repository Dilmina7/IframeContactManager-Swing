# Contact Manager

This project is a comprehensive Contact Manager application developed in Java. It enables users to efficiently manage contacts, offering functionalities such as adding, updating, deleting, and searching for contacts, along with sorting capabilities. The application features a user-friendly graphical user interface (GUI) to enhance the user experience.

## Table of Contents

- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Acknowledgements](#acknowledgements)

## Features

- **Add Contact**: Add new contacts with ID, name, phone number, company name, salary, and birthday.
- **Update Contact**: Update existing contact details.
- **Delete Contact**: Delete contacts from the list.
- **Search Contact**: Search for contacts by name or phone number.
- **Sort Contacts**: Sort contacts by name, salary, or birthday.
- **Graphical User Interface (GUI)**: Interact with the application through a user-friendly GUI.

## Classes and Methods

### `addContact`

Handles the contact details and provides getter and setter methods.

- **Fields**:
  - `String id`
  - `String name`
  - `String phoneNumber`
  - `String companyName`
  - `double salary`
  - `String birthDay`
- **Constructor**:
  - Initializes contact details.
- **Methods**:
  - Getter and setter methods for each field.

### `checkbirthday`

Validates the format and validity of birthdays.

- **Methods**:
  - `checkedvalidbirthday(String birthday3)`: Checks if the birthday is valid.

### `checkNumber`

Validates phone numbers.

- **Methods**:
  - `checkedphonenumber(String phonenumber)`: Checks if the phone number is valid.

### `contactlist`

Manages a list of contacts with various operations.

- **Fields**:
  - `Node start`
- **Methods**:
  - `isempty()`: Checks if the contact list is empty.
  - `validindex(int index)`: Validates the index.
  - `size()`: Returns the size of the contact list.
  - `add(addContact contact)`: Adds a new contact.
  - `serch(String serchitem)`: Searches for a contact.
  - `getcontact(int index)`: Gets a contact by index.
  - `upname(int index, String newname)`: Updates the contact name.
  - `upphonenumber(int index, String newpnumber)`: Updates the contact phone number.
  - `upcompanyname(int index, String newcomname)`: Updates the contact company name.
  - `upsalary(int index, double newsalary)`: Updates the contact salary.
  - `delete(int index)`: Deletes a contact.
  - `listname()`: Lists contacts by name.
  - `listsalary()`: Lists contacts by salary.
  - `listbirthday()`: Lists contacts by birthday.

### `Node`

Represents a node in the contact list.

- **Fields**:
  - `addContact Ncontact`
  - `Node next`
- **Constructor**:
  - Initializes a node with a contact.

### GUI Classes

- **`deletecontact`**: JFrame for deleting contacts.
- **`form1`**: JFrame for adding contacts.
- **`homepage2`**: Main homepage JFrame.
- **`idgenarateA`**: Generates unique contact IDs.
- **`Listcontact`**: JFrame for listing contacts.
- **`serchcontact`**: JFrame for searching contacts.
- **`updateform`**: JFrame for updating contacts.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/contact-manager.git
   cd contact-manager
