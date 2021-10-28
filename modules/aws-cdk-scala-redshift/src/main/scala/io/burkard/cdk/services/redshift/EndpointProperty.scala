package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EndpointProperty {

  def apply(
    port: Option[String] = None,
    address: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty =
    (new software.amazon.awscdk.services.redshift.CfnCluster.EndpointProperty.Builder)
      .port(port.orNull)
      .address(address.orNull)
      .build()
}
