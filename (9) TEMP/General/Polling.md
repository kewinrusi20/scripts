The "Polling" is a functionality of the code that is called again and again<br>
for example:<br>
when the email page call the server and ask in loop if there is something new<br>
and with the "inversion of control", you change from the pulling variant to the "Push-Update"
where you give the server the Authority to notify you(the client), when ever something happens

and with the "Callback", you decide when to call that specific functionality 
- example:
the Server push the new notification to the client directly when it comes

