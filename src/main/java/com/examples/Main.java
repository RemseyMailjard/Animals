package com.examples;

import com.examples.models.Dog;
import com.examples.models.Saiyan;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	static void main() throws InterruptedException {


				Saiyan goku = new Saiyan("Goku", 9000, 100);

				goku.attack();
				SoundPlayer.playSound("sounds/goku-kamehameha-sound-effect.wav");
				Thread.sleep(3000);
				goku.transform();
				goku.attack();
				goku.takeDamage(25);
			}
		}



//
//		Bird b = new Bird();
//
//
//		Doctor doctor = new Doctor();
//		doctor.firstname = "Dr. Phil";
//		Surgeon srg = new Surgeon();
//		srg.firstname = "Mr. Healer";
//		srg.performSurgery();
//



		//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
		// to see how IntelliJ IDEA suggests fixing it.





