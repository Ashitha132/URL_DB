# urldatabase is a java program that includes the following features

    1. The program will wait for the user to enter the following commands.
    2. The command storeurl will take a URL as a parameter and save that  with a unique short key and a count(usage count) initialized to 0.
    3. The command get will take a URL as a parameter and return the unique short key after incrementing the usage count.
    4. The command count will take a URL as a parameter and should return the latest usage count.
    5. The command list should return all urls and counts. The return value is in JSON.
    6. The command exit should terminate the program
    
    
# Usage guide

    1. To start the program: run java urldatabase.
    2. Commands:
        1. storeurl google.com
        2. get google.com
        3. count google.com
        4. list
    b. To exit the program enter exit
