-- Add buildings
INSERT INTO BUILDING (ID, BUILDING_NUMBER, DESCRIPTION, PUBLIC_ACCESS) VALUES (-1, '746', 'Haupzentrale', true);
INSERT INTO BUILDING (ID, BUILDING_NUMBER, DESCRIPTION, PUBLIC_ACCESS) VALUES (-2, '152', 'Audimax', true);
INSERT INTO BUILDING (ID, BUILDING_NUMBER, DESCRIPTION, PUBLIC_ACCESS) VALUES (-3, '007', 'Produktion', false);
INSERT INTO BUILDING (ID, BUILDING_NUMBER, DESCRIPTION, PUBLIC_ACCESS) VALUES (-4, '324', 'Lager', false);

-- Add rooms
-- INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (0, -1, '846', '5400', true);
-- INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (1, -1, '846', '400', false);
-- INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (2, -2, '846', '10', true);
-- INSERT INTO ROOM (ID, BUILDING_ID, ROOM_NUMBER, SEATS, PROJECTOR_PRESENT) VALUES (3, -1, '846', '70', false);