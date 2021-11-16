package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SingularSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SingularSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
