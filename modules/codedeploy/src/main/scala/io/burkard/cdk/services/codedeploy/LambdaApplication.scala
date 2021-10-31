package io.burkard.cdk.services.codedeploy

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LambdaApplication {

  def apply(
    internalResourceId: String,
    applicationName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.codedeploy.LambdaApplication =
    software.amazon.awscdk.services.codedeploy.LambdaApplication.Builder
      .create(stackCtx, internalResourceId)
      .applicationName(applicationName.orNull)
      .build()
}
