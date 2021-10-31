package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElasticIpProperty {

  def apply(
    name: Option[String] = None,
    ip: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty =
    (new software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder)
      .name(name.orNull)
      .ip(ip.orNull)
      .build()
}
