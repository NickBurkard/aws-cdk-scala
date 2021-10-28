package io.burkard.cdk.services.memorydb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointProperty {

  def apply(
    port: Option[Number] = None,
    address: Option[String] = None
  ): software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty =
    (new software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty.Builder)
      .port(port.orNull)
      .address(address.orNull)
      .build()
}
