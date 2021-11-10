package io.burkard.cdk.services.globalaccelerator


sealed abstract class ClientAffinity(val underlying: software.amazon.awscdk.services.globalaccelerator.ClientAffinity)
  extends Product
    with Serializable


object ClientAffinity {
  implicit def toAws(value: ClientAffinity): software.amazon.awscdk.services.globalaccelerator.ClientAffinity =
    Option(value).map(_.underlying).orNull

  case object None
    extends ClientAffinity(software.amazon.awscdk.services.globalaccelerator.ClientAffinity.NONE)

  case object SourceIp
    extends ClientAffinity(software.amazon.awscdk.services.globalaccelerator.ClientAffinity.SOURCE_IP)
}
