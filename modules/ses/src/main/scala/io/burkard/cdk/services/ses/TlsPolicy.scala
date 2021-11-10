package io.burkard.cdk.services.ses


sealed abstract class TlsPolicy(val underlying: software.amazon.awscdk.services.ses.TlsPolicy)
  extends Product
    with Serializable


object TlsPolicy {
  implicit def toAws(value: TlsPolicy): software.amazon.awscdk.services.ses.TlsPolicy =
    Option(value).map(_.underlying).orNull

  case object Optional
    extends TlsPolicy(software.amazon.awscdk.services.ses.TlsPolicy.OPTIONAL)

  case object Require
    extends TlsPolicy(software.amazon.awscdk.services.ses.TlsPolicy.REQUIRE)
}
