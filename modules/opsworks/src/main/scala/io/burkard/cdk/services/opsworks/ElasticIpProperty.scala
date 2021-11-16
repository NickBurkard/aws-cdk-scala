package io.burkard.cdk.services.opsworks

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ElasticIpProperty {

  def apply(
    ip: String,
    name: Option[String] = None
  ): software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty =
    (new software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder)
      .ip(ip)
      .name(name.orNull)
      .build()
}
