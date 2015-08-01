select * from (   
	(SELECT mID,cID,qID,itemID,uPrice,stamp FROM Quote) as tabl21 
	 natural join 
	(SELECT  mID, cID, oID, qID, qty, addr, stamp AS stamp1 FROM 
         (SELECT  mID, cID, oID, qID, qty, addr, stamp FROM POrder) as tab1) 
as tabl2);

select * from (Quote);

select * from (   
	SELECT mID,cID,qID,itemID,uPrice,stamp FROM Quote
	 union
	SELECT mID,cID,qID,itemID,uPrice,stamp FROM Quote) as tabl2;

select * from (   
	select * from (SELECT mID,cID,qID,itemID,uPrice,stamp FROM Quote) as table21
	 union
	SELECT mID,cID,qID,itemID,uPrice,stamp FROM Quote) as tabl2;

	
select * from (   
	select * from (SELECT mID,cID,qID,itemID,uPrice,stamp FROM Quote where qid=5) as table21
	 union
	SELECT mID,cID,qID,itemID,uPrice,stamp FROM Quote) as tabl2;
	
SELECT 
    mID,
    cID,
    qID,
    itemID,
    uPrice,
    oID,
    qty,
    addr,
    GREATEST(Quote.stamp, POrder.stamp) AS stamp
FROM Quote NATURAL JOIN POrder;

/* This is the query to generate for an Quote and POrder
SELECT mID,cID,qID,itemID, uPrice,oID,qty,addr,GREATEST(table1.stamp, table2.stamp) AS stamp
FROM (Select mID, cID, qID, itemID, uPrice, stamp from Quote) as table1 NATURAL JOIN (Select mID, cID, oID, qID, qty, addr,stamp from POrder) as table2;

SELECT mID,cID,qID,itemID, uPrice,stamp FROM (Select mID, cID, qID, itemID, uPrice, stamp from Quote UNION Select mID, cID, qID, itemID, uPrice, stamp from Quote) as table2;

SELECT mID, cID, qID, itemID, uPrice, oID, qty, addr, LEAST(COALESCE(Query0.stamp,Query1.stamp),COALESCE(Query1.stamp,Query0.stamp)) AS stamp FROM (SELECT mID, cID, qID, itemID, uPrice, stamp FROM Quote) AS Query0 NATURAL LEFT OUTER JOIN (SELECT mID, cID, oID, qID, qty, addr, stamp FROM POrder) AS Query1 WHERE itemID=5;

