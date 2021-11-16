package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TaskPropertiesObjectProperty {

  def apply(
    key: String,
    value: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.TaskPropertiesObjectProperty.Builder)
      .key(key)
      .value(value)
      .build()
}
