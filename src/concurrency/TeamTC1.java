package concurrency;

import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable{
    List<String> team = new ArrayList<>();

    @Override
    public void run() {
        String[] nameArray = {"Dylan", "Matthew", "George", "Jeramie", "Katherine", "Kevin", "Vani", "Norita", "Sabitha", "Vimala", "Jessica", "John", "Nancy", "Victor"};
        try {
            for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
            Thread.sleep(1000);
            team.add(nameArray[i]);
            }
            System.out.println(team);
        } catch (InterruptedException e) {
            System.out.println("Exception");
        }

    }



    //This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.  In the run method of this thread, print out the name of each student in your TA group, (starting with your TA).  There should be a pause of 1 second before each name is printed to the console.The name should then be pushed to the team List  After all the names have been pushed to this List, print out the entire list of all the students in your TA group. Don't forget your TA as well!  All of these steps should be done whenever the thread is started.  (i.e. it can be done directly in the run()method of the thread itself).  Kick off the thread in the Main class of the concurrency package.  
}