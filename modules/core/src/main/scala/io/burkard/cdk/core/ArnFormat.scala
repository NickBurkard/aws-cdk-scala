package io.burkard.cdk.core

sealed abstract class ArnFormat(val underlying: software.amazon.awscdk.ArnFormat)
  extends Product
    with Serializable

object ArnFormat {
  implicit def toAws(value: ArnFormat): software.amazon.awscdk.ArnFormat =
    Option(value).map(_.underlying).orNull

  case object ColonResourceName
    extends ArnFormat(software.amazon.awscdk.ArnFormat.COLON_RESOURCE_NAME)

  case object NoResourceName
    extends ArnFormat(software.amazon.awscdk.ArnFormat.NO_RESOURCE_NAME)

  case object SlashResourceName
    extends ArnFormat(software.amazon.awscdk.ArnFormat.SLASH_RESOURCE_NAME)

  case object SlashResourceSlashResourceName
    extends ArnFormat(software.amazon.awscdk.ArnFormat.SLASH_RESOURCE_SLASH_RESOURCE_NAME)
}
