package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CapacityConfig {

  def apply(
    masterNodes: Option[Number] = None,
    dataNodes: Option[Number] = None,
    warmNodes: Option[Number] = None,
    masterNodeInstanceType: Option[String] = None,
    warmInstanceType: Option[String] = None,
    dataNodeInstanceType: Option[String] = None
  ): software.amazon.awscdk.services.elasticsearch.CapacityConfig =
    (new software.amazon.awscdk.services.elasticsearch.CapacityConfig.Builder)
      .masterNodes(masterNodes.orNull)
      .dataNodes(dataNodes.orNull)
      .warmNodes(warmNodes.orNull)
      .masterNodeInstanceType(masterNodeInstanceType.orNull)
      .warmInstanceType(warmInstanceType.orNull)
      .dataNodeInstanceType(dataNodeInstanceType.orNull)
      .build()
}
