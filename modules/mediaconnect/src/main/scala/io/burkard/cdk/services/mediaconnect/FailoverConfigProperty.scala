package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
