# User-Registrat
1. Using Spring web application we read the data from web as username,password,name,phno,Address,Date of birth from loginservlet.java and login.jsp files.
2. Then we redirect to welcome.jsp whose action is performed on uservalidation.java for sending sms to the phone number which is entered using txtlocal messanger.
3. and the otpsent and otp received from user in verfiy.jsp are compared in verify.java if both are same then we add the User to a List which keeps on adding and store the user data in the table in oracle with table name as User_Reg.
4. After verifying the user OTP and insertion in db we redirect it to signin page signin.jsp where user signs in using username and password then we compare the user entered    username and password with list where we stored all the records in and if the username exists then we direct the user to the show.jsp where all the user details are print.
5.  and in show.jsp we have a submit button which sign out the user and redirect the page to the signin.jsp.

Table used is User_Reg in oracledb.
User data is a object named as Person class and each Person object is stored in ListUser list.
