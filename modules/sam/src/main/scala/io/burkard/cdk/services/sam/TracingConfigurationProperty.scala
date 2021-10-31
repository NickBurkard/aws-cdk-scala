package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TracingConfigurationProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty =
    (new software.amazon.awscdk.services.sam.CfnStateMachine.TracingConfigurationProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
