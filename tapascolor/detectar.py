  
import cv2

cap = cv2.VideoCapture(0,cv2.CAP_DSHOW)

majinBooClassif = cv2.CascadeClassifier('cascade.xml')

while True:
	
	ret,frame = cap.read()
	gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

	toy = majinBooClassif.detectMultiScale(gray,
	scaleFactor = 9, #PORCENTAJE DE REDUCCION 1=10% < porcentaje > analisis > mas muestras
	minNeighbors = 265, #numero de cuadro limitadores observados para ser el objeto (mas valor<menos identificaciones)
	minSize=(70,78), #minimos identificados
	#maxSize=(300,300) #maximo identificados
	)

	for (x,y,w,h) in toy:
		cv2.rectangle(frame, (x,y),(x+w,y+h),(0,255,0),2)
		cv2.putText(frame,'Bote',(x,y-10),2,0.7,(0,255,0),2,cv2.LINE_AA)

	cv2.imshow('frame',frame)
	
	if cv2.waitKey(1) == 27:
		break
cap.release()
cv2.destroyAllWindows()