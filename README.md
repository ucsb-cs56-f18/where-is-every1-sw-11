**skunksworks project for cs56 **


this repo was used to understand how to integrate mlab/mongodb with sparkjava

Cloning this repo will give you a template of what you can use for your own project. The only thing we are missing is a .env file on my local repo that connects to the mlab database. 



Utilize the starter code from starter code for [lab06](https://ucsb-cs56-f18.github.io/lab/lab06/) to create your own heroku app. 



Please look through the tutorials on Conrad's website to get familiar with setting up the MongoDB database on MLab. By going through the tutorial, you will be able to create a database and user credentials to use in your .env file. 

https://ucsb-cs56-pconrad.github.io/topics/mongodb/

Another useful repo that helped me know where to put my .env file. 

https://github.com/chan4est/ucsb-cs56-mongodb-mlab-tut


Instructions on How to Run Project:
1. Need an .env file in the root. This file holds the credentials to your mlab collection. This should have been established from following the tutorials from above. 
2. run 'mvn clean install'
3. run 'heroku local'
4. run 'git push heroku'
5. run 'mvn package heroku:deploy'
6. go to the heroku url to see your webpage
7. log into mlab to see your (songs) collection update the data 


