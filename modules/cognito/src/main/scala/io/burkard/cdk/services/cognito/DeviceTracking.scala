package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeviceTracking {

  def apply(
    challengeRequiredOnNewDevice: Boolean,
    deviceOnlyRememberedOnUserPrompt: Boolean
  ): software.amazon.awscdk.services.cognito.DeviceTracking =
    (new software.amazon.awscdk.services.cognito.DeviceTracking.Builder)
      .challengeRequiredOnNewDevice(challengeRequiredOnNewDevice)
      .deviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt)
      .build()
}
