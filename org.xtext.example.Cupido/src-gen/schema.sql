CREATE TABLE Quote (
  mID  VARCHAR(10), cID  VARCHAR(10), tID  VARCHAR(10), itemID  VARCHAR(10), uPrice  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(tID)
);


CREATE TABLE POrder (
  mID  VARCHAR(10), cID  VARCHAR(10), tID  VARCHAR(10), qty  VARCHAR(10), addr  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(tID)
);


CREATE TABLE Payment (
  mID  VARCHAR(10), cID  VARCHAR(10), tID  VARCHAR(10), pPrice  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(tID)
);


CREATE TABLE Shipment (
  mID  VARCHAR(10), cID  VARCHAR(10), tID  VARCHAR(10), addr  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(tID)
);


CREATE TABLE Refund (
  mID  VARCHAR(10), cID  VARCHAR(10), tID  VARCHAR(10), rAmount  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(tID)
);


CREATE TABLE Coupon (
  mID  VARCHAR(10), cID  VARCHAR(10), tID  VARCHAR(10), rebate  VARCHAR(10), 
  stamp  DATETIME, 
  PRIMARY KEY(tID)
);


