-- 코드를 작성해주세요
SELECT concat(max(LENGTH),'cm') as MAX_LENGTH
FROM FISH_INFO

-- 물고기 길이 10cm이하는 LENGTH는 null
-- LENGTH가 NULL만 있는 경우는 없음
-- FISH_INFO 테이블에서 잡은 물고기 중 가장 큰 물고기 길이에 cm붙이기 
-- 컬럼명은 MAX_LENGTH