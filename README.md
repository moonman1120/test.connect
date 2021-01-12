# test.connect

Introduction:
In this project you will be making a game like the popular game connect 4. If you are not familiar with connect 4, please look it up first. This game is different; it can be any width, any height, have more than 2 players. In the traditional game, you need 4 in a row to win. In this game, you need X, where is a number chosen at the start, Hence the name connect X.
Task:
This project is divided into 2 parts. Firstly, you will need to write the underlying game logic. This will be the ConnectX class. It will keep track of which player has placed markers in which cells. The terms “markers” or “tokens” represent a player putting their piece into a cell. The ConnectX class will also need to be able to determine if a player has won or not. A player wins if they have X consecutive pieces in a row or column. Unlike regular connect 4, we are not checking diagonals.
The second part is build a graphic interface that allows the user to play the game. When someone clicks on the game, it should add a marker to the top most empty space in the column that was clicked on. You should also include a reset button to reset the game, and display a message when a player wins. You are welcome to customize the appearance of your game however you like.
