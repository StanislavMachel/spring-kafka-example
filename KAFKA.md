Download kafka

```shell
curl -O https://dlcdn.apache.org/kafka/3.7.0/kafka_2.13-3.7.0.tgz
```

```shell
tar -xzf kafka_2.13-3.7.0.tgz
```

```shell
cd kafka_2.13-3.7.0
```

Start the ZooKeeper service
```shell
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Start the Kafka broker service
```shell
bin/kafka-server-start.sh config/server.properties
```

```shell
bin/kafka-console-consumer.sh --topic test --from-beginning --bootstrap-server localhost:9092
```
