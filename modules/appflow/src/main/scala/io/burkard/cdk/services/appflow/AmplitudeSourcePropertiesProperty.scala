package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmplitudeSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.AmplitudeSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
