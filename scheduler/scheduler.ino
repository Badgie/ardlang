
class Task { 
private: 
  int _runInterval, 
    _timeTilNextRun; 
  
public: 
  // Parameterized Constructor 
  void RunInterval(int runInterval) 
  { 
      _runInterval = runInterval; 
      _timeTilNextRun = 0;
  }
  void countDown() {
    if(_timeTilNextRun > 0) {
      _timeTilNextRun--;
    }
  }
  bool Ready() {
    return (_timeTilNextRun < 1);
  }
};


void CountDownTasks(Task tasks[], int numberOfTasks) {
  for (int i = 0; i < numberOfTasks; i++)
  {
    tasks[i].countDown();
  }
}

int getNumberOfReadyTasks(Task tasks[], int numberOfTasks) {
  int count = 0;
  for (int i = 0; i < numberOfTasks; i++) {
    if(tasks[i].Ready()) {
      count++;
    }
  }
  return count;
}


//TODO consider creating a better stratigy´
//Or at least optimize this.
int getNextTask(Task tasks[], int numberOfTasks) {
  int selectedTask = -1;
  while(selectedTask = -1) {
    int numberOfReadyTasks = getNumberOfReadyTasks(tasks, numberOfTasks);
    if(numberOfReadyTasks > 0) {
      int checkTask = random(0,numberOfTasks);
      if(tasks[checkTask].Ready()) {
        selectedTask = checkTask;
      } 
    } else {
      delay(1000);
      CountDownTasks(tasks, numberOfTasks);
    }
  }
  return selectedTask;
}

/*TODO Add all task functions here*/
void task0() {

}
void task1() {
  
}
void task2() {
  
}
void task3() {
  
}

void setup() {
  // put your setup code here, to run once:
  //TODO nuber of tasks needs to be set dynamicly
  int numberOfTasks = 4;
  Task tasks[numberOfTasks];

  //TODO foreach task we need to set RunInterval
  tasks[0].RunInterval(5);
  tasks[1].RunInterval(2);
  tasks[2].RunInterval(6);
  tasks[3].RunInterval(9);

  while(true) {
    int selectedTask = getNextTask(tasks,numberOfTasks);
    
    switch (selectedTask) {//TODO add all tasks here
    case 0:
      /* code */
      task0();
      break;
    case 1:
      /* code */
      task1();
      break;
    case 2:
      /* code */
      task2();
      break;
    case 3:
      /* code */
      task3();
      break;
    default:
      /*Left blank*/
      break;
    
    }

    CountDownTasks(tasks, numberOfTasks);
  }
}

void loop() {
  // put your main code here, to run repeatedly: 
}
