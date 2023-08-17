DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`
(
    idx         INT          NOT NULL AUTO_INCREMENT,
    id          VARCHAR(255) NOT NULL,
    password          VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    create_date TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_date TIMESTAMP    NULL ON UPDATE CURRENT_TIMESTAMP,
    delete_date TIMESTAMP    NULL,
    PRIMARY KEY (idx),
    UNIQUE (id)
);