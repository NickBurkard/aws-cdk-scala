package io.burkard.cdk.services.dlm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EventSourceProperty {

  def apply(
    `type`: Option[String] = None,
    parameters: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty.Builder)
      .`type`(`type`.orNull)
      .parameters(parameters.orNull)
      .build()
}
