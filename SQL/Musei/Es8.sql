SELECT ARTISTI.NomeA, OPERE.Titolo
FROM OPERE, ARTISTI, MUSEI
WHERE OPERE.CodA = ARTISTI.CodA 
  AND OPERE.CodM = MUSEI.CodM 
  AND ARTISTI.Nazionalita = 'Spagnola' 
  AND MUSEI.Citta = 'Firenze';
