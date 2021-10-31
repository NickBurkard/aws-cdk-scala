package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AudioPidSelectionProperty {

  def apply(
    pid: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty.Builder)
      .pid(pid.orNull)
      .build()
}
