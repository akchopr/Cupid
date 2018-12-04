/*For Simple, we obtain these queries:*/

/*CREATED*/

SELECT mID, cID, tID, itemID, uPrice, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query0 WHERE stamp<NOW();

/*DETACHED*/

SELECT mID, cID, tID, itemID, uPrice, qty, addr, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, qty, addr, GREATEST(Query2.stamp,Query8.stamp1) AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query2 NATURAL JOIN (SELECT mID, cID, tID, qty, addr ,stamp AS stamp1 FROM (SELECT mID, cID, tID, qty, addr, itemID, uPrice, GREATEST(Query3.stamp,Query10.stamp2) AS stamp FROM (SELECT mID, cID, tID, qty, addr, stamp FROM POrder) AS Query3 NATURAL JOIN (SELECT mID, cID, tID, itemID, uPrice ,stamp AS stamp2 FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query4) AS Query10 WHERE '1000-01-01 00:00:00'<=Query3.stamp AND Query3.stamp<Query10.stamp2+Interval 1 day) AS Query5) AS Query8) AS Query6 WHERE stamp<NOW();

/*EXPIRED*/

SELECT mID, cID, tID, itemID, uPrice, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, qty, addr, GREATEST(Query12.stamp,Query26.stamp4) AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query12 NATURAL JOIN (SELECT mID, cID, tID, qty, addr ,stamp AS stamp4 FROM (SELECT mID, cID, tID, qty, addr, stamp FROM POrder WHERE '1000-01-01 00:00:00'<=stamp AND stamp<'1000-01-01 00:00:00') AS Query17) AS Query26) AS Query18 UNION SELECT mID, cID, tID, itemID, uPrice, GREATEST(Query21.stamp,Query23.stamp3) AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query21 WHERE (mID, cID, tID) NOT IN (SELECT mID, cID, tID FROM (SELECT mID, cID, tID, qty, addr, itemID, uPrice, GREATEST(Query13.stamp,Query28.stamp5) AS stamp FROM (SELECT mID, cID, tID, qty, addr, stamp FROM POrder) AS Query13 NATURAL JOIN (SELECT mID, cID, tID, itemID, uPrice ,stamp AS stamp5 FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query14) AS Query28 WHERE '1000-01-01 00:00:00'<=Query13.stamp AND Query13.stamp<Query28.stamp5+Interval 1 day) AS Query20)) AS Query21 NATURAL JOIN (SELECT mID, cID, tID, itemID, uPrice ,stamp AS stamp3 FROM (SELECT mID, cID, tID, itemID, uPrice ,stamp+Interval 1 day AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) ASQuery14) AS Query22) AS Query23) AS Query15 WHERE stamp<NOW();

/*DISCHARGED*/

SELECT mID, cID, tID, itemID, uPrice, addr, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, addr, GREATEST(Query30.stamp,Query36.stamp6) AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query30 NATURAL JOIN (SELECT mID, cID, tID, addr ,stamp AS stamp6 FROM (SELECT mID, cID, tID, addr, qty, GREATEST(Query31.stamp,Query38.stamp7) AS stamp FROM (SELECT mID, cID, tID, addr, stamp FROM Shipment) AS Query31 NATURAL JOIN (SELECT mID, cID, tID, qty, addr ,stamp AS stamp7 FROM (SELECT mID, cID, tID, qty, addr, stamp FROM POrder) AS Query32) AS Query38 WHERE '1000-01-01 00:00:00'<=Query31.stamp AND Query31.stamp<Query38.stamp7+Interval 5 day) AS Query33) AS Query36) AS Query34 WHERE stamp<NOW();

/*VIOLATED*/

SELECT mID, cID, tID, itemID, uPrice, qty, addr, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, qty, addr, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, qty, addr, GREATEST(Query44.stamp,Query58.stamp9) AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, qty, addr, GREATEST(Query40.stamp,Query60.stamp10) AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query40 NATURAL JOIN (SELECT mID, cID, tID, qty, addr ,stamp AS stamp10 FROM (SELECT mID, cID, tID, qty, addr, itemID, uPrice, GREATEST(Query41.stamp,Query62.stamp11) AS stamp FROM (SELECT mID, cID, tID, qty, addr, stamp FROM POrder) AS Query41 NATURAL JOIN (SELECT mID, cID, tID, itemID, uPrice ,stamp AS stamp11 FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query42) AS Query62 WHERE '1000-01-01 00:00:00'<=Query41.stamp AND Query41.stamp<Query62.stamp11+Interval 1 day) AS Query43) AS Query60) AS Query44 NATURAL JOIN (SELECT mID, cID, tID, addr ,stamp AS stamp9 FROM (SELECT mID, cID, tID, addr, stamp FROM Shipment WHERE '1000-01-01 00:00:00'<=stamp AND stamp<'1000-01-01 00:00:00') AS Query49) AS Query58) AS Query50 UNION SELECT mID, cID, tID, itemID, uPrice, qty, addr, GREATEST(Query53.stamp,Query55.stamp8) AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, qty, addr, stamp FROM (SELECT mID, cID, tID, itemID, uPrice, qty, addr, GREATEST(Query40.stamp,Query64.stamp12) AS stamp FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query40 NATURAL JOIN (SELECT mID, cID, tID, qty, addr ,stamp AS stamp12 FROM (SELECT mID, cID, tID, qty, addr, itemID, uPrice, GREATEST(Query41.stamp,Query66.stamp13) AS stamp FROM (SELECT mID, cID, tID, qty, addr, stamp FROM POrder) AS Query41 NATURAL JOIN (SELECT mID, cID, tID, itemID, uPrice ,stamp AS stamp13 FROM (SELECT mID, cID, tID, itemID, uPrice, stamp FROM Quote) AS Query42) AS Query66 WHERE '1000-01-01 00:00:00'<=Query41.stamp AND Query41.stamp<Query66.stamp13+Interval 1 day) AS Query43) AS Query64) AS Query53 WHERE (mID, cID, tID, addr) NOT IN (SELECT mID, cID, tID, addr FROM (SELECT mID, cID, tID, addr, qty, GREATEST(Query45.stamp,Query68.stamp14) AS stamp FROM (SELECT mID, cID, tID, addr, stamp FROM Shipment) AS Query45 NATURAL JOIN (SELECT mID, cID, tID, qty, addr ,stamp AS stamp14 FROM (SELECT mID, cID, tID, qty, addr, stamp FROM POrder) AS Query46) AS Query68 WHERE '1000-01-01 00:00:00'<=Query45.stamp AND Query45.stamp<Query68.stamp14+Interval 5 day) AS Query52)) AS Query53 NATURAL JOIN (SELECT mID, cID, tID, qty, addr ,stamp AS stamp8 FROM (SELECT mID, cID, tID, qty, addr ,stamp+Interval 5 day AS stamp FROM (SELECT mID, cID, tID, qty, addr, stamp FROM POrder) ASQuery46) AS Query54) AS Query55) AS Query47 WHERE stamp<NOW();
