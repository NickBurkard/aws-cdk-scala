package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StudioComponentInitializationScriptProperty {

  def apply(
    launchProfileProtocolVersion: Option[String] = None,
    runContext: Option[String] = None,
    script: Option[String] = None,
    platform: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.StudioComponentInitializationScriptProperty.Builder)
      .launchProfileProtocolVersion(launchProfileProtocolVersion.orNull)
      .runContext(runContext.orNull)
      .script(script.orNull)
      .platform(platform.orNull)
      .build()
}
