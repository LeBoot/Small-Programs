DROP DATABASE IF EXISTS EnigmaDB;
CREATE DATABASE EnigmaDB;
USE EnigmaDB;

-- Create tables ================================================================
CREATE TABLE MyEnigmaEntity (
	ID INT PRIMARY KEY AUTO_INCREMENT
    ,Pass CHAR(128) NOT NULL
    ,Passkey VARCHAR(500) NOT NULL
);

CREATE TABLE MyEnigmaVC (
	ID INT PRIMARY KEY NOT NULL
    ,VC VARCHAR(500) NOT NULL
);

-- Fill Tables ================================================================
INSERT INTO MyEnigmaVC (ID, VC) VALUES
	(1,"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&?")
    ,(2,"0cIqw7LY&W$u1hpjAgH4mbzTP!kOiDeUN5vEnyo3J86?dxG2#SXaCFstBlfMQ%rZ9@RVK")
    ,(3,"angIVs2Flw&0p8BjZUvfD3xJiHcdRMmY5NorT1Q!OLA9yW@$XK?G4tzSkbE6uhe7P%#Cq")
    ,(4,"d@fk1zsx8&MWgVU7YlcKOorp#qRPBQLGXCnjmb$5t6?SDe4HiwIZu0Thv!AEa%y9FJN23")
    ,(5,"?xeaNMzIbY4HEUdhCJ2i9F%S!rR@ATQqXj$vkgsG3tVlB&K6p08w5muOZyco1LfPDW7#n")
    ,(6,"EtIsacVCrTAL02z5bq8Hdwh1&WDfnx4RXZNeB7!vpM@Ki9PmOGUk#yS6lYg3?QF$Jju%o")
    ,(7,"C@lPQc%dIi&KFr27tY?uTM4h$9xqnSE!1Xs0BUoaeZWkgJ6fO#zm5DRNHp8GjyLbVA3wv")
    ,(8,"urtALg3Is5lRhmM4yBxzpnGN%UwTKZeEi@7JOWFY$PSHC0&1bXa8qdof6kjDvV?c92#Q!")
    ,(9,"yiuZ%s$zpCUo?Q@43XrlghdWq7nSLGVYb0HxfOJwt1c2K8jNRMeDEIBFk!T59Pm#vAa6&")
    ,(10,"?DyWQ@0PbOH#F%jMTiz$NZvw38cg1KSrsd7YhRuJ2XAUGn59IaC&etoLBp4E6q!Vlkfmx")
    ,(11,"hqJ%NIstrGpYE6Z?eXgSRK@xTQMovWA5$cj0HCilaf8yDPOk#BV!37uzLF1wm&Ubd249n")
    ,(12,"WCVmL!zZia2j4xAU&fGcv@gTQs$tYH19MqyDnBIdpke?uOPFl63%S0K#bER8NhXrwo7J5")
    ,(13,"qj$OKHWlEG9ov#ry45z23hiUfB!&8t@Tdabuex%1ZnQsVAmgNLFPpIYJDSMX706kw?RcC")
    ,(14,"V5ogUiY80hw4&QC1cAr#?Ia$ktXzeDENP%lSKW!vTmRbdO6qBJ@73HfsnpZujLyF9MxG2")
    ,(15,"RC7yi24w@rdF6SEa3?Ah8GqpDOMJVK!#19bW&QgnzBjxX0kZTIcufvLYts$NHoeP%5Ulm")
    ,(16,"h1mYE&43f7WV@0TlNujoeQq%J6AZKdaPx9S$C#c?GvFrt2bODMykXsIip8!HLBwRnU5gz")
    ,(17,"j5X0@PwSyIJkuG9#4Bf8FZEDU%!bMOK7hL&ezanqQRgdAWtYVvNm61s?Tr$HxC2c3ploi")
    ,(18,"9leOGDkc@$P2#R07rUJnF&sMowvHLj8VuxW?dtN3bazQiIK!Ag5TY1S%Ef4mCqZXphBy6")
    ,(19,"Mq#aLN%2TKEbsJk4QnI1BXORFGfidpAZg769V5mlUP0Yt8!cwjoz$@&Dr?Se3xvWChuHy")
    ,(20,"C3hH1xw5Ti7yVvm4te%9j0MEZU@fqrcB&#uo!P2XJYAa6LIDdNl?nzRGsOQgFSWbk8Kp$")
    ,(21,"dW@6OVSYhwBjxX31r$ez5!7F&qM8UCniT?ZGvlbya2LDu9%Qc4gINm0H#oJtsKpRkAEfP")
    ,(22,"$Kf9lzgFkS1x@WEO4iVs?!Z&Tqtajw7mGr3Q5LHJ6%8uR#MPp2INn0oYBheCUbydAXDcv")
    ,(23,"oDVep&X1x!@7RZyU$8K?nINW0zkMOf9lLmiG#abJgBc4A6vhP3%utEFY2s5dCTwHSqQrj")
    ,(24,"GO9tWeVblx2gT4uE!@Rp1Y7khsU63wdQX&ZzyNrcqmaAvM$KBPoHLi%n5FfIDJ?C0#8jS")
    ,(25,"i3O?Rv9Y%A5fBF$x8rmcKJpZjDUg!hXuw&SM4zTe7dVnCkt6o20sQ#GIl1EWHqNLb@aPy")
    ;