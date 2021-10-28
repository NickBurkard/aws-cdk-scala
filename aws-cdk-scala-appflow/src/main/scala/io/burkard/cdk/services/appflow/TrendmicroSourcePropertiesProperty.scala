package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TrendmicroSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
