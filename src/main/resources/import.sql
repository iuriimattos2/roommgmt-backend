-- Add buildings
INSERT INTO BUILDING (ID, BUILDING_NUMBER, DESCRIPTION, PUBLIC_ACCESS) VALUES (-1, '746', 'Hauptzentrale', true);
INSERT INTO BUILDING (ID, BUILDING_NUMBER, DESCRIPTION, PUBLIC_ACCESS) VALUES (-2, '152', 'Keynote-Halle', true);
INSERT INTO BUILDING (ID, BUILDING_NUMBER, DESCRIPTION, PUBLIC_ACCESS) VALUES (-3, '007', 'Produktion', false);
INSERT INTO BUILDING (ID, BUILDING_NUMBER, DESCRIPTION, PUBLIC_ACCESS) VALUES (-4, '324', 'Lager', false);

-- Add rooms
INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (-1, -2, '840', '5500', true);
INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (-2, -4, '110', '400', false);
INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (-3, -1, '972', '10', true);
INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (-4, -3, '016', '70', false);
INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (-5, -2, '233', '1700', true);
INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (-6, -2, '634', '500', true);
INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (-7, -1, '435', '7700', true);
INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (-8, -1, '133', '9900', true);

-- ADD meetings
INSERT INTO MEETING (ID, ROOM_ID, TOPIC, START, END) VALUES (-1, -2, 'Abomodelle', '2020-03-13T15:30:59.970Z', '2020-03-14T16:28:59.970Z');
INSERT INTO MEETING (ID, ROOM_ID, TOPIC, START, END) VALUES (-2, -2, 'Neue Features', '2021-04-13T08:00:39.970Z', '2021-04-13T13:15:00.970Z');
INSERT INTO MEETING (ID, ROOM_ID, TOPIC, START, END) VALUES (-3, -1, 'Digitalisierung', '2020-02-08T19:18:59.970Z', '2020-02-08T20:38:00.970Z');
INSERT INTO MEETING (ID, ROOM_ID, TOPIC, START, END) VALUES (-4, -3, 'Produktionsverarbeitung', '2021-01-02T15:30:59.970Z', '2021-01-02T18:00:59.970Z');
INSERT INTO MEETING (ID, ROOM_ID, TOPIC, START, END) VALUES (-5, -2, 'Kubernetes', '2020-09-11T18:30:59.970Z', '2020-09-11T20:28:59.970Z');
INSERT INTO MEETING (ID, ROOM_ID, TOPIC, START, END) VALUES (-6, -2, 'Schulung', '2020-03-13T15:00:59.970Z', '2020-06-10T15:28:59.970Z');
INSERT INTO MEETING (ID, ROOM_ID, TOPIC, START, END) VALUES (-7, -1, 'Agile Methoden', '2021-04-13T09:30:59.970Z', '2021-04-13T16:46:59.970Z');
INSERT INTO MEETING (ID, ROOM_ID, TOPIC, START, END) VALUES (-8, -1, 'Continious Integration', '2020-05-19T13:30:59.970Z', '2020-05-19T16:28:59.970Z');