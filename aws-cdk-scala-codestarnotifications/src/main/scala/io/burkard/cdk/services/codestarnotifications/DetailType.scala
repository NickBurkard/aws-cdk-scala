package io.burkard.cdk.services.codestarnotifications

sealed abstract class DetailType(val underlying: software.amazon.awscdk.services.codestarnotifications.DetailType)
  extends Product
    with Serializable

object DetailType {
  implicit def toAws(value: DetailType): software.amazon.awscdk.services.codestarnotifications.DetailType =
    Option(value).map(_.underlying).orNull

  case object Basic
    extends DetailType(software.amazon.awscdk.services.codestarnotifications.DetailType.BASIC)

  case object Full
    extends DetailType(software.amazon.awscdk.services.codestarnotifications.DetailType.FULL)
}
