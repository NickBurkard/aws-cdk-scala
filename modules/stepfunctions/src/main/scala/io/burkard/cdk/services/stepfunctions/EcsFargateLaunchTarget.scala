package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsFargateLaunchTarget {

  def apply(
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget =
    software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTarget.Builder
      .create()
      .platformVersion(platformVersion.orNull)
      .build()
}
