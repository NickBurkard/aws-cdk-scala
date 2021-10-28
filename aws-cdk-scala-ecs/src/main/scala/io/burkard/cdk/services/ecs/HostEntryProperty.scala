package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HostEntryProperty {

  def apply(
    hostname: Option[String] = None,
    ipAddress: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty =
    (new software.amazon.awscdk.services.ecs.CfnTaskDefinition.HostEntryProperty.Builder)
      .hostname(hostname.orNull)
      .ipAddress(ipAddress.orNull)
      .build()
}
