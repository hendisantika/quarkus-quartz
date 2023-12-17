package com.hendisantika;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;

/**
 * Created by IntelliJ IDEA.
 * Project : quarkus-quartz
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/18/23
 * Time: 05:29
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "TASKS")
public class Task extends PanacheEntity {
    public Instant createdAt;

    public Task() {
        createdAt = Instant.now();
    }

    public Task(Instant time) {
        this.createdAt = time;
    }
}
