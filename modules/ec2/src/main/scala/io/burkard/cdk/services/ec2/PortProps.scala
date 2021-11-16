package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortProps {

  def apply(
    stringRepresentation: String,
    protocol: software.amazon.awscdk.services.ec2.Protocol,
    toPort: Option[Number] = None,
    fromPort: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.PortProps =
    (new software.amazon.awscdk.services.ec2.PortProps.Builder)
      .stringRepresentation(stringRepresentation)
      .protocol(protocol)
      .toPort(toPort.orNull)
      .fromPort(fromPort.orNull)
      .build()
}
