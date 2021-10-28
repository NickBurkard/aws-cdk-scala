package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PortProps {

  def apply(
    toPort: Option[Number] = None,
    fromPort: Option[Number] = None,
    stringRepresentation: Option[String] = None,
    protocol: Option[software.amazon.awscdk.services.ec2.Protocol] = None
  ): software.amazon.awscdk.services.ec2.PortProps =
    (new software.amazon.awscdk.services.ec2.PortProps.Builder)
      .toPort(toPort.orNull)
      .fromPort(fromPort.orNull)
      .stringRepresentation(stringRepresentation.orNull)
      .protocol(protocol.orNull)
      .build()
}
