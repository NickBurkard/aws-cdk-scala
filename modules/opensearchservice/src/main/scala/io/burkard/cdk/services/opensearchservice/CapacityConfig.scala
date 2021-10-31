package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CapacityConfig {

  def apply(
    masterNodes: Option[Number] = None,
    dataNodes: Option[Number] = None,
    warmNodes: Option[Number] = None,
    masterNodeInstanceType: Option[String] = None,
    warmInstanceType: Option[String] = None,
    dataNodeInstanceType: Option[String] = None
  ): software.amazon.awscdk.services.opensearchservice.CapacityConfig =
    (new software.amazon.awscdk.services.opensearchservice.CapacityConfig.Builder)
      .masterNodes(masterNodes.orNull)
      .dataNodes(dataNodes.orNull)
      .warmNodes(warmNodes.orNull)
      .masterNodeInstanceType(masterNodeInstanceType.orNull)
      .warmInstanceType(warmInstanceType.orNull)
      .dataNodeInstanceType(dataNodeInstanceType.orNull)
      .build()
}
