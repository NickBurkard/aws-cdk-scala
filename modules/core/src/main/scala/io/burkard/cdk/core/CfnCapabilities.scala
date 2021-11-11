package io.burkard.cdk.core

sealed abstract class CfnCapabilities(val underlying: software.amazon.awscdk.CfnCapabilities)
  extends Product
    with Serializable

object CfnCapabilities {
  implicit def toAws(value: CfnCapabilities): software.amazon.awscdk.CfnCapabilities =
    Option(value).map(_.underlying).orNull

  case object None
    extends CfnCapabilities(software.amazon.awscdk.CfnCapabilities.NONE)

  case object AnonymousIam
    extends CfnCapabilities(software.amazon.awscdk.CfnCapabilities.ANONYMOUS_IAM)

  case object NamedIam
    extends CfnCapabilities(software.amazon.awscdk.CfnCapabilities.NAMED_IAM)

  case object AutoExpand
    extends CfnCapabilities(software.amazon.awscdk.CfnCapabilities.AUTO_EXPAND)
}
