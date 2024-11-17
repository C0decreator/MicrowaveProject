CREATE TABLE microwave_programs (
                                    id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                    name VARCHAR(100) NOT NULL,
                                    power INT NOT NULL,
                                    duration_seconds INT NOT NULL,
                                    is_custom BOOLEAN NOT NULL
);