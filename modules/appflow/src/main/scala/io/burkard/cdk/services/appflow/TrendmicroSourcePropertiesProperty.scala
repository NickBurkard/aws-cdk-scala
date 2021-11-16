package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrendmicroSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.TrendmicroSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
