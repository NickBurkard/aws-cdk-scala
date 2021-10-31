package io.burkard.cdk.services.codebuild

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BuildStatusConfigProperty {

  def apply(
    context: Option[String] = None,
    targetUrl: Option[String] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.BuildStatusConfigProperty.Builder)
      .context(context.orNull)
      .targetUrl(targetUrl.orNull)
      .build()
}
