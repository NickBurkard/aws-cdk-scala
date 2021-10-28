package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Port {

  def apply(
    toPort: Option[Number] = None,
    fromPort: Option[Number] = None,
    stringRepresentation: Option[String] = None,
    protocol: Option[software.amazon.awscdk.services.ec2.Protocol] = None
  ): software.amazon.awscdk.services.ec2.Port =
    software.amazon.awscdk.services.ec2.Port.Builder
      .create()
      .toPort(toPort.orNull)
      .fromPort(fromPort.orNull)
      .stringRepresentation(stringRepresentation.orNull)
      .protocol(protocol.orNull)
      .build()
}
