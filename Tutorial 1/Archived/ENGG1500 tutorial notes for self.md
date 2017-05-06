#MIT App Inventor

##Setup
Android device + build in browser OR
Emulator + build in browswer
Note:  Accessing the website will request access to your google login account

###Groupwork considerations / limitations when using MI App Inventor
*  Pros:
  1. Multiple phones can use/access a project in development

* Cons:
  1. It seems that this site does not allow group access to work on a project.  ie:  Projects can only be linked/developed by a single user.
  **possible ways to fix this:**
    * Have an administration google account which the users of the group can log into the admin site with?
      Tested this option, when logged into the project from more than one one workspace (multiple desktops).  There is syncing issues:
      You can play with visual stuff - but any building of the blocks when logged in with 2 accounts gives errors.  
      Working on a project with one account logged in from multiple locations can actually damage the project in ways that are irreparible.
      Admin account is still a good idea for good access - but only one person at a time can be logged in to work on the project... how will the group co-ordinate this aspect?
    * What about sharing an .aia source code file around? 
	  i.e:  one person can can work on it - produce the .aia source code - then share the source code so other users can load and work on it and so on
	  note:  I have not tested this option - it may or may not be more finiky than the one admin account, depending on the policy the group uses around development.  Some groups might prefer this method
  **looking on the bright side**
  Perhaps this is a postive thing.  They will need to develop some kind of workflow and policy around development and distrubution of the ap they are working on.  Can softly introduce the concept of general office policies/procedures and why they are important etc.
  ideally the policy would need to include:
    * Google account linked to the development app
	* Some way of ensuring that only one person is working on the app at a time
	  i.e:  what kind of group communication process will the group use to acheive this?


##Complete the HelloPurr Tutorial
Follow [this tutorial](http://appinventor.mit.edu/explore/ai2/hellopurr.html) to setuo the Hellopurr App
At this stage, the app is still in development.  
Note:  Do not feel compelled to use the provided kitty picture and meow sound.  Feel free to find your own.  Ask Tutor for alternate image/soundFile

**_//TODO:  Still need to check/test check if phone needs to be logged in with same google account, or if any phone can scan the QR code to gain access_**


###Package the App
####Build
The app can be built/compiled for distribution and sharing.
Generally - for sharing it is easiest to use the second option "save to my computer" and downloaded as an apk file.

//TODO:  Check this statement.  currently I only *think* this is how this works.
If you wish to share with your QR code, you will all need to be logged in on your phone with the same google admin account. (note:  I have not tested this feature:  multiple logins on device side)
Using this option... How long is an app built using a QR code available for? 2 hours.

#####Sharing a built App
More details about sharing the apk file [here](http://appinventor.mit.edu/explore/ai2/share.html)
More details about side loading [here](http://www.techrepublic.com/blog/smartphones/how-to-side-load-apps-on-your-android-device/)

#####How will you share the apk during development


#####Version Control
Will you incorporate version control? 
How will you manage the version control of your application?
Can you think of ways/systems to help manage this?  


#####Roll back
Will you try and mimic a rollback feature? i.e: How will you roll back the application if you need to revert to an older version.
Note:  might be possible using some kind of policy with the .aia files.  i.e:  If you have some kind of version control on those, you can easily load and roll back to an older version.  Still needs testing.
