package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaApplicationProps {

  def apply(
    applicationName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.LambdaApplicationProps =
    (new software.amazon.awscdk.services.codedeploy.LambdaApplicationProps.Builder)
      .applicationName(applicationName.orNull)
      .build()
}
