package io.burkard.cdk.services.appmesh


sealed abstract class TlsMode(val underlying: software.amazon.awscdk.services.appmesh.TlsMode)
  extends Product
    with Serializable


object TlsMode {
  implicit def toAws(value: TlsMode): software.amazon.awscdk.services.appmesh.TlsMode =
    Option(value).map(_.underlying).orNull

  case object Strict
    extends TlsMode(software.amazon.awscdk.services.appmesh.TlsMode.STRICT)

  case object Permissive
    extends TlsMode(software.amazon.awscdk.services.appmesh.TlsMode.PERMISSIVE)

  case object Disabled
    extends TlsMode(software.amazon.awscdk.services.appmesh.TlsMode.DISABLED)
}
