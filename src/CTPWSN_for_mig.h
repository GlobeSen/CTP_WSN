#ifndef CTPWSN_FOR_MIG_H
#define CTPWSN_FOR_MIG_H
typedef struct message{
 	uint16_t msgType;
 	uint16_t leftUp_x;
 	uint16_t leftUp_y;
 	uint16_t rightDown_x;
 	uint16_t rightDown_y;
 	uint16_t start_time;
 	uint16_t end_time;
 	uint16_t dataType;
 	uint16_t data;
 	uint8_t hop;
 }Msg;
 typedef struct time_message{
 	uint16_t msgType;
 	uint16_t time;
 }TimeMsg;
 
 
#endif /* CTPWSN_FOR_MIG_H */
