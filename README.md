# 💡 First Challenge Compass.Uol
Hello Dear, this is my first Challenge at Compass.Uol, Let me tell you how it works:

### 🔧 Models
** - we have only one entity in the project named _CarModel_ with five fields "_chassiId, model, brand, color, fabricationYear_" where chassi is primary key and autoincrement. For brand field and fabricationYear field we have specials conditions:**
> brand field can only save in a database if the field is filled with _Ford, BMW, Chevrolet_ or _volvo_ and this constraint is implemented within the _CarEnum_ and
> fabricationYear field is treated with regex within _CarDTO_.  

### 🔧 Controllers
** - saveCars Route can recieve data provided by _HTTP BODY_, these data are stored in a DTO named _CarDTO_ where we have many of data constraints.**
> CarDTO has @ValidAnnotations that force user to send correct data to correct field. Posteriorly, this DTO will be converted in a _carModel_ instance and save at database.

** - getCat is simpler than saveCars, basically it recieved a ID parameter and send to _getCarService_ and return corresponding data itself or not if the ID does not exists at database. Right after it shows the payload to the user.**

### 🔧 Services
** - we have two services, _saveCarService_ and _getCarService_. saveCarService recieve carDTO with data send through the _HTTP BODY_ and transfer to new CarModel instance and save in the database.
GetCarService recieve id provided by HTTP Parameter and searching if exist in database and return the specific payload.**
