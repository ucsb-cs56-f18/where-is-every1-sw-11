skunksworks project for cs56 
this repo was used to understand how to integrate mlab/mongodb with sparkjava
not included: a .env file on my local repo that connects to the mlab database. 

Please look through the tutorials on Conrad's website to get familiar with setting up the MongoDB database on MLab. By going through the tutorial, you will be able to create a database and user credentials to use in your .env file. 
https://ucsb-cs56-pconrad.github.io/topics/mongodb/

Instructions on How to Run Project:
1. Need an .env file in the root. This file holds the credentials to your mlab collection. This should have been established from following Conrad's tutorials. 
2. run 'mvn clean install'
3. run 'heroku local'
4. run 'git push heroku'
5. run 'mvn package heroku:deploy'
6. go to the heroku url to see your webpage
7. log into mlab to see your (songs) collection update the data 

=======
Scrape Free/For Sale Sites
An application which would take a description of an item you want, and would then scrape multiple websites such as Craigslist and notify you when it found something.

Name: Diane Phan 

Starter code for [lab06](https://ucsb-cs56-f18.github.io/lab/lab06/)
=======