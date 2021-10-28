package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MathExpressionOptions {

  def apply(
    searchAccount: Option[String] = None,
    searchRegion: Option[String] = None,
    label: Option[String] = None,
    color: Option[String] = None,
    period: Option[software.amazon.awscdk.Duration] = None
  ): software.amazon.awscdk.services.cloudwatch.MathExpressionOptions =
    (new software.amazon.awscdk.services.cloudwatch.MathExpressionOptions.Builder)
      .searchAccount(searchAccount.orNull)
      .searchRegion(searchRegion.orNull)
      .label(label.orNull)
      .color(color.orNull)
      .period(period.orNull)
      .build()
}
