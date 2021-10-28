package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
