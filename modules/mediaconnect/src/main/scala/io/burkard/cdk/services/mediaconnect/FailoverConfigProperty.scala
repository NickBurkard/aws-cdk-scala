package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FailoverConfigProperty {

  def apply(
    state: Option[String] = None,
    recoveryWindow: Option[Number] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlow.FailoverConfigProperty.Builder)
      .state(state.orNull)
      .recoveryWindow(recoveryWindow.orNull)
      .build()
}
