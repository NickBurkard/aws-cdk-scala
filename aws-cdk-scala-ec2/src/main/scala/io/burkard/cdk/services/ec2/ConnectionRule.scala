package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectionRule {

  def apply(
    toPort: Option[Number] = None,
    description: Option[String] = None,
    fromPort: Option[Number] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.ec2.ConnectionRule =
    (new software.amazon.awscdk.services.ec2.ConnectionRule.Builder)
      .toPort(toPort.orNull)
      .description(description.orNull)
      .fromPort(fromPort.orNull)
      .protocol(protocol.orNull)
      .build()
}
