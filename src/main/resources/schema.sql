CREATE TABLE users (
                       id BIGSERIAL PRIMARY KEY,
                       name VARCHAR(100),
                       role VARCHAR(20) -- STUDENT / TUTOR
);

CREATE TABLE tests (
                       id BIGSERIAL PRIMARY KEY,
                       name VARCHAR(100),
                       subject VARCHAR(100),
                       author_id BIGINT REFERENCES users(id)
);

CREATE TABLE questions (
                           id BIGSERIAL PRIMARY KEY,
                           text TEXT,
                           type VARCHAR(20), -- SINGLE / MULTIPLE
                           test_id BIGINT REFERENCES tests(id)
);

CREATE TABLE answer_options (
                                id BIGSERIAL PRIMARY KEY,
                                text TEXT,
                                is_correct BOOLEAN,
                                question_id BIGINT REFERENCES questions(id)
);

CREATE TABLE user_test_results (
                                   id BIGSERIAL PRIMARY KEY,
                                   user_id BIGINT REFERENCES users(id),
                                   test_id BIGINT REFERENCES tests(id),
                                   score INT
);
