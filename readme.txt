GARDENBOT README

//////////////////////////////////////
//        GARDEN INTIALIZATION      //
//////////////////////////////////////
When Gardenbot starts up, it will prompt the user to enter the number of each plant type they'd like.
Each garden can have a maximum of 10 plants. Attempting to have more will not be allowed.
Plant types include: roses, daisies, cacti, [[others]].
Each plant type has different qualities, such as water requirements, resistance to insects, etc.
In addition, each individual instance of a plant type will have some variance. For example: not every rose will require exactly 2 units of water.

//////////////////////////////////////
//      DAILY GARDEN MANAGEMENT     //
//////////////////////////////////////
Every day, the user will have the option to do one of five things:
(1) check on the qualities of all of their plants
(2) water a specific plant a given number of times
(3) fertiize a specific plant a given number of times
(4) release pesticides or ladybugs onto a given plant
(5) move onto the next day.

The user will be allowed to undergo the first 4 operations an unlimited number of times every day. They can check on their plants, water them, fertilize them, and release pesticides onto them as many times as they see fit. Once a user chooses to go onto the next day, however, the day is permanently finished.

Below is a brief explanation of each garden operation the user can perform.

(1) PLANT CHECKUP
Generally, the best thing for a user to do is to begin each day by choosing option 1 and checking on all of their plants.
If the user reads all of the information that outputs from a plant check, they will see that each of their plants requires different actions in order to stay alive and figure out which actions they should take.
For instance, if a user has 5 roses, and rose number 2 (R[2]) requires a minimum of 2 waters, the plant check should inform the user that they ought to water R[2] atleast 2 times.

(2) PLANT WATERING
The user will be able to water each plant individually a specific number of times. This allows the user to cater to the specific needs of each plant.
The user will be prompted to choose which plant type they'd like to water (i.e. Daisy), then which instance of that plant (i.e. D[3]), then how many times they'd like to water (i.e. 2).
The user will always be given the option to cancel a watering operation as the last step. We want our users to be sure they're giving their plants exactly what they need. They will also be given the opportunity to cancel any fertilization operation as the last option menu.

(3) PLANT FERTILIZING
The user will be able to provide fertilizer to each individual plant in a similar way to how they water their plants.
The fertilizer menu will also ask which plant type, plant instance, and number of times the user would like to fertilize a given plant.

(4) RELEASE PESTICIDES
If the user sees that a plant has been infected with insects, they can attempt to eliminate them. The user can choose to use either pesticides or ladybugs to eradicate an insect infection. Pesticides will always succesfully eradicate insects, but have the possibility of damaging plants as well. Ladybugs will never run the risk of damaging plants, but are not as effective in killing insects as pesticide. The user can use whichever method they believe to be the most effective over the long-run.

(5) MOVE ONTO THE NEXT DAY
Once the user is satisfied with their choices, they can choose to end the day and move forward in the garden simulation. Every day, plants will increase the amount of resources they require. The goal of this simulation is to keep the plants in the garden alive for as long as possible. Every day, the user should check on their plant's needs and act accordingly.

Best of luck! We hope you enjoy your garden experience. 
