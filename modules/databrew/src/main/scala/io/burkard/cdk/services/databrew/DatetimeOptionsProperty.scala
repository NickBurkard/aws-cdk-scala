package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatetimeOptionsProperty {

  def apply(
    format: String,
    localeCode: Option[String] = None,
    timezoneOffset: Option[String] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty.Builder)
      .format(format)
      .localeCode(localeCode.orNull)
      .timezoneOffset(timezoneOffset.orNull)
      .build()
}
