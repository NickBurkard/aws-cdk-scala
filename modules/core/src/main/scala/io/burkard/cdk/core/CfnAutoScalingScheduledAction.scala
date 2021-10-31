package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAutoScalingScheduledAction {

  def apply(
    ignoreUnmodifiedGroupSizeProperties: Option[Boolean] = None
  ): software.amazon.awscdk.CfnAutoScalingScheduledAction =
    (new software.amazon.awscdk.CfnAutoScalingScheduledAction.Builder)
      .ignoreUnmodifiedGroupSizeProperties(ignoreUnmodifiedGroupSizeProperties.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
