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
