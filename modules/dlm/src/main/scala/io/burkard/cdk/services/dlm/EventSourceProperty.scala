package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EventSourceProperty {

  def apply(
    `type`: String,
    parameters: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty.Builder)
      .`type`(`type`)
      .parameters(parameters.orNull)
      .build()
}
