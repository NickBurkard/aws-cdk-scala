package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EcsApplicationProps {

  def apply(
    applicationName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.EcsApplicationProps =
    (new software.amazon.awscdk.services.codedeploy.EcsApplicationProps.Builder)
      .applicationName(applicationName.orNull)
      .build()
}
