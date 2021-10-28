package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcsApplicationProps {

  def apply(
    applicationName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.EcsApplicationProps =
    (new software.amazon.awscdk.services.codedeploy.EcsApplicationProps.Builder)
      .applicationName(applicationName.orNull)
      .build()
}
