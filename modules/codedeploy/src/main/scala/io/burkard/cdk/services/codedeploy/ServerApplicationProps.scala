package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServerApplicationProps {

  def apply(
    applicationName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.ServerApplicationProps =
    (new software.amazon.awscdk.services.codedeploy.ServerApplicationProps.Builder)
      .applicationName(applicationName.orNull)
      .build()
}
