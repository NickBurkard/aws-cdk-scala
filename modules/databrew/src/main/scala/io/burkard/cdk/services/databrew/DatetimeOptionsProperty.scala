package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatetimeOptionsProperty {

  def apply(
    format: Option[String] = None,
    localeCode: Option[String] = None,
    timezoneOffset: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty.Builder)
      .format(format.orNull)
      .localeCode(localeCode.orNull)
      .timezoneOffset(timezoneOffset.orNull)
      .build()
}
