CREATE TABLE `borrowed` (
  `borrowed_id` int(11) ,
  `borrowed_bookid` int(11) ,
  `borrowed_date` timestamp,
  `borrowed_returndate` timestamp,
  `borrowed_status` enum ('returned', `pending`),
);


CREATE TABLE `bcard` (
  `bcard_id` int(11) ,
  `bcard_status` boolean ,
  `bcard_amountdue` float,
  `bcard_studentid` int(11),
  `bcard_proccess` timestamp,
  `bcard_processby` int(11),
  `bcard_paymenttype` enum('cash', 'rfid') , 
);

CREATE TABLE `category` (
  `category_id` int(11) ,
  `category_name` varchar(50) ,
  `category_price` float,
  `category_days` int(11),
  `category_added` timestamp ,
  `category_addedby` int(11),
);

-- IF NAA MOY SUGGESTION NGA ENTITY SA BOOK PLS KO INGON


CREATE TABLE `book` (
  `book_id` int(11) ,
  `book_barcode` varchar(50),
  `book_name` varchar(50) ,
  `book_author` varchar(50),
  `book_yearreleased` varchar(50),
  `book_categoryid` int(11),
  `book_added` timestamp ,
  `book_addedby` int(11),
  `book_modified` timestamp ,
  `book_modifiedby` int(11) 
);


CREATE TABLE `items` (
  `items_id` int(11) ,
  `items_productid` int(11) ,
  `items_quantity` int(11),
  `items_studentid` int(11),
  `items_subtotal` float,
  `items_transactionid` int(11) , 
);


CREATE TABLE `transaction` (
  `transaction_id` int(11) ,
  `transaction_datetime` timestamp ,
  `transaction_total` float,
  `transaction_studentid` int(11),
  `transaction_processby` int(11),
  `transaction_paymenttype` enum('cash', 'rfid') , 
);


CREATE TABLE `product` (
  `product_id` int(11) ,
  `product_name` varchar(50) ,
  `product_quantity` int(11),
  `product_price` float,
  `product_added` timestamp ,
  `product_addedby` int(11),
  `product_modified` timestamp ,
  `product_modifiedby` int(11) 
);


CREATE TABLE `card` (
  `card_id` int(11) ,
  `card_load` float ,
  `card_status` enum('activated','deactivated'),
  `card_added` timestamp ,
  `card_addedby` int(11) 
);



CREATE TABLE `parent` (
  `parent_id` int(11) ,
  `parent_fname` varchar(50) ,
  `parent_mname` varchar(50) ,
  `parent_suffix` varchar(10) ,
  `parent_lname` varchar(50) ,
  `parent_contactno` varchar(20) ,
  `parent_added` timestamp ,
  `parent_addedby` int(11) 
);


CREATE TABLE `sms` (
  `sms_id` int(11) ,
  `sms_content` varchar(200) ,
  `sms_added` timestamp ,
  `sms_addedby` int(11) 
);

CREATE TABLE `student` (
  `student_id` int(11) ,
  `student_fname` varchar(50) ,
  `student_mname` varchar(50) ,
  `student_suffix` varchar(10) ,
  `student_lname` varchar(50) ,
  `stundet_picture` varchar(50),
  `student_grade` enum('1','2','3','4','5','6','7','8','9','10','11','12') ,
  `student_timein` timestamp ,
  `student_timeout` timestamp ,
  `student_parentid` int(11) ,
  `student_card` int(11) ,
  `student_borrowercard` int(11) ,
  `student_added` timestamp ,
  `student_addedby` int(11) 
);



CREATE TABLE `user` (
  `user_id` int(11) ,
  `user_fname` varchar(50) ,
  `user_mname` varchar(50) ,
  `user_suffix` varchar(10) ,
  `user_lname` varchar(50) ,
  `user_position` enum('DIRECTOR','PRINCIPAL','COORDINATOR','FACULTY') ,
  `user_type` enum('ADMIN','REGULAR','SUPERAMDIN') ,
  `user_access` enum('ALL','ATT','CTN','LBR') ,
  `user_added` timestamp ,
  `user_addedby` int(11) ,
  `user_password` varchar(512) 
);


