package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MarketoSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.MarketoSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
