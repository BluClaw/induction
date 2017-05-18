
ClusterManager clusterManager = new IgniteClusterManager();

VertxOptions options = new VertxOptions().setClusterManager(clusterManager);
Vertx.clusteredVertx(options, res -> {
  if (res.succeeded()) {
    Vertx vertx = res.result();
  } else {
    // failed!
  }
});
