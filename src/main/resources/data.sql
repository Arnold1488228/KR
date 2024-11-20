-- Insert initial users
INSERT INTO users (name, role) VALUES
                                   ('Alice', 'TUTOR'),
                                   ('Bob', 'STUDENT'),
                                   ('Charlie', 'STUDENT');

-- Insert initial tests
INSERT INTO tests (name, subject, author_id) VALUES
                                                 ('Math Basics', 'Mathematics', 1),
                                                 ('History of the Roman Empire', 'History', 1);

-- Insert questions for tests
INSERT INTO questions (text, type, test_id) VALUES
                                                ('What is 2+2?', 'SINGLE', 1),
                                                ('Select prime numbers.', 'MULTIPLE', 1),
                                                ('Who was the first Roman Emperor?', 'SINGLE', 2),
                                                ('Select the years when Rome was a republic.', 'MULTIPLE', 2);

-- Insert answer options for questions
INSERT INTO answer_options (text, is_correct, question_id) VALUES
-- Question 1
('4', TRUE, 1),
('5', FALSE, 1),
-- Question 2
('2', TRUE, 2),
('3', TRUE, 2),
('4', FALSE, 2),
-- Question 3
('Julius Caesar', FALSE, 3),
('Augustus', TRUE, 3),
-- Question 4
('509 BC', TRUE, 4),
('27 BC', FALSE, 4),
('753 BC', FALSE, 4);

-- Insert initial user test results
INSERT INTO user_test_results (user_id, test_id, score) VALUES
                                                            (2, 1, 80), -- Bob's Math Test
                                                            (3, 2, 90); -- Charlie's History Test
