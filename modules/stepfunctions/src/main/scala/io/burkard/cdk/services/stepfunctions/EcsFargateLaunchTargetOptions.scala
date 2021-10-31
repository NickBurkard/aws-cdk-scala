package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsFargateLaunchTargetOptions {

  def apply(
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions.Builder)
      .platformVersion(platformVersion.orNull)
      .build()
}
