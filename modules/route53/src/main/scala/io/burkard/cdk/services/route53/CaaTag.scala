package io.burkard.cdk.services.route53


sealed abstract class CaaTag(val underlying: software.amazon.awscdk.services.route53.CaaTag)
  extends Product
    with Serializable


object CaaTag {
  implicit def toAws(value: CaaTag): software.amazon.awscdk.services.route53.CaaTag =
    Option(value).map(_.underlying).orNull

  case object Issue
    extends CaaTag(software.amazon.awscdk.services.route53.CaaTag.ISSUE)

  case object Issuewild
    extends CaaTag(software.amazon.awscdk.services.route53.CaaTag.ISSUEWILD)

  case object Iodef
    extends CaaTag(software.amazon.awscdk.services.route53.CaaTag.IODEF)
}
