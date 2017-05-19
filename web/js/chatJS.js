/**
 * Created by Combii on 27/04/2017.
 */

var username;

function sendMessage(){

    var chatWindow = document.getElementById("chatWindow");
    var message = document.getElementById("chatWriter");

    chatWindow.value += /*getUsername() + ": " + */message.value + "\n";
}

function setUsernameChat(newUsername){
    username = newUsername;
}
