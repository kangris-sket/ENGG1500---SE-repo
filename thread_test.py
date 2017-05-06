import sys
import os
import re
import threading
import time
from subprocess import Popen, PIPE, STDOUT, call #TimeoutExpired, 

UID = 00000

class hit_server(threading.Thread):

    def __init__ (self, id):
        threading.Thread.__init__(self)
        self.thread_id = id

    def run(self):
		for i in range(43):
			call ('curl "https://engg1500.newcastle.edu.au/ENGG1500DemoServer/API?command=checkin&group=GROUP8&uid="{}_{}"' .format(self.thread_id,get_next_UID()), shell=True)
			#print("checked-in for thread {}" .format(self.thread_id))
			time.sleep(1)
			

def get_next_UID():
	global UID
	UID += 1
	return UID
			
			
threads = []
start_time = time.time()
for num in range(7):
    thread = hit_server(num+1)
    thread.start()
    time.sleep(0.14)
    threads.append(thread)

for thread in threads:
    thread.join()
end_time = time.time()

duration = end_time - start_time;
print("checked in {} students in {}" .format(6*50,duration))