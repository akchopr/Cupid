CREATE TABLE Quote (
  mID  VARCHAR(10), cID  VARCHAR(10), qID  VARCHAR(10), itemID  VARCHAR(10), uPrice  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(qID)
);


CREATE TABLE POrder (
  mID  VARCHAR(10), cID  VARCHAR(10), oID  VARCHAR(10), qID  VARCHAR(10), qty  VARCHAR(10), addr  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(oID)
);


CREATE TABLE Payment (
  mID  VARCHAR(10), cID  VARCHAR(10), pID  VARCHAR(10), oID  VARCHAR(10), pPrice  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(pID)
);


CREATE TABLE Shipment (
  mID  VARCHAR(10), cID  VARCHAR(10), sID  VARCHAR(10), oID  VARCHAR(10), addr  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(sID)
);


CREATE TABLE Refund (
  mID  VARCHAR(10), cID  VARCHAR(10), rID  VARCHAR(10), pID  VARCHAR(10), rAmount  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(rID)
);


CREATE TABLE Coupon (
  mID  VARCHAR(10), cID  VARCHAR(10), uID  VARCHAR(10), oID  VARCHAR(10), rebate  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(uID)
);

